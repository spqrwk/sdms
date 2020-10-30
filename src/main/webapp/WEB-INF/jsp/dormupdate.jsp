<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../../common/header.jsp"%>

        <!-- Page Content -->
        <div class="content">
            <div class="pt-50 pb-20">
                <div class="block-content">
                    <form action="${realPath}/dorm/update" method="post" id="dormupdate">
                        <input type="hidden" name="id" value="${dorm.id}"/>
                        <div class="form-group row">
                            <label class="col-12">公寓名称</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="aptName" id="aptName" placeholder="请输入公寓名称..." value="${dorm.aptName}">
                                <font color="red"></font>
                            </div>
                        </div>
                        <div class="form-group row" id="aptNameBlock">
                            <label class="col-12">宿舍编号</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="code" id="code" placeholder="请输入宿舍编号..." value="${dorm.code}">
                                <font color="red"></font>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12">单月费用</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="monthlyRent" placeholder="单月费用..." value="${dorm.monthlyRent}">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12">最大居住人数</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="tenantLimit" placeholder="请输入最大居住人数..." value="${dorm.tenantLimit}">
                            </div>
                        </div>
                        ${updateResult}
                        <div align="center">
                            <div class="form-group row">
                                <div class="col-12">
                                    <button type="button" class="btn btn-alt-primary" id="submitBtn">提交</button>
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
<script type="text/javascript" src="${realPath}/statics/localjs/dormupdate.js"></script>