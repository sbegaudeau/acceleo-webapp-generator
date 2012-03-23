var ProjectManagement = ProjectManagement || {};
ProjectManagement.Home = Backbone.View.extend({
	el: $("#container"),
	/* Start of user code custom template */
	render: function(){
		var self = this;
		var myEl = self.el;
		$.get('templates/home.html', function(page) {
			var templates = $(page).filter('#home-template');
			if (templates.length === 1) {
				var mainBannerTemplate = _.template($(templates[0]).html());
				$(self.el).html(mainBannerTemplate());
				$(self.el).removeClass('container').addClass('main-banner');
									
				self.clearFormStates('#lInputName');
				self.clearFormStates('#lInputEmail');
				self.clearFormStates('#lInputPassword');
				$('#main_form').bind('submit', function() {
					return self.mainFormSubmit();
				});
			}
		});
		$('.active').removeClass('active');
		$('#home-menu').addClass('active');
	},
	mainFormSubmit: function(){
		this.clearFormStates('#lInputName');
		this.clearFormStates('#lInputEmail');
		this.clearFormStates('#lInputPassword');
		
		var $form = $('#main_form');
		var name = $form.find('input[name="name"]').val();
		if (name.length === 0) {
			this.formLog('#lInputName', 'error', 'Name required.');
		} else {
			this.formLog('#lInputName', 'success', '');
		}
		var email = $form.find('input[name="email"]').val();
		if (email.length === 0) {
			this.formLog('#lInputEmail', 'error', 'Email required.');
		} else {
			this.formLog('#lInputEmail', 'success', '');
		}
		var password = $form.find('input[name="password"]').val();
		if (password.length === 0) {
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
	/* End of user code */

	/* Start of user code additional functions */
	/* End of user code */
});
