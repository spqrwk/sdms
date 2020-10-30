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
