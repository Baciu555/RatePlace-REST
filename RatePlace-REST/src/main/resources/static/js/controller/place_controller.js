'use strict';

App.controller('PlaceController', ['$scope', '$routeParams', 'PlaceService', function($scope, $routeParams, PlaceService) {
	var self = this;
	self.id = $routeParams.id;
	self.place = {id:null, name:'', description:'', longitude:null, latitude:null, imagePath:''};
	self.places = [];
	
	self.fetchAllPlaces = function() {
		PlaceService.fetchAllPlaces()
			.then(
					function(d) {
						self.places = d;
					},
					function(errResponse) {
						console.error('Errow while fetching places');
					}
			);
	};
	
	self.fetchPlaceById = function(id) {
		PlaceService.fetchPlaceById(id)
		.then(
				function(d) {
					self.place = d;
				},
				function(errResponse) {
					console.error('Errow while fetching place');
				}
		);
	}
	
	self.fetchAllPlaces();
	console.log('Place id | ' + self.id);
	self.fetchPlaceById(self.id);
	
}]);