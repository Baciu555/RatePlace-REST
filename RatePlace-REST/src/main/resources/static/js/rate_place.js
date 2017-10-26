'use strict';

var App = angular.module('ratePlace',['ngRoute']);

App.config(['$routeProvider', function($routeProvider) {
	$routeProvider
	.when('/index', {
		templateUrl: 'index',
		controller: 'IndexController'
	})
	.when('/account', {
		templateUrl: 'account',
		controller: 'AccountController'
	})
	.when('/addPlace', {
		templateUrl: 'addPlace',
		controller: 'AddPlaceController'
	})
	.when('/changeAvatar', {
		templateUrl: 'changeAvatar',
		controller: 'ChangeAvatarController'
	})
	.when('/edit', {
		templateUrl: 'edit',
		controller: 'EditController'
	})
	.when('/login', {
		templateUrl: 'login',
		controller: 'LoginController'
	})
	.when('/place/:id', {
		templateUrl: 'place/:id',
		controller: 'PlaceController'
	})
	.when('/profile', {
		template: 'profile',
		controller: 'ProfileController'
	});
}]);