/** All Rights Reserved **/

var ProjectManagement = ProjectManagement || {};
ProjectManagement.User = Backbone.Model.extend({
	defaults: {
		firstName: "default first name",
		lastName: "default last name",
		age: "21",
		projects: [],
		languages: []
		/* Start of user code additional attributes or references */
		/* End of user code */
	},
	initialize: function(){
		this.age = this.get('age');
		this.projects = this.get('projects');
		this.lastName = this.get('lastName');
		this.firstName = this.get('firstName');
		this.languages = this.get('languages');
		/* Start of user code additional initializations */
		/* End of user code */
	}
	/* Start of user code additional functions */
	/* End of user code */
});

