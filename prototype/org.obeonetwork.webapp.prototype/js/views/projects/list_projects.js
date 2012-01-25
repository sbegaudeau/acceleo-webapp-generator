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

define(['jQuery','Underscore','Backbone', '../../collections/projects_collection'], function($, _, Backbone, ProjectsCollection){
	var ListProjects = Backbone.View.extend({
		el: $("#container"),
		render: function(){
			var self = this;
			$.get('templates/table.html', function(page) {
				var templates = $(page).filter('#table-template');
				if (templates.length == 1) {
					var tableTemplate = _.template($(templates[0]).html(), {columnNames: ['Name', 'Users'], objects: _.toArray(ProjectsCollection)});
					self.el.addClass('container').removeClass('main-banner');
					self.el.html(tableTemplate);
				}
			});
			
			$('.active').removeClass('active');
			$('#projects-tab').addClass('active');
		}
	});
	return new ListProjects;
});
