//$.getScript("angular.min.js");
var myApp = angular
			.module("myModule",[])
			.controller("myController", function($scope){
					var employees = [
										{firstName : "Sreenath",lastName : "Reddy",gender: "Male"},
										{firstName : "vishnu",lastName : "Reddy",gender: "Male"},
										{firstName : "gobi",lastName : "Reddy",gender: "Male"}
					                ]
					$scope.employees = employees;
					
					var countries = [
									{
										name : "India",
										cities : [
											          {
											        	  name: "Hyderabad"
											          },
											          {
											        	  name: "Bangalore"
											          },
											          {
											        	  name: "Delhi"
											          }
										          ]
									},
									{
										name : "USA",
										cities : [
											          {
											        	  name: "NYC"
											          },
											          {
											        	  name: "NJC"
											          },
											          {
											        	  name: "IL"
											          }
										          ]
									},
									{
										name : "UK",
										cities : [
											          {
											        	  name: "Londol"
											          },
											          {
											        	  name: "Manchester"
											          },
											          {
											        	  name: "Barmingham"
											          }
										          ]
									}
									
				                ]
					$scope.countries = countries;
					
					var technologies = [
					                    { name:"PHP" , likes :0, dislikes: 0},
					                    { name:"JAVA" , likes :0, dislikes: 0},
					                    { name:".NET" , likes :0, dislikes: 0},
					                    { name:"DEVAPPs" , likes :0, dislikes: 0}
					                    ]
					$scope.technologies = technologies;
					
					$scope.incrementLikes = function(technology){
						technology.likes++;
					}
					$scope.incrementDisLikes = function(technology){
						technology.dislikes++;
					}
					
					var employers = [
					                    { name:"Sreenath" , dateOfBirth: new Date("November 26, 1991"), salary: 50000.788 },
					                    { name:"Vamshi" , dateOfBirth: new Date("January 10, 1989"), salary: 45000.55},
					                    { name:"Goverdan" , dateOfBirth: new Date("Febreary 15, 1991"), salary: 53000.12},
					                    { name:"Vishnu" , dateOfBirth: new Date("March 20, 1990"), salary: 25000.35}
					                    ];
					$scope.employers = employers;
					$scope.rowLimit = 3;
					$scope.sortColumn = 'name';
					$scope.reverseSort = false;
					
					$scope.sortData = function(column){
						$scope.reverseSort = ($scope.sortColumn = column)? !$scope.reverseSort : false;
						$scope.sortColumn = column;
					}
					
					$scope.getSortClass = function(column){
						if($scope.sortColumn == column){
							return $scope.reverseSort ? 'arrow-down' : 'arrow-up'
						}
						return '';
					}
					
					$scope.search = function(item){
						if($scope.searchText1 == undefined){
							return true;
						}else{
							if(item.firstName.toLowerCase().indexOf($scope.searchText1.toLowerCase()) != -1
							 || item.lastName.toLowerCase().indexOf($scope.searchText1.toLowerCase()) != -1){
								return true;
							}
						}
						return false;
					}
			});
