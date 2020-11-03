<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../../common/header.jsp"%>
<!-- Page Content -->
<div class="content">


    <form id="excelForm" name="excelForm" method="post" enctype="multipart/form-data" action="${realPath}/stu/fileupload">
        <div class="form-group row">
            <label class="col-12">导入Excel数据信息</label>
            <div class="col-8">
                <div class="custom-file">
                    <!-- Populating custom file input label with the selected filename (data-toggle="custom-file-input" is initialized in Helpers.coreBootstrapCustomFileInput()) -->
                    <input type="file" class="custom-file-input" id="excelUpload" name="excelUpload" data-toggle="custom-file-input">
                    <label class="custom-file-label" for="excelUpload">选择Excel</label>
                </div>
                <br>
                ${uploadResult}
                <div class="form-group row">
                    <div class="col-12">
                        <button type="submit" class="btn btn-alt-primary">提交</button>
                    </div>
                </div>
            </div>
        </div>
    </form>
</div>
<!-- END Page Content -->
<%@include file="../../common/footer.jsp"%>