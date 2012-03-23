/** All Rights Reserved **/

var ProjectManagement = ProjectManagement || {};
ProjectManagement.Users = Backbone.View.extend({
	el: $("#container"),
	render: function() {
		var self = this;
		var myEl = self.el;

		$.get('templates/users.html', function(page) {
			var templates = $(page).filter('#users-template');
			var templates_dialog = $(page).filter('#dialog-template');
			if (templates.length === 1 && templates_dialog.length === 1) {
				var tableTemplate = _.template($(templates[0]).html(), {
					columnNames: ['First Name', 'Last Name', 'Age', 'Projects', 'Languages'],
					columnWidths: [10, 9, 3, 8, 9],
					attributesToConsider: ['firstName', 'lastName', 'age', 'projects', 'languages'],
					attributesToLinkWithPlaceholder: {'projects': ProjectManagement.projectsCollection, 'languages': ProjectManagement.languagesCollection},
					linkedAttributesMapping: {'projects': 'name', 'languages': 'name'},
					objects: _.toArray(ProjectManagement.usersCollection)

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
								var model = ProjectManagement.usersCollection.at(data_num);
								var valueToSet = {};
								valueToSet[data_attribute_name] = newValue;
								model.save(valueToSet);
							}
						});
					});
				});

				$('#new-btn').bind('click', function(){
					ProjectManagement.usersCollection.create(new ProjectManagement.User());
					webkitNotifications.requestPermission(function() {
						var permission = webkitNotifications.checkPermission();
						if (permission === 0) {
							var notification = webkitNotifications.createNotification('assets/images/acceleo.png', 'Project Management', 'New User created');
							notification.show();
						}
					});
					ProjectManagement.router.showUsers();
					return false;
				});

				$('#delete-btn').bind('click', function(){
					var modelArray = [];
					var i = 0;
					$('input').each(function(index, elem) {
						if ($(elem).attr('name') === 'checkBoxDelete' && elem.checked === true) {
							var data_num = $(elem).data('num');
							var model = ProjectManagement.usersCollection.at(data_num);
							modelArray[i] = model;
							i = i + 1;
						}
					});
				
					$(_.toArray(ProjectManagement.projectsCollection)).each(function(i, elem){
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
					
					ProjectManagement.router.showUsers();
					return false;
				});

				
				$('.link-placeholder').bind('click', function(){
					var index = $(this.parentNode).data('num');
					var user = ProjectManagement.usersCollection.at(index);
					var target = $(this).attr('href');
					$(target).find('.title').each(function(i, elem) {
						if (target === '#projects') {
							$(elem).html('Projects');
							/* Start of user code linkPlaceHolder Projects */
							var dialogTemplate = _.template($(templates_dialog[0]).html(), {
								dialogColumnNames: ['Name'],
								dialogColumnWidths: [100],
								attributesToConsider: ['name'],
								dialogObjects: _.toArray(ProjectManagement.projectsCollection),
								objectsToSelect: _.toArray(_.filter(_.toArray(ProjectManagement.projectsCollection), function(val){
																var projectsIds = user.get('projects');
																var found = false;
																_.each(projectsIds, function(projectsId){
																	if (projectsId === val.id) {
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
											var model = ProjectManagement.projectsCollection.at(data_num);
											modelArray[i] = model.id;
											i = i + 1;
										}
									});
									
									var valueToSet = {};
									valueToSet['projects'] = modelArray;
									user.save(valueToSet);
									/* bidirectional link */
									/* Start of user code bidirectional link Projects */
									$(_.toArray(ProjectManagement.projectsCollection)).each(function(i, elem){
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
									ProjectManagement.router.showUsers();
								});
							});
						}
						else if (target === '#languages') {
							$(elem).html('Languages');
							/* Start of user code linkPlaceHolder Languages */
							var dialogTemplate = _.template($(templates_dialog[0]).html(), {
								dialogColumnNames: ['Name'],
								dialogColumnWidths: [100],
								attributesToConsider: ['name'],
								dialogObjects: _.toArray(ProjectManagement.languagesCollection),
								objectsToSelect: _.toArray(_.filter(_.toArray(ProjectManagement.languagesCollection), function(val){
																var languagesIds = user.get('languages');
																var found = false;
																_.each(languagesIds, function(languagesId){
																	if (languagesId === val.id) {
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
											var model = ProjectManagement.languagesCollection.at(data_num);
											modelArray[i] = model.id;
											i = i + 1;
										}
									});
									
									var valueToSet = {};
									valueToSet['languages'] = modelArray;
									user.save(valueToSet);
									ProjectManagement.router.showUsers();
								});
							});
						}
					});
				});
				
			$('.active').removeClass('active');
			$('#users-menu').addClass('active');
			}
		}
		/* Start of user code additional features */
		/* End of user code */
	);
	}
});
