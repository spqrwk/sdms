<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="../../common/header.jsp"%>
        <!-- Page Content -->
        <div class="content">
            <div class="pt-50 pb-20">
                <!-- Dynamic Table Full -->
                <div class="block">
                    <div class="block-header block-header-default">
                        <div class="block-content block-content-full">
                            <form class="form-inline" action="${realPath}/stu/list" method="post">
                                <input type="hidden" name="p" value="1"/>
                                <label class="sr-only" for="example-if-email">Email</label>
                                <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="example-if-email" name="aptName" placeholder="请输入公寓名称..." value="${aptName}">
                                <label class="sr-only" for="tchName">Email</label>
                                <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="tchName" name="tchName" placeholder="请输入班主任姓名..." value="${tchName}">
                                <label class="sr-only" for="clazzCode">Email</label>
                                <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="clazzCode" name="clazzCode" placeholder="请输入班级编号..." value="${clazzCode}">
                                <div class="form-group row">
                                    <%--<label class="col-12" for="example-daterange1">选择日期</label>--%>
                                    <div class="col-lg-8">
                                        <div class="input-daterange input-group" data-date-format="yyyy-mm-dd" data-week-start="1" data-autoclose="true" data-today-highlight="true">
                                            <input type="text" class="form-control" id="example-daterange1" name="startDate" placeholder="起始日期" data-week-start="1" data-autoclose="true" data-today-highlight="true" data-date-format="yyyy-mm-dd" value="<fmt:formatDate value="${startDate}" pattern="yyyy-MM-dd"/>">
                                            <div class="input-group-prepend input-group-append">
                                                <span class="input-group-text font-w600">至</span>
                                            </div>
                                            <input type="text" class="form-control" id="example-daterange2" name="endDate" placeholder="截止日期" data-week-start="1" data-autoclose="true" data-today-highlight="true" data-date-format="yyyy-mm-dd" value="<fmt:formatDate value="${endDate}" pattern="yyyy-MM-dd"/>">
                                        </div>
                                    </div>
                                </div>
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
                                <th class="d-none d-sm-table-cell" class="text-center">公寓名称</th>
                                <th class="d-none d-sm-table-cell" class="text-center">宿舍编号</th>
                                <th class="d-none d-sm-table-cell" class="text-center">宿舍人数</th>
                                <th class="d-none d-sm-table-cell" class="text-center">学员姓名</th>
                                <th class="d-none d-sm-table-cell" class="text-center">身份证号</th>
                                <th class="d-none d-sm-table-cell" class="text-center">单月费用</th>
                                <th class="d-none d-sm-table-cell" class="text-center">班级</th>
                                <th class="d-none d-sm-table-cell" class="text-center">班主任</th>
                                <th class="d-none d-sm-table-cell" class="text-center">备注</th>
                                <th class="d-none d-sm-table-cell" class="text-center">入住时间</th>
                                <th class="d-none d-sm-table-cell" class="text-center">缴费截止日期</th>
                                <th class="text-center" style="width: 15%;">操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${pageBean.rows}" var="stu" varStatus="status">
                                <tr>
                                    <td class="text-center">${status.count}</td>
                                    <td class="font-w600">${stu.aptName}</td>
                                    <td class="font-w600">${stu.dormCode}</td>
                                    <td class="font-w600">${stu.tenantLimit}</td>
                                    <td class="font-w600">${stu.name}</td>
                                    <td class="font-w600">${stu.idNo}</td>
                                    <td class="font-w600">${stu.monthlyRent}</td>
                                    <td class="font-w600">${stu.clazzCode}</td>
                                    <td class="font-w600">${stu.tchName}</td>
                                    <td class="font-w600">${stu.remarks}</td>
                                    <td class="font-w600"><fmt:formatDate value="${stu.checkInDate}" pattern="yyyy-MM-dd"/></td>                                    </td>
                                    <td class="font-w600"><fmt:formatDate value="${stu.paymentDeadline}" pattern="yyyy-MM-dd"/></td>
                                    <td class="text-center">
                                        <div class="btn-group">
                                            <a href="${realPath}/stu/view?id=${stu.id}">
                                                <button type="button" class="btn btn-sm btn-secondary" data-toggle="tooltip" title="查看">
                                                    <i class="fa fa-user"></i>
                                                </button>
                                            </a>
                                            <a href="${realPath}/stu/toupdate?id=${stu.id}">
                                                <button type="button" class="btn btn-sm btn-secondary" data-toggle="tooltip" title="修改">
                                                    <i class="fa fa-pencil"></i>

                                                </button>
                                            </a>
                                            <a class="delStu" href="javascript:;" stuid="${stu.id}" stuname="${stu.name}">
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
                    </div>
                </div>
                <!-- END Dynamic Table Full -->
                <div align="center">
                    <div class="form-group row">
                        <div class="col-12">
                            <button type="submit" class="btn btn-alt-primary">导出当前页</button>
                            <button type="submit" class="btn btn-alt-primary">导出全部</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- END Page Content -->
<%@include file="../../common/footer.jsp"%>
<script type="text/javascript" src="${realPath}/statics/localjs/stulist.js"></script>
<script src="${realPath}/statics/assets/js/plugins/bootstrap-datepicker/js/bootstrap-datepicker.min.js"></script>
<script>jQuery(function(){ Codebase.helpers(['datepicker', 'colorpicker', 'maxlength', 'select2', 'masked-inputs', 'rangeslider', 'tags-inputs']); });</script>