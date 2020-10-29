<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../../common/header.jsp"%>

        <!-- Page Content -->
        <div class="content">
            <div class="pt-50 pb-20">
                <div class="block-content">
                    <form action="${realPath}/user/addnew" method="post">
                        <div class="form-group row">
                            <label class="col-12" for="example-text-input">用户编号</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" id="example-text-input" name="userCode" placeholder="请输入用户编号..." value="${user.userCode}">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12">用户昵称</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="username" placeholder="请输入用户昵称..." value="${user.username}">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12" for="example-password-input">密码</label>
                            <div class="col-md-9">
                                <input type="password" class="form-control" id="example-password-input" name="password" placeholder="请输入密码...">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12" for="example-password-input-re">确认密码</label>
                            <div class="col-md-9">
                                <input type="password" class="form-control" id="example-password-input-re" placeholder="请确认密码...">
                            </div>
                        </div>
                        ${addResult}
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