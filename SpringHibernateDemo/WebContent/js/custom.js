$(document).ready(function(){
	
	/*var c = document.getElementById("ui-data");
	var ctx = c.getContext("2d");
	ctx.rect(0, 0, $("#ui-data-div").width(), $("#ui-data-div").height());
	ctx.stroke();*/
	
	$("#countries").autocomplete({
		source: $("#village-form").attr("action"),
		minLength: 2,//search after two characters
		autoFocus: true, // first item will automatically be focused
		select: function(event,ui){
		}
	});

});