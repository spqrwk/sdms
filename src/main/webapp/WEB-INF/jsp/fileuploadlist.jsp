<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../../common/header.jsp"%>
<!-- Page Content -->
<div class="content">
    <form id="excelForm" name="excelForm" method="post" enctype="multipart/form-data" action="${realPath}/user/fileupload">
        <label for="excelUpload">导入Excel数据信息</label>
        <input name="excelUpload" id="excelUpload" type="file">
        ${uploadResult}
    </form>
</div>
<!-- END Page Content -->
<%@include file="../../common/footer.jsp"%>