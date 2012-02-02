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

define(['jQuery','Underscore','Backbone', '../models/user', '../libs/backbone/backbone.localStorage'], function($, _, Backbone, User){
	var UsersCollection = Backbone.Collection.extend({
		model: User.Model,
		localStorage: new Store("org.eclipse.eclipsecon.webapp")
	});
	
	var usersCollection = new UsersCollection();
	return usersCollection;
});