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


    $('#newpwd').blur(function (){
        if( $('#newpwd').val().trim() == ""){
            $('#newpwd').next().html('新密码不能为空');
            $('#newpwd').attr("isallowsub","false");

        }else{
            $('#newpwd').next().html('');
            $('#newpwd').attr("isallowsub","true");
        }
    })

    $('#repwd').blur(function (){
        if( $('#repwd').val() != $('#newpwd').val()){
            $('#repwd').next().html('与新密码不一致');
            $('#repwd').attr("isallowsub","false");

        }else{
            $('#repwd').next().html('');
            $('#repwd').attr("isallowsub","true");
        }
    })

    $('#subbutton').click(function (){
        $("#oldpassword").blur();
        $("#newpwd").blur();
        $("#repwd").blur();
        if ($("#oldpassword").attr("isallowsub") == "true" && $("#newpwd").attr("isallowsub") == "true" && $("#repwd").attr("isallowsub") == "true"){
            if (confirm("确认修改密码?修改成功后将退出登录")){
                $("#modifypwd").submit();
            }
        }



    })
})