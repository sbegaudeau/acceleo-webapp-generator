/** All Rights Reserved **/

debugger;
var ProjectManagement = ProjectManagement || {};

String.prototype.endsWith = function(suffix) {
    return this.indexOf(suffix, this.length - suffix.length) !== -1;
};

chrome.extension.onRequest.addListener(function(request, sender, sendResponse) {
	ProjectManagement.projectsCollection = new ProjectManagement.ProjectsCollection();
	ProjectManagement.usersCollection = new ProjectManagement.UsersCollection();
	ProjectManagement.languagesCollection = new ProjectManagement.LanguagesCollection();

	ProjectManagement.projectsCollection.fetch();
	ProjectManagement.usersCollection.fetch();
	ProjectManagement.languagesCollection.fetch();
	
	console.log(sender.tab ? "from a content script:" + sender.tab.url : "from the extension");
	if (request.greeting === "projectsCollection") {
		sendResponse({
			"projectsCollection": _.toArray(ProjectManagement.projectsCollection)
		});
	}
	else if (request.greeting === "usersCollection") {
		sendResponse({
			"usersCollection": _.toArray(ProjectManagement.usersCollection)
		});
	}
	else if (request.greeting === "languagesCollection") {
		sendResponse({
			"languagesCollection": _.toArray(ProjectManagement.languagesCollection)
		});
	}
	else {
		sendResponse({}); // snub them.
	}
});
