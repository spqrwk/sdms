var userObj;

$(function () {

    $(".delUser").on("click",function(){
        userObj = $(this);
        if (confirm("确定要删除用户【" + userObj.attr("usercode") + "】吗？")) {
            delUser(userObj)
        }
    })
    function delUser(obj) {
        $.ajax({
            type: "GET",
            url: path + "/user/del",
            data: "id=" + obj.attr("userid"),
            dataType: "JSON",
            success: function (result) {
                if (result.code == "0") {
                    obj.parents("tr").remove();
                } else {
                    alert("对不起，删除用户【" + obj.attr("usercode") + "】失败");
                }
            },
            error: function (data) {
                alert("对不起，删除失败");
            }
        })
    }
});
