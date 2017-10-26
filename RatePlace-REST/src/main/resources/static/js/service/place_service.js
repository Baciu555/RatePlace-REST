'use strict';

App.factory('PlaceService', ['$http', '$q', function($http, $q) {
	return {
		fetchAllPlaces: function() {
			return $http.get('http://localhost:8080/places')
					.then(
							function(response){
								return response.data;
							},
							function(errResponse){
								console.error('Error while fetching places');
								return $q.reject(errResponse);
							}
					);
		},
		fetchPlaceById: function(id) {
			return $http.get('http://localhost:8080/places/' + id)
					.then(
							function(response){
								return response.data;
							},
							function(errResponse){
								console.error('Error while fetching place');
								return $q.reject(errResponse);
							}
					);
		}
	};
}]);
 