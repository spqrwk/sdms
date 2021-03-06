<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../../common/header.jsp"%>
        <!-- Page Content -->
        <div class="content">
            <div class="pt-50 pb-20">
                <div class="block-content">
                    <form action="be_forms_elements_bootstrap.html" method="post" enctype="multipart/form-data" onsubmit="return false;">
                        <div class="form-group row">
                            <label class="col-12">用户编码</label>
                            <div class="col-md-9">
                                <div class="form-control-plaintext">${user.userCode}</div>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12">用户昵称</label>
                            <div class="col-md-9">
                                <div class="form-control-plaintext">${user.username}</div>
                            </div>
                        </div>
                    </form>
                    <div align="center">
                    <div class="col-6">
                        <button type="button" class="btn btn-alt-secondary" data-wizard="prev" onclick="javascript:history.back(-1);">
                            <i class="fa fa-angle-left mr-5"></i> 返回
                        </button>
                    </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- END Page Content -->
<%@include file="../../common/footer.jsp"%>