var tchObj;

$(function () {

    $(".delTch").on("click",function(){
        tchObj = $(this);
        if (confirm("确定要删除班主任【" + tchObj.attr("tchname") + "】吗？")) {
            delTch(tchObj)
        }
})
    function delTch(obj) {
        $.ajax({
            type: "GET",
            url: path + "/tch/del",
            data: "id=" + obj.attr("tchid"),
            dataType: "JSON",
            success: function (result) {
                if (result.code == "0") {
                    obj.parents("tr").remove();
                } else {
                    alert("对不起，删除班主任【" + obj.attr("tchname") + "】失败");
                }
            },
            error: function (data) {
                alert("对不起，删除失败");
            }
        })
    }
});
