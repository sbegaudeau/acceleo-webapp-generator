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
EclipseCon.AppRouter = Backbone.Router.extend({
	routes: {
		'!/login': 'showLogin',
		'!/home': 'showMain',
		'!/dashboard': 'showDashboard',
		'!/projects': 'showProjects',
		'!/users': 'showUsers',
		'!/languages': 'showLanguages',
		'!/about': 'showAbout',
		'*pageId': 'defaultAction'
	},
	showLogin: function(){
		var login = new EclipseCon.Login();
		login.render();
	},
	showMain: function(){
		var main = new EclipseCon.Main();
		main.render();
	},
	showDashboard: function(){
		var dashboard = EclipseCon.Dashboard();
		dashboard.render();
	},
	showProjects: function(){
		var listProjects = new EclipseCon.ListProjects();
		listProjects.render();
	},
	showUsers: function(){
		var listUsers = new EclipseCon.ListUsers();
		listUsers.render();
	},
	showLanguages: function(){
		var listLanguages = new EclipseCon.ListLanguages();
		listLanguages.render();
	},
	showAbout: function(){
		var about = EclipseCon.About();
		about.render();
	},
	defaultAction: function(pageId){
		if (pageId.length === 0) {
			var main = new EclipseCon.Main();
			main.render();
		} else {				
			var error = new EclipseCon.Error(); 
			error.render(pageId);
		}
	}
});

EclipseCon.router = new EclipseCon.AppRouter();
Backbone.history.start();

