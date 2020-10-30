<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../../common/header.jsp"%>

        <!-- Page Content -->
        <div class="content">
            <div class="pt-50 pb-20">
                <div class="block-content">
                    <form action="${realPath}/stu/addnew" method="post" id="stuAddForm">
                        <div class="form-group row">
                            <label class="col-12">学生姓名</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="name" placeholder="请输出学生姓名...">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12">身份证号</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="idNo" placeholder="请输入身份证号...">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12" for="clazzCode">班级编号</label>
                            <div class="col-md-9">
                                <select type="text" class="form-control" name="clazzCode" id="clazzCode" placeholder="请输入班级编号..."></select>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12" for="aptName">公寓</label>
                            <div class="col-md-9">
                                <select type="text" class="form-control" id="aptName" name="aptName" placeholder="请选择公寓..."></select>
                            </div>
                        </div>
                        <div class="form-group row" id="dormStatus">
                            <label class="col-12" for="dormCode">宿舍</label>
                            <div class="col-md-9">
                                <select type="text" class="form-control" id="dormCode" name="dormId" placeholder="请选择宿舍..."></select>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-lg-8">
                                <div class="form-material">
                                    <input type="text" class="js-datepicker form-control" id="example-datepicker6" name="checkInDate" data-week-start="1" data-autoclose="true" data-today-highlight="true" data-date-format="yyyy-mm-dd" placeholder="请选择入住时间">
                                    <label for="example-datepicker6">入住时间</label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-lg-8">
                                <div class="form-material">
                                    <input type="text" class="js-datepicker form-control" id="example-datepicker6-1" name="paymentDeadline" data-week-start="1" data-autoclose="true" data-today-highlight="true" data-date-format="yyyy-mm-dd" placeholder="请选择缴费截止日期">
                                    <label for="example-datepicker6-1">缴费截止日期</label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12">备注</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="remarks" placeholder="请输入备注...">
                            </div>
                        </div>
                        ${addResult}
                        <div class="form-group row">
                            <div class="col-12">
                                <button type="button" class="btn btn-alt-primary" id="submitBtn">提交</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- END Page Content -->
<%@include file="../../common/footer.jsp"%>
<script type="text/javascript" src="${realPath}/statics/localjs/stuadd.js"></script>