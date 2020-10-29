// 页面加载函数
$(function () {
    $('#dormStatus').css('display', 'none')

    $.ajax({
        type: "GET",
        url: path + "/clazz/queryallclazz",
        dataType: "JSON",
        success: function (result) {
            if (result != null) {
                if (result.code == "0") {
                    var data = result.data;
                    $("#clazzCode").html("");
                    var options = "<option value=\"0\">请选择</option>";
                    for (var i = 0; i < data.length; i++) {
                        options += "<option value=\"" + data[i].code + "\">" + data[i].code + "</option>";
                    }
                    $("#clazzCode").html(options);
                } else {
                    $("#clazzCode").next().html(" 空数据");
                }

            }
        }, error: function (result) {
            $("#clazzCode").next().html(" 获取用户角色列表error");
        }
    })

    $.ajax({
        type: "GET",
        url: path + "/dorm/queryallaptname",
        dataType: "JSON",
        success: function (result) {
            if (result != null) {
                if (result.code == "0") {
                    var data = result.data;
                    $("#aptName").html("");
                    var options = "<option value=\"0\">请选择</option>";
                    for (var i = 0; i < data.length; i++) {
                        options += "<option value=\"" + data[i].aptName + "\">" + data[i].aptName + "</option>";
                    }
                    $("#aptName").html(options);
                } else {
                    $("#aptName").next().html(" 空数据");
                }

            }
        }, error: function (result) {
            $("#aptName").next().html(" error");
        }
    })
})
//选择完公寓触发拉取宿舍列表事件
$('#aptName').blur(function (){
    $("#dormStatus").css("display", "block")
    $.ajax({
        type: "GET",
        url: path + "/dorm/queryallbyaptname",
        data: {"aptName": $("#aptName").val()},
        dataType: "JSON",
        success: function (result) {
            if (result != null) {
                if (result.code == "0") {
                    var data = result.data;
                    $("#dormCode").html("");
                    var options = "<option value=\"0\">请选择</option>";
                    for (var i = 0; i < data.length; i++) {
                        options += "<option value=\"" + data[i].id + "\">" + data[i].code + "</option>";
                    }
                    $("#dormCode").html(options);
                } else {
                    $("#dormCode").next().html(" 空数据");
                }

            }
        }, error: function (result) {
            $("#dormCode").next().html(" error");
        }
    })
})
// 表单验证
//姓名非空验证
$('#stuname').blur(function (){
    if ($('#stuname').val()!=null && $('#stuname').val().trim()!=""){
        $('#stuname').next().html("");
        $('#stuname').attr("isallowsub","true");
    }else {
        $('#stuname').next().html("姓名不能为空");
        $('#stuname').attr("isallowsub","false");
    }
})
//身份证号验证
$('#idno').blur(function (){
    var reg = /(^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$)|(^[1-9]\d{5}\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{2}[0-9Xx]$)/
    if(reg.test( $('#idno').val())){
        $('#idno').next().html("身份证号合法");
        $('#idno').next().attr("color","green");
        $('#idno').attr("isallowsub","true");
    }else{
        $('#idno').next().html("身份证号不合法");
        $('#idno').attr("isallowsub","false");
    }


})
//初始化身份证提示信息格式
$('#idno').focus(function(){
    $('#idno').next().html("")
    $('#idno').next().attr("color","red");
})

$('#dormCode').blur(function(){
    if ($('#dormCode').val()>0){
        $('#dormCode').next().html("");
        $('#dormCode').attr("isallowsub","true");
    }else {
        $('#dormCode').next().html("请选择宿舍");
        $('#dormCode').attr("isallowsub","false");
    }


})


//提交按钮
$('#subbutton').click(function (){
    $('#stuname').blur();
    $('#idno').blur();
    $('#dormCode').blur();
    if( $('#stuname').attr("isallowsub") == "true" && $('#idno').attr("isallowsub") == "true" && $('#dormCode').attr("isallowsub") == "true"){
        if(confirm("是否提交数据")){
            $('#newstu').submit();
        }
    }

})