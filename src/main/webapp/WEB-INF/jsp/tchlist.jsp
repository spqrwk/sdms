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
                            <form class="form-inline" action="${realPath}/tch/list" method="post">
                                    <input type="hidden" name="p" value="1" />
                                <label class="sr-only" for="example-if-email">Email</label>
                                <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="example-if-email" name="tchName" placeholder="请输入班主任姓名..." value="${tchName}">
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
                                <th class="d-none d-sm-table-cell">姓名</th>
                                <%--
                                                            <th class="d-none d-sm-table-cell" style="width: 15%;">Access</th>
                                --%>
                                <th class="text-center" style="width: 15%;">操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${pageBean.rows}" var="tch" varStatus="status">
                                <tr>
                                    <td class="text-center">${status.count}</td>
                                    <td class="font-w600">${tch.name}</td>
                                        <%--                                <td class="d-none d-sm-table-cell">customer1@example.com</td>
                                                                        <td class="d-none d-sm-table-cell">
                                                                            <span class="badge badge-primary">Personal</span>
                                                                        </td>--%>
                                    <td class="text-center">
                                        <div class="btn-group">
                                            <a href="${realPath}/">
                                                <button type="button" class="btn btn-sm btn-secondary" data-toggle="tooltip" title="删除">
                                                    <i class="fa fa-times"></i>
                                                </button>
                                            </a>
                                        </div>
                                    </td>
                                </tr>
                            </c:forEach>

                            <%--                        <tr>
                                                        <td class="text-center">2</td>
                                                        <td class="font-w600">Ralph Murray</td>
                                                        <td class="d-none d-sm-table-cell">customer2@example.com</td>
                                                        <td class="d-none d-sm-table-cell">
                                                            <span class="badge badge-warning">Trial</span>
                                                        </td>
                                                        <td class="text-center">
                                                            <button type="button" class="btn btn-sm btn-secondary" data-toggle="tooltip" title="View Customer">
                                                                <i class="fa fa-user"></i>
                                                            </button>
                                                        </td>
                                                    </tr>--%>

                            </tbody>
                        </table>
                        <div class="row">
                            <div class="col-sm-12 col-md-5">
                                <div class="dataTables_info" id="DataTables_Table_2_info" role="status" aria-live="polite">总共 ${pageBean.totalCount}条数据
                                </div>
                            </div>
                            <div class="col-sm-12 col-md-7">
                                <div class="dataTables_paginate paging_full_numbers" id="DataTables_Table_2_paginate">
                                    <ul class="pagination">
                                        <c:if test="${pageBean.currentPage>1 }">
                                        <li class="paginate_button page-item first" id="DataTables_Table_2_first"><a href="javascript:page_nav(document.forms[0],1);" aria-controls="DataTables_Table_2"
                                                                                                                              data-dt-idx="0" tabindex="0" class="page-link">首页</a></li>
                                        <li class="paginate_button page-item previous" id="DataTables_Table_2_previous"><a href="javascript:page_nav(document.forms[0],${pageBean.currentPage-1}); " aria-controls="DataTables_Table_2"
                                                                                                                                    data-dt-idx="1" tabindex="0" class="page-link">上一页</a></li>
                                        </c:if>
                                        <li class="paginate_button page-item active"><a href="#" aria-controls="DataTables_Table_2" data-dt-idx="2"
                                                                                        tabindex="0" class="page-link">${pageBean.currentPage}</a></li>
                                        <c:if test="${pageBean.currentPage<pageBean.totalPage}">
                                            <li class="paginate_button page-item next" id="DataTables_Table_2_next"><a href="javascript:page_nav(document.forms[0],${pageBean.currentPage+1 });" aria-controls="DataTables_Table_2"
                                                                                                                       data-dt-idx="4" tabindex="0" class="page-link">下一页</a></li>
                                            <li class="paginate_button page-item last" id="DataTables_Table_2_last"><a href="javascript:page_nav(document.forms[0],${pageBean.totalPage });" aria-controls="DataTables_Table_2"
                                                                                                                       data-dt-idx="5" tabindex="0" class="page-link">尾页</a></li>
                                        </c:if>

                                    </ul>
                                </div>
                            </div>
                        </div>

                    <%--                        <c:import url="${realPath}/statics/jsp/rollpage.jsp">--%>
<%--                            <c:param name="totalCount" value="${pageBean.totalCount}" />--%>
<%--                            <c:param name="currentPageNo" value="${pageBean.currentPage}" />--%>
<%--                            <c:param name="totalPageCount" value="${pageBean.totalPage}" />--%>
<%--                        </c:import>--%>
                    </div>
                </div>
                <!-- END Dynamic Table Full -->
            </div>
        </div>
        <!-- END Page Content -->
<%@include file="../../common/footer.jsp"%>