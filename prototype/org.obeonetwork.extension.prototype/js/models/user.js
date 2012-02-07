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

var EclipseCon = EclipseCon || {};
EclipseCon.User = Backbone.Model.extend({
	defaults: {
		firstName: 'First Name',
		lastName: 'Last Name',
		age: '18',
		projects: [],
		languages: []
	},
	initialize: function(){
		this.firstName = this.get('firstName');
		this.lastName = this.get('lastName');
		this.age = this.get('age');
		this.projects = this.get('projects');
		this.languages = this.get('languages');
	}
});
