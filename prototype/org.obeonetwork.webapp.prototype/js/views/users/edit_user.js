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
	var EditUser = Backbone.View.extend({
		el: $("#container"),
		render: function(userID){
			var self = this;
			self.el.addClass('container').removeClass('main-banner');
			this.el.html('<b>Edit user:</b> ' + userId);
			
			$('.active').removeClass('active');
			$('#users-tab').addClass('active');
		}
	});
	return new EditUser;
});
