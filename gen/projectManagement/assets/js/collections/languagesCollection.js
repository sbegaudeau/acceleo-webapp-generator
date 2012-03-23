/** All Rights Reserved **/

var ProjectManagement = ProjectManagement || {};
ProjectManagement.LanguagesCollection = Backbone.Collection.extend({
	model: ProjectManagement.Language,
	localStorage: new Store("projectManagement.languagesCollection")
	/* Start of user code additional features */
	/*End of user code*/
});
