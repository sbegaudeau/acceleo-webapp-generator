/** All Rights Reserved **/

var ProjectManagement = ProjectManagement || {};
ProjectManagement.UsersCollection = Backbone.Collection.extend({
	model: ProjectManagement.User,
	localStorage: new Store("projectManagement.usersCollection")
	/* Start of user code additional features */
	/*End of user code*/
});
