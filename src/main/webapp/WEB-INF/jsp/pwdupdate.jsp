<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../../common/header.jsp"%>

        <!-- Page Content -->
        <div class="content">
            <div class="pt-50 pb-20">
                <div class="block-content">
                    <form action="${realPath}/user/pwdupdate" method="post">
                        <input type="hidden" name="id" value="${loginUser.id}">
                        <div class="form-group row">
                            <label class="col-12" for="example-password-input">旧密码</label>
                            <div class="col-md-9">
                                <input type="password" class="form-control" id="example-password-input" name="password" placeholder="请输入旧密码...">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12" for="example-password-input-new">新密码</label>
                            <div class="col-md-9">
                                <input type="password" class="form-control" id="example-password-input-new" name="newpassword" placeholder="请输入新密码...">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12" for="example-password-input-re">确认密码</label>
                            <div class="col-md-9">
                                <input type="password" class="form-control" id="example-password-input-re" placeholder="请确认密码...">
                            </div>
                        </div>
                        ${updateResult}
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