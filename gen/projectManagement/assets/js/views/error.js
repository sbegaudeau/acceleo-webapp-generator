var ProjectManagement = ProjectManagement || {};
ProjectManagement.Error = Backbone.View.extend({
	el: $("#container"),
	render: function(pageId){
		var self = this;
		self.el.addClass('container').removeClass('main-banner');
		this.el.html('<b>404 Page "' + pageId + '" not found</b>');
		
		$('.active').removeClass('active');
	}
	/* Start of user code additional functions */
	/* End of user code */
});
