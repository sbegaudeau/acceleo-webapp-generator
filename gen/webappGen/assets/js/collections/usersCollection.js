/** All Rights Reserved **/

var Webapp = Webapp || {};
Webapp.UsersCollection = Backbone.Collection.extend({
	model: Webapp.User,
	localStorage: new Store("webapp.usersCollection")
	/* Start of user code additional features */
	/*End of user code*/
});
