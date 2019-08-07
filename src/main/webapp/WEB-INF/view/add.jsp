<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/resource/css/css.css">
</style>
</head>
<script type="text/javascript" src="<%=request.getContextPath() %>/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/jquery-1.11.0.min.js"></script>
<body>
	<form>
	<table>
		<tr>
			<td>名字:<input type="text"  name="name"></td>
		</tr>
		<tr>
			<td>描述:<input type="text"  name="descc"></td>
		</tr>
		<tr>
			<td>类别:<select id="type" name="tid"></select></td>
		</tr>
		<tr>
			<td><input type="button" value="添加" onclick="add()"></td>
		</tr>
		</table>
		</form>
</body>
<script type="text/javascript">
function add(){
	if($("[name='name']").val().length<=0){
		alert("添加失败")
		return;
	}
	if($("[name='descc']").val().length<=0){
		alert("添加失败")
		return;
	}
	if($("[name='tid']").val().length<=0){
		alert("添加失败")
		return;
	}
	
	$.post("add",$("form").serialize(),function(obj){
		if(obj){
			 alert("添加成功")
			 location.href="list"
		}else{
			 alert("添加失败")
		}
	})
}
$(function(){
	$.get("getType",function(list){
		for(var i in list){
			
			$("#type").append("<option value='"+list[i].tid+"'>"+list[i].tname+"</option>")
		}
		
	})
})
</script>
</html>