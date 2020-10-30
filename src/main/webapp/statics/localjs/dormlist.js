var dormObj;

$(function () {

    $(".delDorm").on("click",function(){
        dormObj = $(this);
        if (confirm("确定要删除宿舍【" + dormObj.attr("dormcode") + "】吗？")) {
            delDorm(dormObj)
        }
    })
    function delDorm(obj) {
        $.ajax({
            type: "GET",
            url: path + "/dorm/del",
            data: "id=" + obj.attr("dormid"),
            dataType: "JSON",
            success: function (result) {
                if (result.code == "0") {
                    obj.parents("tr").remove();
                } else {
                    alert("对不起，删除宿舍【" + obj.attr("dormcode") + "】失败");
                }
            },
            error: function (data) {
                alert("对不起，删除失败");
            }
        })
    }
});
