$(document).ready(function(){
	findOne(2);
});

var rootUrl = "http://localhost:8180/CarNet/rest/cars";

var findOne = function(id) {
	$.ajax({
		type : 'GET',
		url : rootUrl + "/" + id,
		dataType : 'json',
		success : loadData
	});
};

var loadData = function(data){
	console.log(data.id);
	console.log(data.make);
	console.log(data.model);
	console.log(data.year);
	console.log(data.color);
	console.log(data.litre);
	console.log(data.mileage);
	console.log(data.price);
	console.log(data.image);
	console.log(data.condition);
	console.log(data.seller);
	
}