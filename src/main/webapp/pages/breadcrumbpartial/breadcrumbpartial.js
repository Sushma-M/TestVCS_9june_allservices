Application.$controller("breadcrumbpartialPageController", ["$scope", function($scope) {
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
        var catData = ($scope.pageParams.category === "ui") ? $scope.Variables.userInterfaceCategory.dataSet : $scope.Variables.widgetCategory.dataSet;

        $scope.Variables.currentPageDetails.setData(_.find(catData, {
            'link': '#/' + $scope.activePageName
        }));

        $scope.Variables.Breadcrumb.setItem(1, {
            "pageName": $scope.Variables.currentPageDetails.dataSet.label,
            "link": "#/" + $scope.Variables.currentPageDetails.dataSet.link
        });
    };
}]);