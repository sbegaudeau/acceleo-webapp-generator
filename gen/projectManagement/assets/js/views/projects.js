/** All Rights Reserved **/

var ProjectManagement = ProjectManagement || {};
ProjectManagement.Projects = Backbone.View.extend({
	el: $("#container"),
	render: function() {
		var self = this;
		var myEl = self.el;

		$.get('templates/projects.html', function(page) {
			var templates = $(page).filter('#projects-template');
			var templates_dialog = $(page).filter('#dialog-template');
			if (templates.length === 1 && templates_dialog.length === 1) {
				var tableTemplate = _.template($(templates[0]).html(), {
					columnNames: ['Name', 'Languages', 'Users'],
					columnWidths: [4, 9, 5],
					attributesToConsider: ['name', 'languages', 'users'],
					attributesToLinkWithPlaceholder: {'languages': ProjectManagement.languagesCollection, 'users': ProjectManagement.usersCollection},
					linkedAttributesMapping: {'languages': 'name', 'users': 'firstName'},
					objects: _.toArray(ProjectManagement.projectsCollection)

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
								var model = ProjectManagement.projectsCollection.at(data_num);
								var valueToSet = {};
								valueToSet[data_attribute_name] = newValue;
								model.save(valueToSet);
							}
						});
					});
				});

				$('#new-btn').bind('click', function(){
					ProjectManagement.projectsCollection.create(new ProjectManagement.Project());
					webkitNotifications.requestPermission(function() {
						var permission = webkitNotifications.checkPermission();
						if (permission === 0) {
							var notification = webkitNotifications.createNotification('assets/images/acceleo.png', 'Project Management', 'New Project created');
							notification.show();
						}
					});
					ProjectManagement.router.showProjects();
					return false;
				});

				$('#delete-btn').bind('click', function(){
					var modelArray = [];
					var i = 0;
					$('input').each(function(index, elem) {
						if ($(elem).attr('name') === 'checkBoxDelete' && elem.checked === true) {
							var data_num = $(elem).data('num');
							var model = ProjectManagement.projectsCollection.at(data_num);
							modelArray[i] = model;
							i = i + 1;
						}
					});
				
					$(_.toArray(ProjectManagement.usersCollection)).each(function(i, elem){
						$(elem.get('projects')).each(function(j, project){
							if (_.include(_.map(modelArray, function(deletedProject){return deletedProject.id;}), project)) {
								var newProjectIds = _.without(elem.get('projects'), project);
								elem.save({'projects': newProjectIds});
							}
						});
					});
				
					for (var c = 0; c < modelArray.length; c++) {
						var model =	modelArray[c];
						model.destroy();
					}
					
					ProjectManagement.router.showProjects();
					return false;
				});

				
				$('.link-placeholder').bind('click', function(){
					var index = $(this.parentNode).data('num');
					var project = ProjectManagement.projectsCollection.at(index);
					var target = $(this).attr('href');
					$(target).find('.title').each(function(i, elem) {
						if (target === '#languages') {
							$(elem).html('Languages');
							/* Start of user code linkPlaceHolder Languages */
							var dialogTemplate = _.template($(templates_dialog[0]).html(), {
								dialogColumnNames: ['Name'],
								dialogColumnWidths: [100],
								attributesToConsider: ['name'],
								dialogObjects: _.toArray(ProjectManagement.languagesCollection),
								objectsToSelect: _.toArray(_.filter(_.toArray(ProjectManagement.languagesCollection), function(val){
																var languagesIds = project.get('languages');
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
									project.save(valueToSet);
									ProjectManagement.router.showProjects();
								});
							});
						}
						else if (target === '#users') {
							$(elem).html('Users');
							/* Start of user code linkPlaceHolder Users */
							var dialogTemplate = _.template($(templates_dialog[0]).html(), {
								dialogColumnNames: ['First Name'],
								dialogColumnWidths: [100],
								attributesToConsider: ['firstName'],
								dialogObjects: _.toArray(ProjectManagement.usersCollection),
								objectsToSelect: _.toArray(_.filter(_.toArray(ProjectManagement.usersCollection), function(val){
																var usersIds = project.get('users');
																var found = false;
																_.each(usersIds, function(usersId){
																	if (usersId === val.id) {
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
											var model = ProjectManagement.usersCollection.at(data_num);
											modelArray[i] = model.id;
											i = i + 1;
										}
									});
									
									var valueToSet = {};
									valueToSet['users'] = modelArray;
									project.save(valueToSet);
									/* bidirectional link */
									/* Start of user code bidirectional link Users */
									$(_.toArray(ProjectManagement.usersCollection)).each(function(i, elem){
										if(_.include(modelArray, elem.id)) {
											var projectIds = elem.get('projects');
											if (!(_.include(projectIds, project.id))) {
												projectIds.push(project.id);
												elem.save({'projects': projectIds});
											}
										} else {
											elem.save({'projects': _.without(elem.get('projects'), project.id)});
										}
									});
									/* End of user code */
									ProjectManagement.router.showProjects();
								});
							});
						}
					});
				});
				
			$('.active').removeClass('active');
			$('#projects-menu').addClass('active');
			}
		}
		/* Start of user code additional features */
		/* End of user code */
	);
	}
});
