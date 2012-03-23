/** All Rights Reserved **/

var ProjectManagement = ProjectManagement || {};
ProjectManagement.Languages = Backbone.View.extend({
	el: $("#container"),
	render: function() {
		var self = this;
		var myEl = self.el;

		$.get('templates/languages.html', function(page) {
			var templates = $(page).filter('#languages-template');
			var templates_dialog = $(page).filter('#dialog-template');
			if (templates.length === 1 && templates_dialog.length === 1) {
				var tableTemplate = _.template($(templates[0]).html(), {
					columnNames: ['Name', ],
					columnWidths: [4, ],
					attributesToConsider: ['name', ],
					attributesToLinkWithPlaceholder: {},
					linkedAttributesMapping: {},
					objects: _.toArray(ProjectManagement.languagesCollection)

				});
				$(self.el).addClass('container').removeClass('main-banner');
				$(self.el).html(tableTemplate);
				$(self.el).find('input').each(function(i, elem){
					if ($(elem).attr('name') !== 'checkBoxDelete') {
						$(elem).hide();
					}
				});
				
				
				$('.editable').each(function(i, elem) {
					$(elem).bind('click', function(){
						var currentValue = '';
						if (elem.childNodes.length === 1) {
							if (elem.childNodes[0] instanceof Text) {
								currentValue = $(elem).html();
							}
						}
						var data_attribute_name = $(elem).data('attribute-name');
						if (data_attribute_name === 'name') {
							/* Start of user code attribute UI Name */
							$(elem).html('<input class="large" size="30" type="text"/>');
							if (currentValue.length > 0) {
								elem.childNodes[0].value = currentValue;
							}
							/* End of user code */
						}
				
						var firstChild = $(elem).children(':first-child')[0];
						firstChild.focus();
						$(firstChild).keypress(function(e){
							if(e.which === 13) {
								var newValue = firstChild.value;
								$(elem).html(newValue);
								var data_num = $(elem).data('num');
								var data_attribute_name = $(elem).data('attribute-name');
								var model = ProjectManagement.languagesCollection.at(data_num);
								var valueToSet = {};
								valueToSet[data_attribute_name] = newValue;
								model.save(valueToSet);
							}
						});
					});
				});

				$('#new-btn').bind('click', function(){
					ProjectManagement.languagesCollection.create(new ProjectManagement.Language());
					webkitNotifications.requestPermission(function() {
						var permission = webkitNotifications.checkPermission();
						if (permission === 0) {
							var notification = webkitNotifications.createNotification('assets/images/acceleo.png', 'Project Management', 'New Language created');
							notification.show();
						}
					});
					ProjectManagement.router.showLanguages();
					return false;
				});

				$('#delete-btn').bind('click', function(){
					var modelArray = [];
					var i = 0;
					$('input').each(function(index, elem) {
						if ($(elem).attr('name') === 'checkBoxDelete' && elem.checked === true) {
							var data_num = $(elem).data('num');
							var model = ProjectManagement.languagesCollection.at(data_num);
							modelArray[i] = model;
							i = i + 1;
						}
					});
				
				
					for (var c = 0; c < modelArray.length; c++) {
						var model =	modelArray[c];
						model.destroy();
					}
					
					ProjectManagement.router.showLanguages();
					return false;
				});

				
				
			$('.active').removeClass('active');
			$('#languages-menu').addClass('active');
			}
		}
		/* Start of user code additional features */
		/* End of user code */
	);
	}
});
