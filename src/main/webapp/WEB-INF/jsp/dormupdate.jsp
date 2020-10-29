<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../../common/header.jsp"%>

        <!-- Page Content -->
        <div class="content">
            <div class="pt-50 pb-20">
                <div class="block-content">
                    <form action="${realPath}/dorm/update" method="post">
                        <input type="hidden" name="id" value="${dorm.id}"/>
                        <div class="form-group row">
                            <label class="col-12">宿舍编号</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="code" placeholder="请输入宿舍编号..." value="${dorm.code}">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12">公寓名称</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="aptName" placeholder="请输入公寓名称..." value="${dorm.aptName}">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12">单月费用</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="monthlyRent" placeholder="单月费用..." value="${dorm.monthlyRent}">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12">最大住宿人数</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="tenantLimit" placeholder="请输入最大住宿人数..." value="${dorm.tenantLimit}">
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-12">
                                <button type="submit" class="btn btn-alt-primary">提交</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- END Page Content -->
<%@include file="../../common/footer.jsp"%>