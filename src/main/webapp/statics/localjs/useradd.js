$(function (){
    $("#userCode").bind("blur", function (){
        if ($("#userCode").val() == null || $("#userCode").val().trim() == '') {
            $("#userCode").next().html("用户编码不能为空");
            $("#userCode").attr("isallowsub", "false");
        } else {
            $.ajax({
                type: "GET",
                url: path + "/user/checkusercode",
                data: {"userCode" : $("#userCode").val()},
                dataType: "JSON",
                success: function (result) {
                    if (result.code == "0") {
                        $("#userCode").next().html("");
                        $("#userCode").attr("isallowsub", "true");
                    } else {
                        $("#userCode").next().html("该用户编码已存在");
                        $("#userCode").attr("isallowsub", "false");
                    }
                },
                error: function (data) {
                    $("#userCode").next().html("请求失败");
                }
            })
        }
    })

    $("#submitBtn").bind("click",function(){
        $("#userCode").blur();
        if($("#userCode").attr("isallowsub") == "true"){
            if(confirm("是否确认提交数据")){
                $("#userAddForm").submit();
            }
        }
    });
})