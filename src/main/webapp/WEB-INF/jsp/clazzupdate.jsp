<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../../common/header.jsp"%>
        <!-- Page Content -->
        <div class="content">
            <div class="pt-50 pb-20">
                <div class="block-content">
                    <form action="${realPath}/clazz/update?id=${clazz.id}" method="post">
                        <div class="form-group row">
                            <label class="col-12" for="example-text-input">班级编号</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" id="example-text-input" name="code" placeholder="请输入班级编号..." value="${clazz.code}">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12" for="example-text-input">班主任</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="tchId" placeholder="请输入班主任姓名..." value="${clazz.tchId}">
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