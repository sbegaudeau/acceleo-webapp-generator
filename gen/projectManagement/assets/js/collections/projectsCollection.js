/** All Rights Reserved **/

var ProjectManagement = ProjectManagement || {};
ProjectManagement.ProjectsCollection = Backbone.Collection.extend({
	model: ProjectManagement.Project,
	localStorage: new Store("projectManagement.projectsCollection")
	/* Start of user code additional features */
	/*End of user code*/
});
