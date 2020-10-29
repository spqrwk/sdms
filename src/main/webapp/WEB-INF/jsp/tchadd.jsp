<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../../common/header.jsp"%>

        <!-- Page Content -->
        <div class="content">
            <div class="pt-50 pb-20">
                <div class="block-content">
                    <form action="${realPath}/tch/addnew" method="post">

                        <div class="form-group row">
                            <label class="col-12" for="example-text-input">姓名</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" id="example-text-input" name="name" placeholder="请输入班主任姓名...">
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