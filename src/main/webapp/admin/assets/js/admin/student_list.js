var app = angular.module('myApp', []);
app.controller('studentCtrl', function($scope, $http) {
    var self = this;
    $scope.keyWord = "",
        //初始化列表数据
        $http.get("student/list")
            .success(function (response) {
                $scope.list = response.list;
                $scope.data=response;
                $scope.pages = [];
                for(var i = 0 ; i <$scope.data.totalPage;i++ ){
                    $scope.pages[i]=i+1;
                }
            });

    //搜索事件
    $scope.search = function() {
        $http({
            method: 'POST',
            url: 'student/list',
            data:{
                'keyWord':$scope.keyWord
            }
        }).success(function (response) {
            $scope.list = response.list;
            $scope.data=response;
        });
    };

    //编辑事件
    $scope.edit=function(student){
        $scope.id=student.id;
        $scope.name=student.name;
        $scope.description=student.description;
    }
    //更新事件
    $scope.update=function(){
        $http({
            method: 'PUT',
            url: 'student',
            params:{
                'name':$scope.name,
                'id':$scope.id,
                'description':$scope.description
            }
        }) .success(function (response) {
            //更新本地list数据
            for(var i = 0; i < $scope.list.length; i++){
                if($scope.list[i].id == $scope.id) {
                    $scope.list[i].name=$scope.name;
                    $scope.list[i].description=$scope.description;
                    break;
                }
            }
            //关闭模式对话框
            $("#editModal").modal("hide");
        });
    }

    //添加事件
    $scope.add=function(){
        $http({
            method: 'POST',
            url: 'student',
            params:{
                'name':$scope.name,
                'description':$scope.description,
                'pageNo':$scope.data.pageNo,
                'description':$scope.data.pageSize,
                'keyWord':$scope.keyWord,
                'content':$scope.content
            }
        }) .success(function (response) {
            //更新本地list数据
            $scope.list = response.list;
            $scope.data=response;
            //关闭模式对话框
            $("#addModal").modal("hide");
        });
    }
    //删除事件
    $scope.delete=function(id){
        $http.delete('student/'+id)
            .success(function (response) {
                for(var i = 0; i < $scope.list.length; i++){
                    if($scope.list[i].id == id) {
                        $scope.list.splice(i,1);
                        break;
                    }
                }
            });
    }
    //分页事件
    $scope.goPage=function(pageNo){
        $http({
            method: 'POST',
            url: 'student/list',
            params:{
                'pageNo':pageNo,
                'pageSize':$scope.data.pageSize,
                'keyWord':$scope.keyWord
            }
        }) .success(function (response) {
            $scope.list = response.list;
            $scope.data=response;
        });
    }
});