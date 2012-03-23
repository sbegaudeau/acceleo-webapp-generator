/** All Rights Reserved **/

var Webapp = Webapp || {};
Webapp.Router = Backbone.Router.extend({
	routes: {
		'!/home': 'showHome',
		'!/first': 'showFirstpage',
		'!/second': 'showSecondpage',
		'!/notes': 'showNoteView',
		'!/users': 'showUsersadmin',
		'*pageId': 'defaultAction'
	},
	showHome: function(){
		var home = new Webapp.Home();
		home.render();
	},
	showFirstpage: function(){
		var firstpage = new Webapp.Firstpage();
		firstpage.render();
	},
	showSecondpage: function(){
		var secondpage = new Webapp.Secondpage();
		secondpage.render();
	},
	showNoteView: function(){
		var noteView = new Webapp.NoteView();
		noteView.render();
	},
	showUsersadmin: function(){
		var usersadmin = new Webapp.Usersadmin();
		usersadmin.render();
	},
	/* Start of user code additional routes */
	/* End of user code */
	defaultAction: function(pageId){
		if (pageId.length === 0) {
			var home = new Webapp.Home();
			home.render();
		}
	}
});

Webapp.router = new Webapp.Router();
Backbone.history.start();

