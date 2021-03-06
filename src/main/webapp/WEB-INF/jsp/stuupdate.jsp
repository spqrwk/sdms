<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="../../common/header.jsp"%>

        <!-- Page Content -->
        <div class="content">
            <div class="pt-50 pb-20">
                <div class="block-content">
                    <form action="${realPath}/stu/addnew" method="post">
                        <div class="form-group row">
                            <label class="col-12">学生姓名</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="name" placeholder="请输出学生姓名..." value="${stu.name}">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12">身份证号</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="idNo" placeholder="请输入身份证号..." value="${stu.idNo}">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12">班级编号</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="clazzCode" placeholder="请输入班级编号..." value="${stu.clazzCode}">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12">宿舍</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="dormId" placeholder="请选择宿舍..." value="${stu.dormId}">
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-lg-8">
                                <div class="form-material">
                                    <input type="text" class="js-datepicker form-control" id="example-datepicker6" name="checkInDate" data-week-start="1" data-autoclose="true" data-today-highlight="true" data-date-format="yyyy-mm-dd" placeholder="请选择入住时间"  value="<fmt:formatDate value="${stu.checkInDate}" pattern="yyyy-MM-dd"/>">
                                    <label for="example-datepicker6">入住时间</label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-lg-8">
                                <div class="form-material">
                                    <input type="text" class="js-datepicker form-control" id="example-datepicker6-1" name="paymentDeadline" data-week-start="1" data-autoclose="true" data-today-highlight="true" data-date-format="yyyy-mm-dd" placeholder="请选择缴费截止日期"  value="<fmt:formatDate value="${stu.paymentDeadline}" pattern="yyyy-MM-dd"/>">
                                    <label for="example-datepicker6-1">缴费截止日期</label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12">备注</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="remarks" placeholder="请输入备注..."  value="${stu.remarks}">
                            </div>
                        </div>
                        ${updateResult}
                        <div align="center">
                            <div class="form-group row">
                                <div class="col-12">
                                    <button type="submit" class="btn btn-alt-primary">提交</button>
                                    <button type="button" class="btn btn-alt-secondary" data-wizard="prev" onclick="javascript:history.back(-1);">
                                        <i class="fa fa-angle-left mr-5"></i> 返回
                                    </button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- END Page Content -->
<%@include file="../../common/footer.jsp"%>
<script src="${realPath}/statics/assets/js/plugins/bootstrap-datepicker/js/bootstrap-datepicker.min.js"></script>
<script>jQuery(function(){ Codebase.helpers(['datepicker', 'colorpicker', 'maxlength', 'select2', 'masked-inputs', 'rangeslider', 'tags-inputs']); });</script>