/** All Rights Reserved **/

var ProjectManagement = ProjectManagement || {};
ProjectManagement.Language = Backbone.Model.extend({
	defaults: {
		name: "Default language"
		/* Start of user code additional attributes or references */
		/* End of user code */
	},
	initialize: function(){
		this.name = this.get('name');
		/* Start of user code additional initializations */
		/* End of user code */
	}
	/* Start of user code additional functions */
	/* End of user code */
});

