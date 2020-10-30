$(function () {
    $("#aptNameBlock").css('display', 'none')
    $("#aptName").on("blur",function(){
        if ($("#aptName").val() == null || $("#aptName").val().trim() == '') {
            $("#aptName").next().html("公寓名称不能为空");
            $("#aptName").attr("isallowsub", "false");
        } else {
            $("#aptName").next().html("");
            $("#aptNameBlock").css("display", "block")
            $("#code").on("blur",function(){
                if ($("#code").val() == null || $("#code").val().trim() == '') {
                    $("#code").next().html("宿舍编码不能为空");
                    $("#code").attr("isallowsub", "false");
                } else {
                    $.ajax({
                        type: "GET",
                        url: path + "/dorm/countbyanadc",
                        data: {"aptName": $("#aptName").val(), "code": $("#code").val()},
                        dataType: "JSON",
                        success: function (result) {
                            if (result.code == "0") {
                                $("#code").next().html("");
                                $("#aptName").attr("isallowsub", "true");
                                $("#code").attr("isallowsub", "true");
                            } else {
                                $("#code").next().html("该宿舍编码已存在");
                                $("#aptName").attr("isallowsub", "false");
                                $("#code").attr("isallowsub", "false");
                            }
                        },
                        error: function (data) {
                            $("#code").next().html("请求失败");
                        }
                    })
                }
            })
        }
    })
})

$('#submitBtn').click(function (){
    $('#aptName').blur();
    $('#code').blur();
    if( $('#aptName').attr("isallowsub") == "true" && $('#code').attr("isallowsub") == "true"){
        if(confirm("是否提交数据")){
            $('#dormadd').submit();
        }
    }

})
