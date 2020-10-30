var clazzObj;

$(function () {

    $(".delClazz").on("click",function(){
        clazzObj = $(this);
        if (confirm("确定要删除班级【" + clazzObj.attr("clazzcode") + "】吗？")) {
            delClazz(clazzObj)
        }
    })
    function delClazz(obj) {
        $.ajax({
            type: "GET",
            url: path + "/clazz/del",
            data: "id=" + obj.attr("clazzid"),
            dataType: "JSON",
            success: function (result) {
                if (result.code == "0") {
                    obj.parents("tr").remove();
                } else {
                    alert("对不起，删除班级【" + obj.attr("clazzcode") + "】失败");
                }
            },
            error: function (data) {
                alert("对不起，删除失败");
            }
        })
    }
});
