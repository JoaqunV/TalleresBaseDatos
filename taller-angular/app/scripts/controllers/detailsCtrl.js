    angular.module('angularSpa')
    .controller('DetailsCtrl', function($scope, actorsService){
        $scope.actors =[];
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
    });