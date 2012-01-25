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

define(['jQuery','Underscore','Backbone', '../models/user'], function($, _, Backbone, User){
	var UsersCollection = Backbone.Collection.extend({
		model: User
	});
	
	var usersCollection = new UsersCollection
	var firstUser = User;
	firstUser.setFirstName("User First Name");
	firstUser.setLastName("User Last Name");
	firstUser.setAge(21);
	firstUser.setEmail("username@eclipse.org");
	usersCollection.add(firstUser);
	
	return usersCollection;
});