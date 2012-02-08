debugger;
var EclipseCon = EclipseCon || {};

chrome.extension.onRequest.addListener(function(request, sender, sendResponse) {
	EclipseCon.languages = new EclipseCon.LanguagesCollection();
	EclipseCon.users = new EclipseCon.UsersCollection();
	EclipseCon.projects = new EclipseCon.ProjectsCollection();
	
	EclipseCon.languages.fetch();
	EclipseCon.users.fetch();
	EclipseCon.projects.fetch();
	
	console.log(sender.tab ? "from a content script:" + sender.tab.url : "from the extension");
	if (request.greeting === "languages") {
		sendResponse({
			"languages": _.toArray(EclipseCon.languages)
		});
	} else if (request.greeting === "users") {
		sendResponse({
			"users": _.toArray(EclipseCon.users)
		});
	} else if (request.greeting === "projects") {
		sendResponse({
			"projects": _.toArray(EclipseCon.projects)
		});
	} else {
		sendResponse({}); // snub them.
	}
});
