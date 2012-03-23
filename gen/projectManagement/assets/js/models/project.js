/** All Rights Reserved **/

var ProjectManagement = ProjectManagement || {};
ProjectManagement.Project = Backbone.Model.extend({
	defaults: {
		name: "default project name",
		languages: [],
		users: []
		/* Start of user code additional attributes or references */
		/* End of user code */
	},
	initialize: function(){
		this.users = this.get('users');
		this.name = this.get('name');
		this.languages = this.get('languages');
		/* Start of user code additional initializations */
		/* End of user code */
	}
	/* Start of user code additional functions */
	/* End of user code */
});

