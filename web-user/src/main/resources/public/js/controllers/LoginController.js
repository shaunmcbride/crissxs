app.controller('LoginController', ['$scope','$http', function($scope,$http) {
	
	
	$scope.hideLogin=false;

	$scope.hideRegister=true;
	$scope.createEventHidden = true;


	
	 $scope.login = function() {
		    
		    $scope.user = {
					username : $scope.username,
					password : $scope.password
			}; 
			var res = $http.post('/login', $scope.user);
			res.success(function(data, status, headers, config) {
				$scope.msg = data;
				$scope.hideLogin=true;
				$scope.hideRegister=true;
				$scope.createEventHidden = false;
				$scope.user = data;

			});
			res.error(function(data, status, headers, config) {
				alert( "failure message: " + JSON.stringify({data: data}));
			});		
		    
		  }	;
		  
		  
			 $scope.register = function() {
				    
				    $scope.user = {
							username : $scope.register.username,
							password : $scope.register.password,
							
							email : $scope.register.email
					};	
					var res = $http.post('/register', $scope.user);
					res.success(function(data, status, headers, config) {
						$scope.msg = data;
						$scope.hideLogin=true;
						$scope.hideRegister=true;
						$scope.createEventHidden = false;
						$scope.user = data;
						
						

					});
					res.error(function(data, status, headers, config) {
						alert( "failure message: " + JSON.stringify({data: data}));
					});		
				    
				  }	;
				  
				  $scope.toggleRegisterLogin = function() {
					  
						$scope.hideLogin=!$scope.hideLogin;

						$scope.hideRegister=!$scope.hideLogin;

					  
				  };
				  
				  $scope.addEvent = function() {
					  

					  
					    
					    var event = {
								title : $scope.event.name,
								owner : [$scope.user]
						};	
						var res = $http.post('/event/new', event);
						res.success(function(data, status, headers, config) {
							alert( "added new event: " + $scope.event.name);
						});
						res.error(function(data, status, headers, config) {
							alert( "failure message: " + JSON.stringify({data: data}));
						});	
				  };
					    
				  
}]);