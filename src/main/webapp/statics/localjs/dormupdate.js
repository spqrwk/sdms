$(function () {
    $("#aptName").on("blur",function(){
        if ($("#aptName").val() == null || $("#aptName").val().trim() == '') {
            $("#aptName").next().html("公寓名称不能为空");
            $("#aptName").attr("isallowsub", "false");
        } else {
            $("#aptName").attr("isallowsub", "true");
            $("#aptName").next().html("");
        }
    })

    $("#code").on("blur",function(){
        if ($("#code").val() == null || $("#code").val().trim() == '') {
            $("#code").next().html("宿舍编码不能为空");
            $("#code").attr("isallowsub", "false");
        } else {
            $("#code").next().html("");
            $("#code").attr("isallowsub", "true");
        }
    })
})

$('#submitBtn').click(function (){
    $('#aptName').blur();
    $('#code').blur();
    if( $('#aptName').attr("isallowsub") == "true" && $('#code').attr("isallowsub") == "true"){
        if(confirm("是否提交数据")){
            $('#dormupdate').submit();
        }
    }

})
