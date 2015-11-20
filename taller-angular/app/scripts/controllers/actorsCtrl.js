  angular.module('angularSpa')
    .controller('ActorsCtrl', function($scope, actorsService, $routeParams){
        $scope.actors = [];
        function getActors(){
            actorsService.getActors()
            .success(function(data){
                $scope.actors = data;
            })
            .error(function(error){
                $scope.status = 'Error al consultar por actores';
            });
        }
        getActors();
        function getIdActor(){
            actorsService.getIdActor($routeParams.id)
            .success(function(data){
                $scope.actor = data;
                console.log( $scope.actor.idActor);
            });
        }
        getIdActor();
    });