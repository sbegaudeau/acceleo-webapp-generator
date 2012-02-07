/********************************************************************************
** Copyright (c) 2012 Obeo.
** All rights reserved. This program and the accompanying materials
** are made available under the terms of the Eclipse Public License v1.0
** which accompanies this distribution, and is available at
** http://www.eclipse.org/legal/epl-v10.html
**
** Contributors:
**    Stephane Begaudeau (Obeo) - initial API and implementation
*********************************************************************************/

var EclipseCon = EclipseCon || {};
EclipseCon.ListProjects = Backbone.View.extend({
	el: $("#container"),
	render: function(){
		var self = this;
		$.get('templates/table.html', function(page) {
			var templates = $(page).filter('#table-template');
			var templates_dialog = $(page).filter('#dialog-template');
			if (templates.length === 1 && templates_dialog.length === 1) {
				var tableTemplate = _.template($(templates[0]).html(), {
					columnNames: ['Name', 'Languages', 'Users'],
					columnWidths: [25, 25, 50],
					attributesToConsider: ['name', 'languages', 'users'],
					attributesToLinkWithPlaceholder: {'languages': EclipseCon.languages, 'users': EclipseCon.users},
					linkedAttributesMapping: {'languages': 'name', 'users': 'firstName'},
					objects: _.toArray(EclipseCon.projects)
				});
				self.el.addClass('container').removeClass('main-banner');
				self.el.html(tableTemplate);
				self.el.find('input').each(function(i, elem){
					if ($(elem).attr('name') !== 'checkBoxDelete') {
						$(elem).hide();
					}
				});
				
				$('.editable').each(function(i, elem) {
					$(elem).bind('click', function(){
						var currentValue = '';
						if (elem.childNodes.length === 1) {
							if (elem.childNodes[0] instanceof Text) {									
								currentValue = $(elem).html();
							}
						}
						var data_attribute_name = $(elem).data('attribute-name');
						if (data_attribute_name === 'name') {								
							$(elem).html('<input class="large" size="30" type="text"/>');
							if (currentValue.length > 0) {
								elem.childNodes[0].value = currentValue;
							}
						}
						
						var firstChild = $(elem).children(':first-child')[0];
						firstChild.focus();
						$(firstChild).keypress(function(e){
							if(e.which === 13) {
								var newValue = firstChild.value;
								$(elem).html(newValue);
								var data_num = $(elem).data('num');
								var data_attribute_name = $(elem).data('attribute-name');
								var model = EclipseCon.projects.at(data_num);
								var valueToSet = {};
								valueToSet[data_attribute_name] = newValue;
								model.save(valueToSet);
							}
						});
					});
				});
				$('#new-btn').bind('click', function(){
					EclipseCon.projects.create(new EclipseCon.Project());
					EclipseCon.router.showProjects();
					return false;
				});
				$('#delete-btn').bind('click', function(){
					var modelArray = [];
					var i = 0;
					$('input').each(function(index, elem) {
						if ($(elem).attr('name') === 'checkBoxDelete' && elem.checked === true) {
							var data_num = $(elem).data('num');
							var model = EclipseCon.projects.at(data_num);
							modelArray[i] = model;
							i = i + 1;
						}
					});

					$(_.toArray(EclipseCon.users)).each(function(i, elem){
						$(elem.get('projects')).each(function(j, proj){
							if (_.include(_.map(modelArray, function(deletedProj){return deletedProj.id;}), proj)) {
								var newProjectIds = _.without(elem.get('projects'), proj);
								elem.save({'projects': newProjectIds});
							}
						});
					});
					
					for (var c = 0; c < modelArray.length; c++) {
						var model =	modelArray[c];
						var valueToReset = {};
						valueToReset['users'] = [];
						model.set(valueToReset);
						model.destroy();
					}
					
					
					EclipseCon.router.showProjects();
					return false;
				});
				$('.link-placeholder').bind('click', function(){
					var index = $(this.parentNode).data('num');
					var project = EclipseCon.projects.at(index);
					var target = $(this).attr('href');
					$(target).find('.title').each(function(i, elem) {
						if (target === '#users') {
							$(elem).html('Users');
							var dialogTemplate = _.template($(templates_dialog[0]).html(), {
								dialogColumnNames: ['First Name', 'Last Name'],
								dialogColumnWidths: [50, 50],
								attributesToConsider: ['firstName', 'lastName'],
								dialogObjects: _.toArray(EclipseCon.users),
								objectsToSelect: _.toArray(_.filter(_.toArray(EclipseCon.users), function(val){
																var userIds = project.get('users');
																var found = false;
																_.each(userIds, function(userId){
																	if (userId === val.id) {
																		found = true;
																	}
																});																
																return found;
															}))
							});
							$(target).find('.modal-body').each(function(j, element){
								$(element).html(dialogTemplate);
							});
							$(target).find('.dialogSave').each(function(j, element){
								$(element).bind('click', function() {
									var modelArray = [];
									var i = 0;
									$('input').each(function(index, elem) {
										if ($(elem).attr('name') === 'checkBoxDeleteDialog' && elem.checked === true) {
											var data_num = $(elem).data('num');
											var model = EclipseCon.users.at(data_num);
											modelArray[i] = model.id;
											i = i + 1;
										}
									});
									
									var valueToSet = {};
									valueToSet['users'] = modelArray;
									project.save(valueToSet);
									
									$(_.toArray(EclipseCon.users)).each(function(i, elem){
										if(_.include(modelArray, elem.id)) {
											var projectIds = elem.get('projects');
											if (!(_.include(projectIds, project.id))) {												
												projectIds.push(project.id);
												elem.save({'projects': projectIds});
											}
										} else {
											elem.save({'projects': _.without(elem.get('projects'), project.id)});
										}
									});
									
									EclipseCon.router.showProjects();
								});
							});
						} else if (target === '#languages') {
							$(elem).html('Languages');
							var dialogTemplate = _.template($(templates_dialog[0]).html(), {
								dialogColumnNames: ['Name'],
								dialogColumnWidths: [100],
								attributesToConsider: ['name'],
								dialogObjects: _.toArray(EclipseCon.languages),
								objectsToSelect: _.toArray(_.filter(_.toArray(EclipseCon.languages), function(val){
																var languageIds = project.get('languages');
																var found = false;
																_.each(languageIds, function(languageId){
																	if (languageId === val.id) {
																		found = true;
																	}
																});																
																return found;
															}))
							});
							$(target).find('.modal-body').each(function(j, element){
								$(element).html(dialogTemplate);
							});
							$(target).find('.dialogSave').each(function(j, element){
								$(element).bind('click', function() {
									var modelArray = [];
									var i = 0;
									$('input').each(function(index, elem) {
										if ($(elem).attr('name') === 'checkBoxDeleteDialog' && elem.checked === true) {
											var data_num = $(elem).data('num');
											var model = EclipseCon.languages.at(data_num);
											modelArray[i] = model.id;
											i = i + 1;
										}
									});
									
									var valueToSet = {};
									valueToSet['languages'] = modelArray;
									project.save(valueToSet);
									EclipseCon.router.showProjects();
								});
							});
						}
					});
				});
			}
		});
		
		$('.active').removeClass('active');
		$('#projects-tab').addClass('active');
	}
});
