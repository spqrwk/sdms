$(function (){
    $("#oldpassword").on("blur",function(){
        if ($("#oldpassword").val() == null || $("#oldpassword").val().trim() == '') {
            $("#oldpassword").next().html("旧密码不能为空");
            $("#oldpassword").attr("isallowsub", "false");
        } else {
            $.ajax({
                type: "GET",
                url: path + "/user/checkpwd",
                data: {"oldpassword": $("#oldpassword").val()},
                dataType: "JSON",
                success: function(result){
                    if (result.code == "0") {
                        $("#oldpassword").next().html("");
                        $("#oldpassword").attr("isallowsub", "true");
                    } else {
                        $("#oldpassword").next().html("旧密码不正确");
                        $("#oldpassword").attr("isallowsub", "false");
                    }
                },
                error: function(data){
                    $("#oldpassword").next().html("请求失败");
                }
            });
        }
    })
})