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
	var User = Backbone.Model.extend({
		defaults: {
			firstName: 'First Name',
			lastName: 'Last Name',
			age: '0',
			email: 'email@provider.com',
			projects: []
		},
		initialize: function(){
			
		},
		setFirstName: function(newFirstName){
			this.set({firstName: newFirstName});
		},
		setLastName: function(newLastName){
			this.set({lastName: newLastName});
		},
		setAge: function(newAge){
			this.set({age: newAge});
		},
		setEmail: function(newEmail){
			this.set({email: newEmail});
		},
		addProject: function(project){
			var projects_array = this.get("projects");
			projects_array.push(project);
			this.set({projects: projects_array});
		},
		removeProject: function(project){
			var projects_array = this.get("projects");
			for(var i=0; i < projects_array.length; i++){ 
				if(projects_array[i] == project){
					projects_array.splice(i,1);
				}
			}
			this.set({projects: projects_array});
		}
	});
	return new User;
});
