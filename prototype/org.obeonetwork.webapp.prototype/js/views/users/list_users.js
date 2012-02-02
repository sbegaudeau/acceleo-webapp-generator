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

define(['jQuery','Underscore','Backbone', '../../collections/users_collection'], function($, _, Backbone, UsersCollection){
	var ListUsers = Backbone.View.extend({
		el: $("#container"),
		render: function(){
			var self = this;
			$.get('templates/table.html', function(page) {
				var templates = $(page).filter('#table-template');
				if (templates.length == 1) {
					UsersCollection.fetch();
					
					var tableTemplate = _.template($(templates[0]).html(), {
						columnNames: ['First Name', 'Last Name', 'Age', 'Email', 'Projects'],
						columnWidths: [20, 20, 5, 15, 40],
						attributesToConsider: ['firstName', 'lastName', 'age', 'email', 'projects'],
						objects: _.toArray(UsersCollection)
					});
					self.el.addClass('container').removeClass('main-banner');
					self.el.html(tableTemplate);
					self.el.find('input').each(function(i, elem){
						$(elem).hide();
					});

					
					$('.editable').each(function(i, elem) {						
						$(elem).bind('click', function(){
							currentValue = '';
							if (elem.childNodes.length == 1) {
								if (elem.childNodes[0] instanceof Text) {									
									currentValue = $(elem).html();
								}
							}
							data_attribute_name = $(elem).data('attribute-name');
							if (data_attribute_name == 'firstName') {								
								$(elem).html('<input class="large" size="30" type="text"/>');
								if (currentValue.length > 0) {
									elem.childNodes[0].value = currentValue;
								}
							} else if (data_attribute_name == 'lastName') {
								$(elem).html('<input class="large" size="30" type="text"/>');
								if (currentValue.length > 0) {
									elem.childNodes[0].value = currentValue;
								}
							} else if (data_attribute_name == 'age') {
								
							} else if (data_attribute_name == 'email') {
								$(elem).html('<input class="large" size="30" type="text"/>');
								if (currentValue.length > 0) {
									elem.childNodes[0].value = currentValue;
								}
							} else if (data_attribute_name == 'projects') {
								
							}
							
							firstChild = $(elem).children(':first-child')[0];
							firstChild.focus();
							$(firstChild).keypress(function(e){
								if(e.which == 13) {
									newValue = firstChild.value;
									$(elem).html(newValue);
									data_num = $(elem).data('num');
									data_attribute_name = $(elem).data('attribute-name');
									model = UsersCollection.at(data_num);
									var valueToSet = {};
									valueToSet[data_attribute_name] = newValue;
									model.save(valueToSet);
								}
							});
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
