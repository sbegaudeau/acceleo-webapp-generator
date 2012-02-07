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

var EclipseCon = EclipseCon || {};
EclipseCon.ListLanguages = Backbone.View.extend({
	el: $("#container"),
	render: function(){
		var self = this;
		$.get('templates/table.html', function(page) {
			var templates = $(page).filter('#table-template');
			var templates_dialog = $(page).filter('#dialog-template');
			if (templates.length === 1 && templates_dialog.length === 1) {
				var tableTemplate = _.template($(templates[0]).html(), {
					columnNames: ['Name'],
					columnWidths: [100],
					attributesToConsider: ['name'],
					attributesToLinkWithPlaceholder: {},
					linkedAttributesMapping: {},
					objects: _.toArray(EclipseCon.languages)
				});
				self.el.addClass('container').removeClass('main-banner');
				self.el.html(tableTemplate);
				self.el.find('input').each(function(i, elem){
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
							$(elem).html('<input class="large" size="30" type="text"/>');
							if (currentValue.length > 0) {
								elem.childNodes[0].value = currentValue;
							}
						}
						
						var firstChild = $(elem).children(':first-child')[0];
						firstChild.focus();
						$(firstChild).keypress(function(e){
							if(e.which === 13) {
								var newValue = firstChild.value;
								$(elem).html(newValue);
								var data_num = $(elem).data('num');
								var data_attribute_name = $(elem).data('attribute-name');
								var model = EclipseCon.languages.at(data_num);
								var valueToSet = {};
								valueToSet[data_attribute_name] = newValue;
								model.save(valueToSet);
							}
						});
					});
				});
				$('#new-btn').bind('click', function(){
					EclipseCon.languages.create(new EclipseCon.Language());
					EclipseCon.router.showLanguages();
					return false;
				});
				$('#delete-btn').bind('click', function(){
					var modelArray = [];
					var i = 0;
					$('input').each(function(index, elem) {
						if ($(elem).attr('name') === 'checkBoxDelete' && elem.checked === true) {
							var data_num = $(elem).data('num');
							var model = EclipseCon.languages.at(data_num);
							modelArray[i] = model;
							i = i + 1;
						}
					});
					
					$(_.toArray(EclipseCon.users)).each(function(i, elem){
						$(elem.get('languages')).each(function(j, lang){
							if (_.include(_.map(modelArray, function(deletedLang){return deletedLang.id;}), lang)) {
								var newLanguageIds = _.without(elem.get('languages'), lang);
								elem.save({'languages': newLanguageIds});
							}
						});
					});
					
					$(_.toArray(EclipseCon.projects)).each(function(i, elem){
						$(elem.get('languages')).each(function(j, lang){
							if (_.include(_.map(modelArray, function(deletedLang){return deletedLang.id;}), lang)) {
								var newLanguageIds = _.without(elem.get('languages'), lang);
								elem.save({'languages': newLanguageIds});
							}
						});
					});
					
					for (var c = 0; c < modelArray.length; c++) {
						var model =	modelArray[c];
						model.destroy();
					}
					
					EclipseCon.router.showLanguages();
					return false;
				});
			}
		});
		
		$('.active').removeClass('active');
		$('#languages-tab').addClass('active');
	}
});
