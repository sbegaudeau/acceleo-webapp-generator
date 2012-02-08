/********************************************************************************
** Copyright (c) 2012 Obeo.
** All rights reserved. This program and the accompanying materials
** are made available under the terms of the Eclipse Public License v1.0
** which accompanies this distribution, and is available at
** http://www.eclipse.org/legal/epl-v10.html
**
** Contributors:
**    Stephane Begaudeau (Obeo) - initial API and implementation
*********************************************************************************/

$().ready(function() {
	var openLink = function(e){
		var internal = $(this).data("internal");
		var link = this.attributes["href"].value;
		
		if (internal) {
			$.get(link, function(page) {
				var x = chrome.extension.getViews({type:"popup"});
				if (x.length>0) {
					if (link === 'pages/languages/languages.html') {
						chrome.tabs.getSelected(null, function(tab) {
							chrome.tabs.sendRequest(tab.id, {greeting: "languages"}, function(response) {
								console.log(response);
								var dialogTemplate = _.template(page, {
									dialogColumnNames: ['Name'],
									dialogColumnWidths: [100],
									attributesToConsider: ['name'],
									dialogObjects: _.toArray(response.languages)
								});
								page = dialogTemplate;
								$(x[0].document.body).html(page);
								$(x[0].document.body).find("a").bind("click", openLink);
							});
						});						
					} else if (link === 'pages/users/users.html') {
						chrome.tabs.getSelected(null, function(tab) {
							chrome.tabs.sendRequest(tab.id, {greeting: "users"}, function(response) {
								console.log(response);
								var dialogTemplate = _.template(page, {
									dialogColumnNames: ['First Name', 'Last Name', 'Age'],
									dialogColumnWidths: [40, 40, 20],
									attributesToConsider: ['firstName', 'lastName', 'age'],
									dialogObjects: _.toArray(response.users)
								});
								page = dialogTemplate;
								$(x[0].document.body).html(page);
								$(x[0].document.body).find("a").bind("click", openLink);
							});
						});	
					} else if (link === 'pages/projects/projects.html') {
						chrome.tabs.getSelected(null, function(tab) {
							chrome.tabs.sendRequest(tab.id, {greeting: "projects"}, function(response) {
								console.log(response);
								var dialogTemplate = _.template(page, {
									dialogColumnNames: ['Name'],
									dialogColumnWidths: [100],
									attributesToConsider: ['name'],
									dialogObjects: _.toArray(response.projects)
								});
								page = dialogTemplate;
								$(x[0].document.body).html(page);
								$(x[0].document.body).find("a").bind("click", openLink);
							});
						});	
					} else {
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