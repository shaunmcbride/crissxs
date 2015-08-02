app.factory('login', ['$scope','$http', function($http) { 
	 $scope.login = function() {
		    
		    $scope.user = {
					username : $scope.username,
					password : $scope.password
			}; 
			var res = $http.post('/users', $scope.user);
			res.success(function(data, status, headers, config) {
				$scope.msg = data;
				$scope.hideLogin=true;
				$scope.hideRegister=true;
				$scope.createEventHidden = false;

			});
			res.error(function(data, status, headers, config) {
				alert( "failure message: " + JSON.stringify({data: data}));
			});		
		    
		  }	;
}]);