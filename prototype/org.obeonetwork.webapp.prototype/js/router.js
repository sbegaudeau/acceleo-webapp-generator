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

define(['jQuery',
        'Underscore',
        'Backbone',
        'views/home/login',
        'views/home/main',
        'views/error/error',
        'views/dashboard/dashboard',
        'views/projects/edit_project',
        'views/projects/list_projects',
        'views/users/edit_user',
        'views/users/list_users',
        'views/misc/about',
        'views/misc/contact'
], function($, _, Backbone, Login, Main, Error, Dashboard, EditProject, ListProjects, EditUser, ListUsers, About, Contact){
	var AppRouter = Backbone.Router.extend({
		routes: {
			'!/login': 'showLogin',
			'!/home': 'showMain',
			'!/dashboard': 'showDashboard',
			'!/projects': 'showProjects',
			'!/projects/:projectId': 'editProject',
			'!/users': 'showUsers',
			'!/users/:userId': 'editUser',
			'!/about': 'showAbout',
			'!/contact': 'showContact',
			'*pageId': 'defaultAction'
		},
		showLogin: function(){
			Login.render();
		},
		showMain: function(){
			Main.render();
		},
		showDashboard: function(){
			Dashboard.render();
		},
		showProjects: function(){
			ListProjects.render();
		},
		editProject: function(projectId){
			EditProject.render(projectId);
		},
		showUsers: function(){
			ListUsers.render();
		},
		editUser: function(userId){
			EditUser.render(userId);
		},
		showAbout: function(){
			About.render();
		},
		showContact: function(){
			Contact.render();
		},
		defaultAction: function(pageId){
			if (pageId.length == 0) {
				Main.render();
			} else {				
				Error.render(pageId); 
			}
		}
	});
	
	var initialize = function(){
		var app_router = new AppRouter;
		Backbone.history.start();
	};
	
	return {
		initialize: initialize
	};
});
