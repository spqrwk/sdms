<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 		<div class="page-bar">
			<ul class="page-num-ul clearfix">
				<li>共${param.totalCount }条记录&nbsp;&nbsp; ${param.currentPageNo }/${param.totalPageCount }页</li>
				
				<!-- 
					首页   上一页   下一页  最后一页
					当前页 > 1 才显示首页和上一页
				 -->
				<c:if test="${param.currentPageNo > 1}">
					<%-- 前往第一页 --%>
					<a href="javascript:page_nav(document.forms[0],1);">首页</a>
					<!-- 前往当前页 - 1页 -->
					<a href="javascript:page_nav(document.forms[0],${param.currentPageNo-1});">上一页</a>
				</c:if>
				<!-- 
					当前页 < 总页数(最后一页) 才显示下一页和最后一页
				 -->
				<c:if test="${param.currentPageNo < param.totalPageCount }">
					<%-- 前往当前页 + 1页 --%>
					<!-- document.forms[0]  HTML DOM 获取当前页面的第一个form表单 -->
					<a href="javascript:page_nav(document.forms[0],${param.currentPageNo+1 });">下一页</a>
					<%-- 前往最后一页(totalPage总页数) --%>
					<a href="javascript:page_nav(document.forms[0],${param.totalPageCount });">最后一页</a>
				</c:if>
				&nbsp;&nbsp;
				
			</ul>
			
			 <span class="page-go-form"><label>跳转至</label>
		     <input type="text" name="inputPage" id="inputPage" class="page-key" />页
		     <input type="hidden" id="totalPage" value="${param.totalPageCount}"/>
		     <button type="button" class="page-btn" onClick='jump_to(document.forms[0],document.getElementById("inputPage").value)'>GO</button>
			</span>
		</div> 
</body>
<script type="text/javascript" src="${realPath}/statics/js/rollpage.js"></script>
</html>