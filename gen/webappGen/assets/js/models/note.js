/** All Rights Reserved **/

var Webapp = Webapp || {};
Webapp.Note = Backbone.Model.extend({
	defaults: {
		description: "Default description",
		users: []
		/* Start of user code additional attributes or references */
		/* End of user code */
	},
	initialize: function(){
		this.users = this.get('users');
		this.description = this.get('description');
		/* Start of user code additional initializations */
		/* End of user code */
	}
	/* Start of user code additional functions */
	/* End of user code */
});

