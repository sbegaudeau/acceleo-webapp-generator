/** All Rights Reserved **/

var Webapp = Webapp || {};
Webapp.Usersadmin = Backbone.View.extend({
	el: $("#container"),
	render: function() {
		var self = this;
		var myEl = self.el;

		$.get('templates/usersadmin.html', function(page) {
			var templates = $(page).filter('#users-admin-template');
			var templates_dialog = $(page).filter('#dialog-template');
			if (templates.length === 1 && templates_dialog.length === 1) {
				var tableTemplate = _.template($(templates[0]).html(), {
					columnNames: ['First Name', 'Last Name', 'Age', 'Notes'],
					columnWidths: [10, 9, 3, 5],
					attributesToConsider: ['firstName', 'lastName', 'age', 'notes'],
					attributesToLinkWithPlaceholder: {'notes': Webapp.notesCollection},
					linkedAttributesMapping: {'notes': 'description'},
					objects: _.toArray(Webapp.usersCollection)

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
						if (data_attribute_name === 'firstName') {
							/* Start of user code attribute UI First Name */
							$(elem).html('<input class="large" size="30" type="text"/>');
							if (currentValue.length > 0) {
								elem.childNodes[0].value = currentValue;
							}
							/* End of user code */
						}
						else if (data_attribute_name === 'lastName') {
							/* Start of user code attribute UI Last Name */
							$(elem).html('<input class="large" size="30" type="text"/>');
							if (currentValue.length > 0) {
								elem.childNodes[0].value = currentValue;
							}
							/* End of user code */
						}
						else if (data_attribute_name === 'age') {
							/* Start of user code attribute UI Age */
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
								var model = Webapp.usersCollection.at(data_num);
								var valueToSet = {};
								valueToSet[data_attribute_name] = newValue;
								model.save(valueToSet);
							}
						});
					});
				});

				$('#new-btn').bind('click', function(){
					Webapp.usersCollection.create(new Webapp.User());
					webkitNotifications.requestPermission(function() {
						var permission = webkitNotifications.checkPermission();
						if (permission === 0) {
							var notification = webkitNotifications.createNotification('assets/images/acceleo.png', 'Webapp', 'New User created');
							notification.show();
						}
					});
					Webapp.router.showUsersadmin();
					return false;
				});

				$('#delete-btn').bind('click', function(){
					var modelArray = [];
					var i = 0;
					$('input').each(function(index, elem) {
						if ($(elem).attr('name') === 'checkBoxDelete' && elem.checked === true) {
							var data_num = $(elem).data('num');
							var model = Webapp.usersCollection.at(data_num);
							modelArray[i] = model;
							i = i + 1;
						}
					});
				
					$(_.toArray(Webapp.notesCollection)).each(function(i, elem){
						$(elem.get('users')).each(function(j, user){
							if (_.include(_.map(modelArray, function(deletedUser){return deletedUser.id;}), user)) {
								var newUserIds = _.without(elem.get('users'), user);
								elem.save({'users': newUserIds});
							}
						});
					});
				
					for (var c = 0; c < modelArray.length; c++) {
						var model =	modelArray[c];
						model.destroy();
					}
					
					Webapp.router.showUsersadmin();
					return false;
				});

				
				$('.link-placeholder').bind('click', function(){
					var index = $(this.parentNode).data('num');
					var user = Webapp.usersCollection.at(index);
					var target = $(this).attr('href');
					$(target).find('.title').each(function(i, elem) {
						if (target === '#notes') {
							$(elem).html('Notes');
							/* Start of user code linkPlaceHolder Notes */
							var dialogTemplate = _.template($(templates_dialog[0]).html(), {
								dialogColumnNames: ['description'],
								dialogColumnWidths: [100],
								attributesToConsider: ['description'],
								dialogObjects: _.toArray(Webapp.notesCollection),
								objectsToSelect: _.toArray(_.filter(_.toArray(Webapp.notesCollection), function(val){
																var notesIds = user.get('notes');
																var found = false;
																_.each(notesIds, function(notesId){
																	if (notesId === val.id) {
																		found = true;
																	}
																});
																return found;
															}))
							});
							/* End of user code */
							$(target).find('.modal-body').each(function(j, element){
								$(element).html(dialogTemplate);
							});
							$(target).find('.dialogSave').each(function(j, element){
								$(element).bind('click', function() {
									var modelArray = [];
									var i = 0;
									$('input').each(function(index, elem) {
										if ($(elem).attr('name') === 'checkBoxDeleteDialog' && elem.checked === true) {
											var data_num = $(elem).data('num');
											var model = Webapp.notesCollection.at(data_num);
											modelArray[i] = model.id;
											i = i + 1;
										}
									});
									
									var valueToSet = {};
									valueToSet['notes'] = modelArray;
									user.save(valueToSet);
									/* bidirectional link */
									/* Start of user code bidirectional link Notes */
									$(_.toArray(Webapp.notesCollection)).each(function(i, elem){
										if(_.include(modelArray, elem.id)) {
											var userIds = elem.get('users');
											if (!(_.include(userIds, user.id))) {
												userIds.push(user.id);
												elem.save({'users': userIds});
											}
										} else {
											elem.save({'users': _.without(elem.get('users'), user.id)});
										}
									});
									/* End of user code */
									Webapp.router.showUsersadmin();
								});
							});
						}
					});
				});
				
			$('.active').removeClass('active');
			$('#users-admin-menu').addClass('active');
			}
		}
		/* Start of user code additional features */
		/* End of user code */
	);
	}
});
