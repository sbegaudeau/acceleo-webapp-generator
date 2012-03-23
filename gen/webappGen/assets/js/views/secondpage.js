var Webapp = Webapp || {};
Webapp.Secondpage = Backbone.View.extend({
	el: $("#container"),
	render: function(){
		var self = this;
		var myEl = self.el;
		$.get('templates/secondpage.html', function(page) {
			var templates = $(page).filter('#second-page-template');
			if (templates.length === 1) {
				var mainBannerTemplate = _.template($(templates[0]).html());
				$(self.el).html(mainBannerTemplate());
				$(self.el).addClass('container').removeClass('main-banner');
			}
		});
		
					
		$('.active').removeClass('active');
		$('#second-page-menu').addClass('active');
	}
	/* Start of user code additional functions */
	/* End of user code */
});
