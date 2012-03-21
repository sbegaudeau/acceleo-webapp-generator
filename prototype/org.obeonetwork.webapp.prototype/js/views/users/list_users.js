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
EclipseCon.ListUsers = Backbone.View.extend({
	el: $("#container"),
	render: function(){
		var self = this;
		$.get('templates/table.html', function(page) {
			var templates = $(page).filter('#table-template');
			var templates_dialog = $(page).filter('#dialog-template');
			if (templates.length === 1 && templates_dialog.length === 1) {
				var tableTemplate = _.template($(templates[0]).html(), {
					columnNames: ['First Name', 'Last Name', 'Age', 'Projects', 'Languages'],
					columnWidths: [15, 15, 5, 35, 30],
					attributesToConsider: ['firstName', 'lastName', 'age', 'projects', 'languages'],
					attributesToLinkWithPlaceholder: {'projects': EclipseCon.projects, 'languages': EclipseCon.languages},
					linkedAttributesMapping: {'projects': 'name', 'languages': 'name'},
					objects: _.toArray(EclipseCon.users)
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
						if (data_attribute_name === 'firstName') {								
							$(elem).html('<input class="large" size="30" type="text"/>');
							if (currentValue.length > 0) {
								elem.childNodes[0].value = currentValue;
							}
						} else if (data_attribute_name === 'lastName') {
							$(elem).html('<input class="large" size="30" type="text"/>');
							if (currentValue.length > 0) {
								elem.childNodes[0].value = currentValue;
							}
						} else if (data_attribute_name === 'age') {
							if ($(elem).children(':first-child')[0] === undefined) {
								$(elem).html('<input type="number" name="age" id="age" min="18" max="120" step="1" value="18">');
								if (currentValue.length > 0) {
									elem.childNodes[0].value = currentValue;
								}
							}
						} else if (data_attribute_name === 'projects') {
						} else if (data_attribute_name === 'languages') {
						}
						
						var firstChild = $(elem).children(':first-child')[0];
						firstChild.focus();
						$(firstChild).keypress(function(e){
							if(e.which === 13) {
								var newValue = firstChild.value;
								$(elem).html(newValue);
								var data_num = $(elem).data('num');
								var data_attribute_name = $(elem).data('attribute-name');
								var model = EclipseCon.users.at(data_num);
								var valueToSet = {};
								valueToSet[data_attribute_name] = newValue;
								model.save(valueToSet);
							}
						});
					});
				});
				$('#new-btn').bind('click', function(){
					EclipseCon.users.create(new EclipseCon.User());
					webkitNotifications.requestPermission(function() {
						var permission = webkitNotifications.checkPermission();
						if (permission === 0) {
							var notification = webkitNotifications.createNotification('images/acceleo.png', 'Project Management', 'New user created');
							notification.show();
						}
					});
					EclipseCon.router.showUsers();
					return false;
				});
				$('#delete-btn').bind('click', function(){
					var modelArray = [];
					var i = 0;
					$('input').each(function(index, elem) {
						if ($(elem).attr('name') === 'checkBoxDelete' && elem.checked === true) {
							var data_num = $(elem).data('num');
							var model = EclipseCon.users.at(data_num);
							modelArray[i] = model;
							i = i + 1;
						}
					});
					
					$(_.toArray(EclipseCon.projects)).each(function(i, elem){
						$(elem.get('users')).each(function(j, user){
							if (_.include(_.map(modelArray, function(deletedUser){return deletedUser.id;}), user)) {
								var newUserIds = _.without(elem.get('users'), user);
								elem.save({'users': newUserIds});
							}
						});
					});
					
					for (var c = 0; c < modelArray.length; c++) {
						var model =	modelArray[c];
						var valueToReset = {};
						valueToReset['projects'] = [];
						model.set(valueToReset);
						model.destroy();
					}
					
					EclipseCon.router.showUsers();
					return false;
				});
				$('.link-placeholder').bind('click', function(){
					var index = $(this.parentNode).data('num');
					var user = EclipseCon.users.at(index);
					var target = $(this).attr('href');
					$(target).find('.title').each(function(i, elem) {
						if (target === '#projects') {
							$(elem).html('Projects');
							var dialogTemplate = _.template($(templates_dialog[0]).html(), {
								dialogColumnNames: ['Name'],
								dialogColumnWidths: [100],
								attributesToConsider: ['name'],
								dialogObjects: _.toArray(EclipseCon.projects),
								objectsToSelect: _.toArray(_.filter(_.toArray(EclipseCon.projects), function(val){
																var projectIds = user.get('projects');
																var found = false;
																_.each(projectIds, function(projectId){
																	if (projectId === val.id) {
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
											var model = EclipseCon.projects.at(data_num);
											modelArray[i] = model.id;
											i = i + 1;
										}
									});
									
									var valueToSet = {};
									valueToSet['projects'] = modelArray;
									user.save(valueToSet);
									
									$(_.toArray(EclipseCon.projects)).each(function(i, elem){
										if(_.include(modelArray, elem.id)) {
											var userIds = elem.get('users');
											if (!(_.include(userIds, user.id))) {												
												userIds.push(user.id);
												elem.save({'users': userIds});
											}
										} else {
											elem.save({'users': _.without(elem.get('users'), user.id)});
										}
									});
									
									
									
									EclipseCon.router.showUsers();
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
																var languageIds = user.get('languages');
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
									user.save(valueToSet);
									EclipseCon.router.showUsers();
								});
							});
						}
					});
				});
			}
		});
		
		$('.active').removeClass('active');
		$('#users-tab').addClass('active');
	}
});
