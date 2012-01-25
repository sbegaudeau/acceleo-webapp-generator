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
	var Main = Backbone.View.extend({
		el: $("#container"),
		render: function(){
			var self = this;
			$.get('templates/home/main.html', function(page) {
				var templates = $(page).filter('#main-template');
				if (templates.length == 1) {
					var mainBannerTemplate = _.template($(templates[0]).html());
					self.el.html(mainBannerTemplate());
					self.el.removeClass('container').addClass('main-banner');
										
					self.clearFormStates('#lInputName');
					self.clearFormStates('#lInputEmail');
					self.clearFormStates('#lInputPassword');
				}
				$('#main_form').bind('submit', function() {
					return self.mainFormSubmit();
				});
			});
			
						
			$('.active').removeClass('active');
			$('#home-tab').addClass('active');
		},
		mainFormSubmit: function(){
			this.clearFormStates('#lInputName');
			this.clearFormStates('#lInputEmail');
			this.clearFormStates('#lInputPassword');
			
			var $form = $('#main_form');
			var name = $form.find('input[name="name"]').val();
			if (name.length == 0) {
				this.formLog('#lInputName', 'error', 'Name required.');
			} else {
				this.formLog('#lInputName', 'success', '');
			}
			var email = $form.find('input[name="email"]').val();
			if (email.length == 0) {
				this.formLog('#lInputEmail', 'error', 'Email required.');
			} else {
				this.formLog('#lInputEmail', 'success', '');
			}
			var password = $form.find('input[name="password"]').val();
			if (password.length == 0) {
				this.formLog('#lInputPassword', 'error', 'Password required.');
			} else {
				this.formLog('#lInputPassword', 'success', '');
			}
			
			console.log('Welcome ' + name);
			
			return false;
		},
		formLog: function(elem, state, message) {
			$(elem).addClass(state);
			$(elem).parent().find('.help-inline').html(message);
			$(elem).parent('.input').parent('.clearfix').addClass(state);
		},
		clearFormStates: function(elem) {
			$(elem).removeClass('error');
			$(elem).removeClass('success');
			$(elem).removeClass('warning');
			$(elem).parent().find('.help-inline').html('');
			$(elem).parent('.input').parent('.clearfix').removeClass('error');
			$(elem).parent('.input').parent('.clearfix').removeClass('success');
			$(elem).parent('.input').parent('.clearfix').removeClass('warning');
		}
	});
	return new Main;
});
