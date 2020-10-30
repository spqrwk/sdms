<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../../common/header.jsp"%>
        <!-- Page Content -->
        <div class="content">
            <div class="pt-50 pb-20">
                <div class="block-content">
                    <form action="${realPath}/clazz/update?id=${clazz.id}" id="clazzupdate" method="post">
                        <div class="form-group row">
                            <label class="col-12" for="clazzCode">班级编号</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" id="clazzCode" name="code" placeholder="请输入班级编号..." value="${clazz.code}">
                                <font color="red"></font>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12" for="tchId">班主任</label>
                            <div class="col-md-9">
                                <select type="text" class="form-control" name="tchId" id="tchId" placeholder="请输入班主任姓名..." value="${clazz.tchId}"></select>
                                <font color="red"></font>
                            </div>
                        </div>
                        ${updateResult}
                        <div align="center">
                            <div class="form-group row">
                                <div class="col-12">
                                    <button type="button" class="btn btn-alt-primary" id="subbutton">提交</button>
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
<script type="text/javascript" src="${realPath}/statics/localjs/clazzupdate.js"></script>