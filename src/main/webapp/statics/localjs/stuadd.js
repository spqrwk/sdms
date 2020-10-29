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
                        options += "<option value=\"" + data[i].id + "\">" + data[i].code + "</option>";
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