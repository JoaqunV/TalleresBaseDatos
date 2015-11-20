angular.module('angularSpa')
    .service('actorsService', function($http){
        var urlBase = 'http://ugalde:8080/tallerTBD/actors/';
        this.getActors = function(){
            return $http.get(urlBase);
        };
        this.getIdActor = function(idActor){
            return $http.get(urlBase+idActor);
        };
	});
