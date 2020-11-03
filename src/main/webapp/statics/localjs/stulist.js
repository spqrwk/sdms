var stuObj;

$(function () {
    $(".delStu").on("click",function(){
        stuObj = $(this);
        if (confirm("确定要删除学生【" + stuObj.attr("stuname") + "】吗？")) {
            delStu(stuObj)
        }
    })
    function delStu(obj) {
        $.ajax({
            type: "GET",
            url: path + "/stu/del",
            data: "id=" + obj.attr("stuid"),
            dataType: "JSON",
            success: function (result) {
                if (result.code == "0") {
                    obj.parents("tr").remove();
                } else {
                    alert("对不起，删除学生【" + obj.attr("stuname") + "】失败");
                }
            },
            error: function (data) {
                alert("对不起，删除失败");
            }
        })
    }
});

$("#exportBtn").click(
    function () {
        $.ajax({
            type:"GET",
            url:path+"/stu/allfileexportbylimit",
            data:{
                "startDate":$('#startDate').val(),
                "endDate":$('#endDate').val(),
                "aptName":$('#aptName').val(),
                "dormCode":$('#dormCode').val(),
                "tchName":$('#tchName').val(),
                "clazzCode":$('#clazzCode').val(),
            },
            dataType: 'JSON',
            success:function(result){
                if (result.code == '0'){
                    window.location.href=path+"/statics/xls/"+result.filename;
                    $.ajax({
                        type:"GET",
                        url:path+"/stu/delfile",
                        data:{"filename":result.filename},
                        dataType: 'JSON',
                        success:function (data){
                        },
                        error:function(data){
                        }
                    })
                }else{
                    alert('导出失败');
                }
            },
            error:function(result){
                alert('服务器繁忙')
            }
        })
    }
)

$("#exportAllBtn").click(
    function () {
        $.ajax({
            type:"GET",
            url:path+"/stu/allfileexportbylimit",
            dataType: 'JSON',
            success:function(result){
                if (result.code == '0'){
                    window.location.href=path+"/statics/xls/"+result.filename;
                    $.ajax({
                        type:"GET",
                        url:path+"/stu/delfile",
                        data:{"filename":result.filename},
                        dataType: 'JSON',
                        success:function (data){
                        },
                        error:function(data){
                        }
                    })
                }else{
                    alert('导出失败');
                }
            },
            error:function(result){
                alert('服务器繁忙')
            }
        })
    }
)