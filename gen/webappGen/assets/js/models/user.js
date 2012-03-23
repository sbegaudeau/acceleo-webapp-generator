/** All Rights Reserved **/

var Webapp = Webapp || {};
Webapp.User = Backbone.Model.extend({
	defaults: {
		firstName: "First name",
		lastName: "Last name",
		age: 21,
		notes: []
		/* Start of user code additional attributes or references */
		/* End of user code */
	},
	initialize: function(){
		this.age = this.get('age');
		this.notes = this.get('notes');
		this.lastName = this.get('lastName');
		this.firstName = this.get('firstName');
		/* Start of user code additional initializations */
		/* End of user code */
	}
	/* Start of user code additional functions */
	/* End of user code */
});

