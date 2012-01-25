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

define(['jQuery','Underscore','Backbone'], function($, _, Backbone){
	var Project = Backbone.Model.extend({
		defaults: {
			name: 'Project Name',
			users: []
		},
		initialize: function(){
			
		},
		setName: function(newName){
			this.set({name: newName});
		},
		addUser: function(user){
			var users_array = this.get("users");
			users_array.push(user);
			this.set({users: users_array});
		},
		removeUser: function(user){
			var users_array = this.get("users");
			for(var i=0; i < users_array.length; i++){ 
				if(users_array[i] == user){
					users_array.splice(i,1);
				}
			}
			this.set({users: users_array});
		}
	});
	return new Project;
});
