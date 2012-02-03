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
        'views/projects/list_projects',
        'views/users/list_users',
        'views/misc/about',
        'views/misc/contact'
], function($, _, Backbone, Login, Main, Error, Dashboard, ListProjects, ListUsers, About, Contact){
	var AppRouter = Backbone.Router.extend({
		routes: {
			'!/login': 'showLogin',
			'!/home': 'showMain',
			'!/dashboard': 'showDashboard',
			'!/projects': 'showProjects',
			'!/users': 'showUsers',
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
		showUsers: function(){
			ListUsers.render();
		},
		showAbout: function(){
			About.render();
		},
		showContact: function(){
			Contact.render();
		},
		defaultAction: function(pageId){
			if (pageId.length === 0) {
				Main.render();
			} else {				
				Error.render(pageId); 
			}
		}
	});
	
	var initialize = function(){
		var app_router = new AppRouter();
		Backbone.history.start();
	};
	
	return {
		initialize: initialize
	};
});
