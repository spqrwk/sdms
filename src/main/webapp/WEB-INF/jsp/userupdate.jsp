<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../../common/header.jsp"%>

        <!-- Page Content -->
        <div class="content">
            <div class="pt-50 pb-20">
                <div class="block-content">
                    <form action="${realPath}/user/update" method="post">
                        <input type="hidden" name="id" value="${user.id}">
                        <div class="form-group row">
                            <label class="col-12">用户编号</label>
                            <div class="col-md-9">
                                <div class="form-control-plaintext">${user.userCode}</div>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12">用户昵称</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="username" placeholder="请输入用户昵称..." value="${user.username}">
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