Application.$controller("ChartsPageController", ["$scope", function($scope) {
    "use strict";

    /* perform any action on widgets/variables within this block */
    $scope.onPageReady = function() {
        /*
         * variables can be accessed through '$scope.Variables' property here
         * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
         * $scope.Variables.loggedInUser.getData()
         *
         * widgets can be accessed through '$scope.Widgets' property here
         * e.g. to get value of text widget named 'username' use following script
         * '$scope.Widgets.username.datavalue'
         */
        //$scope.$root.updateBread($scope.activePageName);
    };

    $scope.columnChartThemeListClick = function($event, $isolateScope) {
        $scope.Widgets.columnChart.theme = $isolateScope.item.title;
        $scope.Widgets.columnChart.redraw();
    };


    $scope.areaChartThemeListClick = function($event, $isolateScope) {
        $scope.Widgets.areaChart.theme = $isolateScope.item.title;
        $scope.Widgets.areaChart.redraw();
    };


    $scope.barChartThemeListClick = function($event, $isolateScope) {
        $scope.Widgets.barChart.theme = $isolateScope.item.title;
        $scope.Widgets.barChart.redraw();
    };


    $scope.bubbleChartThemeListClick = function($event, $isolateScope) {
        $scope.Widgets.bubbleChart.theme = $isolateScope.item.title;
        $scope.Widgets.bubbleChart.redraw();
    };


    $scope.cumulativeChartThemeListClick = function($event, $isolateScope) {
        $scope.Widgets.cumulativeChart.theme = $isolateScope.item.title;
        $scope.Widgets.cumulativeChart.redraw();
    };


    $scope.donutChartThemeListClick = function($event, $isolateScope) {
        $scope.Widgets.donutChart.theme = $isolateScope.item.title;
        $scope.Widgets.donutChart.redraw();
    };


    $scope.lineChartThemeListClick = function($event, $isolateScope) {
        $scope.Widgets.lineChart.theme = $isolateScope.item.title;
        $scope.Widgets.lineChart.redraw();
    };


    $scope.pieChartThemeListClick = function($event, $isolateScope) {
        $scope.Widgets.pieChart.theme = $isolateScope.item.title;
        $scope.Widgets.pieChart.redraw();
    };

}]);