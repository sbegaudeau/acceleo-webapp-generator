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

define(['jQuery','Underscore','Backbone', '../../collections/users_collection', '../../collections/projects_collection'], function($, _, Backbone, UsersCollection, ProjectsCollection){
	var ListUsers = Backbone.View.extend({
		el: $("#container"),
		render: function(){
			var self = this;
			$.get('templates/table.html', function(page) {
				var templates = $(page).filter('#table-template');
				var templates_dialog = $(page).filter('#dialog-template');
				if (templates.length === 1 && templates_dialog.length === 1) {
					UsersCollection.fetch();
					
					var tableTemplate = _.template($(templates[0]).html(), {
						columnNames: ['First Name', 'Last Name', 'Age', 'Email', 'Projects'],
						columnWidths: [20, 20, 5, 15, 40],
						attributesToConsider: ['firstName', 'lastName', 'age', 'email', 'projects'],
						attributesToLinkWithPlaceholder: ['projects'],
						objects: _.toArray(UsersCollection)
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
								$(elem).html('<input type="number" name="age" id="age" min="18" max="120" step="1" value="18">');
								if (currentValue.length > 0) {
									elem.childNodes[0].value = currentValue;
								}
							} else if (data_attribute_name === 'email') {
								$(elem).html('<input class="large" size="30" type="text"/>');
								if (currentValue.length > 0) {
									elem.childNodes[0].value = currentValue;
								}
							} else if (data_attribute_name === 'projects') {
								
							}
							
							var firstChild = $(elem).children(':first-child')[0];
							firstChild.focus();
							$(firstChild).keypress(function(e){
								if(e.which === 13) {
									var newValue = firstChild.value;
									$(elem).html(newValue);
									var data_num = $(elem).data('num');
									var data_attribute_name = $(elem).data('attribute-name');
									var model = UsersCollection.at(data_num);
									var valueToSet = {};
									valueToSet[data_attribute_name] = newValue;
									model.save(valueToSet);
								}
							});
						});
					});
					$('#new-btn').bind('click', function(){
						UsersCollection.create({
							'firstName': 'firstName',
							'lastName': 'lastName',
							'age': '18',
							'email': 'email',
							'projects': []
						});
						ListUsers.prototype.render();
						return false;
					});
					$('#delete-btn').bind('click', function(){
						var modelArray = [];
						var i = 0;
						$('input').each(function(index, elem) {
							if ($(elem).attr('name') === 'checkBoxDelete' && elem.checked === true) {
								var data_num = $(elem).data('num');
								var model = UsersCollection.at(data_num);
								modelArray[i] = model;
								i = i + 1;
							}
						});
						
						for (var c = 0; c < modelArray.length; c++) {
							var model =	modelArray[c];
							model.destroy();
						}
						
						ListUsers.prototype.render();
						return false;
					});
					$('.link-placeholder').bind('click', function(){
						var index = $(this.parentNode).data('num');
						var user = UsersCollection.at(index);
						var target = $(this).attr('href');
						$(target).find('.title').each(function(i, elem) {
							if (target === '#projects') {
								$(elem).html('Projects');
								var dialogTemplate = _.template($(templates_dialog[0]).html(), {
									dialogColumnNames: ['Name'],
									dialogColumnWidths: [100],
									attributesToConsider: ['name'],
									dialogObjects: _.toArray(ProjectsCollection)
								});
								$(target).find('.modal-body').each(function(j, element){
									$(element).html(dialogTemplate);
								});
								$(target).find('.dialogSave').each(function(j, element){
									$(element).bind('click', function() {
										var modelArray = [];
										var i = 0;
										var currentModel = user.get('projects');
										$('input').each(function(index, elem) {
											if ($(elem).attr('name') === 'checkBoxDeleteDialog' && elem.checked === true) {
												var data_num = $(elem).data('num');
												var model = ProjectsCollection.at(data_num);
												modelArray[i] = model;
												i = i + 1;
											}
										});
										
										for (var c = 0; c < modelArray.length; c++) {
											var model =	modelArray[c];
											currentModel.push(model);
										}
										
										var valueToSet = {};
										valueToSet['projects'] = currentModel;
										user.save(valueToSet);
										ListUsers.prototype.render();
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
	return new ListUsers();
});
