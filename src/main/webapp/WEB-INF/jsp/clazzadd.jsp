<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../../common/header.jsp"%>
        <!-- Page Content -->
        <div class="content">
            <div class="pt-50 pb-20">
                <div class="block-content">
                    <form action="${realPath}/clazz/addnew" id="clazzadd" method="post">
                        <div class="form-group row">
                            <label class="col-12" for="clazzCode">班级编号</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" id="clazzCode" name="code" placeholder="请输入班级编号...">
                                <font color="red"></font>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-12" for="tchId">班主任</label>
                            <div class="col-md-9">
<%--                                <input type="text" class="form-control" name="tchId" id="tchId" placeholder="请输入班主任姓名...">--%>
                                <select type="text" class="form-control" name="tchId" id="tchId" placeholder="请输入班主任姓名..."></select>
                                <font color="red"></font>
                            </div>
                        </div>
                        ${addResult}
                        <div class="form-group row">
                            <div class="col-12">
                                <button type="button" id="subbutton" class="btn btn-alt-primary">提交</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- END Page Content -->
<%@include file="../../common/footer.jsp"%>
<script type="text/javascript" src="${realPath}/statics/localjs/clazzadd.js"></script>