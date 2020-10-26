// 分页查询
function page_nav(frm,num){
	frm.p.value = num;
	frm.submit();
}

// 点击Go按钮
function jump_to(frm,num){
	// alert(1)
	var totalPage = $('#totalPage').val()
	// 验证输入  正则表示可以输入1位到多位的数值  但是最小值一定是1
	var regexp=/^[1-9]\d*$/;
	if(!regexp.test(num)){
		alert("请输入大于0的正整数！");
	}else if(num - 0 > totalPage - 0){ // 1 <= inputPage <= totalPage
		alert('请输入1-'+totalPage+'范围的页码！')
	}else{
		// location.href="userlist.jsp?p="+inputPage
		page_nav(frm,num)
	}
}