$(document).ready(function(){
	findAll();
});

var rootUrl = "http://localhost:8180/CarNet/rest/cars";

var findAll = function() {
	$.ajax({
		type : 'GET',
		url : rootUrl,
		dataType : 'json',
		success : loadAllData
	});
};

var loadAllData = function(data){
	$.each(data, function(index, element){
		console.log(element.id);
	})
}