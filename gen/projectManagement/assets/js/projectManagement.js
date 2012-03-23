/** All Rights Reserved **/

var ProjectManagement = ProjectManagement || {};

ProjectManagement.projectsCollection = new ProjectManagement.ProjectsCollection();
ProjectManagement.usersCollection = new ProjectManagement.UsersCollection();
ProjectManagement.languagesCollection = new ProjectManagement.LanguagesCollection();

ProjectManagement.projectsCollection.fetch();
ProjectManagement.usersCollection.fetch();
ProjectManagement.languagesCollection.fetch();
/* Start of user code additional features */
/*End of user code*/
