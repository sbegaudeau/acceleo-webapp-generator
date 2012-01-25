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
				if (templates.length === 1) {
					var tableTemplate = _.template($(templates[0]).html(), {columnNames: ['First Name', 'Last Name', 'Age', 'Email', 'Projects'], objects: _.toArray(UsersCollection)});
					self.el.addClass('container').removeClass('main-banner');
					self.el.html(tableTemplate);
					self.el.find('input').each(function(i, elem){
						$(elem).hide();
					});
					
					$('.editable').each(function(i, elem) {
						$(elem).bind('click', function(){
							var currentValue = $(elem).html();
							$(elem).html('<input class="large" size="30" type="text" />');
							
							var firstChild = $(elem).children(':first-child')[0];
							firstChild.focus();
							$(firstChild).keypress(function(e){
								if(e.which == 13) {
									newName = firstChild.value;
									$(elem).html(newName);
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
