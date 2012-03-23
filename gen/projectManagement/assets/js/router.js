/** All Rights Reserved **/

var ProjectManagement = ProjectManagement || {};
ProjectManagement.Router = Backbone.Router.extend({
	routes: {
		'!/home': 'showHome',
		'!/projects': 'showProjects',
		'!/users': 'showUsers',
		'!/languages': 'showLanguages',
		'*pageId': 'defaultAction'
	},
	showHome: function(){
		var home = new ProjectManagement.Home();
		home.render();
	},
	showProjects: function(){
		var projects = new ProjectManagement.Projects();
		projects.render();
	},
	showUsers: function(){
		var users = new ProjectManagement.Users();
		users.render();
	},
	showLanguages: function(){
		var languages = new ProjectManagement.Languages();
		languages.render();
	},
	/* Start of user code additional routes */
	/* End of user code */
	defaultAction: function(pageId){
		if (pageId.length === 0) {
			var home = new ProjectManagement.Home();
			home.render();
		}
	}
});

ProjectManagement.router = new ProjectManagement.Router();
Backbone.history.start();

