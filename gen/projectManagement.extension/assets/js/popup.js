/** All Rights Reserved **/

$().ready(function() {
	var openLink = function(e){
		var internal = $(this).data("internal");
		var link = this.attributes["href"].value;
		
		if (internal) {
			$.get(link, function(page) {
				var x = chrome.extension.getViews({type:"popup"});
				if (x.length>0) {
					if(link === 'templates/projectsCollection.html') {
						chrome.tabs.getSelected(null, function(tab) {
							chrome.tabs.sendRequest(tab.id, {greeting: "projectsCollection"}, function(response) {
								console.log(response);
								var dialogTemplate = _.template(page, {
									dialogColumnNames: ['Name'],
									dialogColumnWidths: [4],
									attributesToConsider: ['name'],
									dialogObjects: _.toArray(response.projectsCollection)
								});
								page = dialogTemplate;
								$(x[0].document.body).html(page);
								$(x[0].document.body).find("a").bind("click", openLink);
							});
						});						
					}
					else if(link === 'templates/usersCollection.html') {
						chrome.tabs.getSelected(null, function(tab) {
							chrome.tabs.sendRequest(tab.id, {greeting: "usersCollection"}, function(response) {
								console.log(response);
								var dialogTemplate = _.template(page, {
									dialogColumnNames: ['First Name', 'Last Name', 'Age'],
									dialogColumnWidths: [10, 9, 3],
									attributesToConsider: ['firstName', 'lastName', 'age'],
									dialogObjects: _.toArray(response.usersCollection)
								});
								page = dialogTemplate;
								$(x[0].document.body).html(page);
								$(x[0].document.body).find("a").bind("click", openLink);
							});
						});						
					}
					else if(link === 'templates/languagesCollection.html') {
						chrome.tabs.getSelected(null, function(tab) {
							chrome.tabs.sendRequest(tab.id, {greeting: "languagesCollection"}, function(response) {
								console.log(response);
								var dialogTemplate = _.template(page, {
									dialogColumnNames: ['Name'],
									dialogColumnWidths: [4],
									attributesToConsider: ['name'],
									dialogObjects: _.toArray(response.languagesCollection)
								});
								page = dialogTemplate;
								$(x[0].document.body).html(page);
								$(x[0].document.body).find("a").bind("click", openLink);
							});
						});						
					}
					else {
						$(x[0].document.body).html(page);
						$(x[0].document.body).find("a").bind("click", openLink);
					}
				}
			});
		
		} else {
			var properties = {};
			properties["url"] = link;
			chrome.tabs.create(properties, null);
		}
		return false;
	}
	
	$("a").bind("click", openLink);
});
