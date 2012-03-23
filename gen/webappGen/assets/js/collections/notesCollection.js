/** All Rights Reserved **/

var Webapp = Webapp || {};
Webapp.NotesCollection = Backbone.Collection.extend({
	model: Webapp.Note,
	localStorage: new Store("webapp.notesCollection")
	/* Start of user code additional features */
	/*End of user code*/
});
