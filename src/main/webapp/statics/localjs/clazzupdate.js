$(function () {
    $.ajax({
        type: "GET",
        url: path + "/tch/queryalltch",
        dataType: "JSON",
        success: function (result) {
            if (result != null) {
                if (result.code == "0") {
                    var data = result.data;
                    $("#tchId").html("");
                    var options = "<option value=\"0\">请选择</option>";
                    for (var i = 0; i < data.length; i++) {
                        options += "<option value=\"" + data[i].id + "\">" + data[i].name + "</option>";
                    }
                    $("#tchId").html(options);
                } else {
                    $("#tchId").next().html(" 空数据");
                }
            }
        }, error: function (result) {
            $("#tchId").next().html(" 获取用户角色列表error");
        }
    })

    $("#clazzCode").bind("blur", function () {
        if($("#clazzCode").val().trim()!="") {
            $("#clazzCode").next().html("");
            $("#clazzCode").attr("isallowsub", "true");
        } else {
            $("#clazzCode").next().html(" 班级编号不能为空");
            $("#clazzCode").attr("isallowsub", "false");
        }
    })

    $("#subbutton").bind("click", function () {
        // alert(1);
        $("#clazzCode").blur();
        if ($("#clazzCode").attr("isallowsub")=="true"){
            if(confirm("是否确认提交数据")){
                $("#clazzupdate").submit();
            }
        }
    })

})
