/** All Rights Reserved **/

var Webapp = Webapp || {};
Webapp.NoteView = Backbone.View.extend({
	el: $("#container"),
	render: function() {
		var self = this;
		var myEl = self.el;

		$.get('templates/noteView.html', function(page) {
			var templates = $(page).filter('#noteview-template');
			var templates_dialog = $(page).filter('#dialog-template');
			if (templates.length === 1 && templates_dialog.length === 1) {
				var tableTemplate = _.template($(templates[0]).html(), {
					columnNames: ['description', 'Users'],
					columnWidths: [11, 5],
					attributesToConsider: ['description', 'users'],
					attributesToLinkWithPlaceholder: {'users': Webapp.usersCollection},
					linkedAttributesMapping: {'users': 'firstName'},
					objects: _.toArray(Webapp.notesCollection)

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
						if (data_attribute_name === 'description') {
							/* Start of user code attribute UI description */
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
								var model = Webapp.notesCollection.at(data_num);
								var valueToSet = {};
								valueToSet[data_attribute_name] = newValue;
								model.save(valueToSet);
							}
						});
					});
				});

				$('#new-btn').bind('click', function(){
					Webapp.notesCollection.create(new Webapp.Note());
					webkitNotifications.requestPermission(function() {
						var permission = webkitNotifications.checkPermission();
						if (permission === 0) {
							var notification = webkitNotifications.createNotification('assets/images/acceleo.png', 'Webapp', 'New Note created');
							notification.show();
						}
					});
					Webapp.router.showNoteView();
					return false;
				});

				$('#delete-btn').bind('click', function(){
					var modelArray = [];
					var i = 0;
					$('input').each(function(index, elem) {
						if ($(elem).attr('name') === 'checkBoxDelete' && elem.checked === true) {
							var data_num = $(elem).data('num');
							var model = Webapp.notesCollection.at(data_num);
							modelArray[i] = model;
							i = i + 1;
						}
					});
				
					$(_.toArray(Webapp.usersCollection)).each(function(i, elem){
						$(elem.get('notes')).each(function(j, note){
							if (_.include(_.map(modelArray, function(deletedNote){return deletedNote.id;}), note)) {
								var newNoteIds = _.without(elem.get('notes'), note);
								elem.save({'notes': newNoteIds});
							}
						});
					});
				
					for (var c = 0; c < modelArray.length; c++) {
						var model =	modelArray[c];
						model.destroy();
					}
					
					Webapp.router.showNoteView();
					return false;
				});

				
				$('.link-placeholder').bind('click', function(){
					var index = $(this.parentNode).data('num');
					var note = Webapp.notesCollection.at(index);
					var target = $(this).attr('href');
					$(target).find('.title').each(function(i, elem) {
						if (target === '#users') {
							$(elem).html('Users');
							/* Start of user code linkPlaceHolder Users */
							var dialogTemplate = _.template($(templates_dialog[0]).html(), {
								dialogColumnNames: ['First Name'],
								dialogColumnWidths: [100],
								attributesToConsider: ['firstName'],
								dialogObjects: _.toArray(Webapp.usersCollection),
								objectsToSelect: _.toArray(_.filter(_.toArray(Webapp.usersCollection), function(val){
																var usersIds = note.get('users');
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
											var model = Webapp.usersCollection.at(data_num);
											modelArray[i] = model.id;
											i = i + 1;
										}
									});
									
									var valueToSet = {};
									valueToSet['users'] = modelArray;
									note.save(valueToSet);
									/* bidirectional link */
									/* Start of user code bidirectional link Users */
									$(_.toArray(Webapp.usersCollection)).each(function(i, elem){
										if(_.include(modelArray, elem.id)) {
											var noteIds = elem.get('notes');
											if (!(_.include(noteIds, note.id))) {
												noteIds.push(note.id);
												elem.save({'notes': noteIds});
											}
										} else {
											elem.save({'notes': _.without(elem.get('notes'), note.id)});
										}
									});
									/* End of user code */
									Webapp.router.showNoteView();
								});
							});
						}
					});
				});
				
			$('.active').removeClass('active');
			$('#noteview-menu').addClass('active');
			}
		}
		/* Start of user code additional features */
		/* End of user code */
	);
	}
});
