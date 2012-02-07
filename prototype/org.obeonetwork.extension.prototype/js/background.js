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
function genericOnClick(info, tab) {
  console.log("item " + info.menuItemId + " was clicked");
  console.log("info: " + JSON.stringify(info));
  console.log("tab: " + JSON.stringify(tab));
}

var contexts = ["page","selection","link","editable","image","video","audio"];
for (var i = 0; i < contexts.length; i++) {
	var context = contexts[i];
	var title = "Test '" + context + "' menu item";
	var id = chrome.contextMenus.create({
		"title": title,
		"contexts":[context],
		"onclick": genericOnClick,
		"documentUrlPatterns": ["file:///*"]
	});
}