<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../../common/header.jsp"%>

        <!-- Page Content -->
        <div class="content">
            <div class="pt-50 pb-20">
                <!-- Dynamic Table Full -->
                <div class="block">
                    <div class="block-header block-header-default">
                        <div class="block-content block-content-full">
                            <form class="form-inline" action="${realPath}/user/list" method="post">
                                <input type="hidden" name="p" value="1"/>
                                <label class="sr-only" for="example-if-email">Email</label>
                                <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="example-if-email" name="userCode" placeholder="请输入用户编号..." value="${clazzCode}">
                                <label class="sr-only" for="example-if-email">Email</label>
                                <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="example-if-email" name="username" placeholder="请输入昵称..." value="${username}">
                                <button type="submit" class="btn btn-alt-primary">查询</button>
                            </form>
                        </div>
                    </div>
                    <div class="block-content block-content-full">
                        <!-- DataTables functionality is initialized with .js-dataTable-full class in js/pages/be_tables_datatables.min.js which was auto compiled from _es6/pages/be_tables_datatables.js -->
                        <table class="table table-bordered table-striped table-vcenter js-dataTable-full">
                            <thead>
                            <tr>
                                <th class="text-center">序号</th>
                                <th class="d-none d-sm-table-cell" class="text-center">用户编码</th>
                                <th class="d-none d-sm-table-cell" class="text-center">昵称</th>
                                <th class="text-center" style="width: 15%;">操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${pageBean.rows}" var="user" varStatus="status">
                                <tr>
                                    <td class="text-center">${status.count}</td>
                                    <td class="font-w600">${user.userCode}</td>
                                    <td class="font-w600">${user.username}</td>
                                    <td class="text-center">
                                        <div class="btn-group">
                                            <a href="${realPath}/user/view?id=${user.id}">
                                                <button type="button" class="btn btn-sm btn-secondary" data-toggle="tooltip" title="查看">
                                                    <i class="fa fa-user"></i>
                                                </button>
                                            </a>
                                            <a href="${realPath}/user/toupdate?id=${user.id}">
                                                <button type="button" class="btn btn-sm btn-secondary" data-toggle="tooltip" title="修改">
                                                    <i class="fa fa-pencil"></i>

                                            </button>
                                            </a>
                                            <a href="${realPath}/">
                                                <button type="button" class="btn btn-sm btn-secondary" data-toggle="tooltip" title="删除">
                                                    <i class="fa fa-times"></i>
                                                </button>
                                            </a>
                                        </div>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
                <!-- END Dynamic Table Full -->
            </div>
        </div>
        <!-- END Page Content -->
<%@include file="../../common/footer.jsp"%>