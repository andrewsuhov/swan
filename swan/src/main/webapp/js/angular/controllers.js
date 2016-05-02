/*
 *    BSUIR Bachelor's Diploma 2016
 */


var swan = angular.module('swan', []);

swan.controller('EmployeeController', function ($scope, $http) {
    $http.get('rs/employees').success(function (data) {
        $scope.employees = data;
        var employee;
        for (employee in $scope.employees)
        {
            employee.department = getDepartment(employee.department);
        }
    });

    var getDepartment = function (id) {
        console.log("Fetching department, id=" + id);
        var department;
        $http.get('rs/departments/' + id).success(function (data) {
            department = data;
        });
        return department;
    };
});