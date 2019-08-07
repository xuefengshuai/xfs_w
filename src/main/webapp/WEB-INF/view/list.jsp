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
<a href="toAdd"><input type="button" value="添加"></a><br>
<input type="text" id="name"><input type="button" value="查询" onclick="query()">
	<table>
		<tr>
			<td><input type="checkbox" onclick="qx()">全选</td>
			<td>序号</td>
			<td>植物名称</td>
			<td>描述</td>
			<td>类别</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="s" varStatus="i">
			<tr>
				<td><input type="checkbox" value="${s.id }" class="ck"></td>
				<td>${i.index+1 }</td>
				<td>${s.name }</td>
				<td>${s.descc }</td>
				<td>${s.tname }</td>
				<td>
					<a href="look?id=${s.id }"><input type="button" value="查看"></a> 
					<input type="button" onclick="del(${s.id})" value="删除">
					<a href="toUpdate?id=${s.id }"><input type="button" value="修改"></a>
				</td>
			</tr>
			
		</c:forEach>
		<tr>
			<td colspan="6">${fenye }</td>
		</tr>
	</table>
	<input type="button" value="批量删除" onclick="ps()">
</body>
<script type="text/javascript">
function query(){
	var name=$("#name").val();
	location.href="list?name="+name;
}
function ps(){
	var ids=$(".ck:checked").map(function(){
		return this.value
	}).get().join(",")
	if(confirm("你确定要删除吗")){
		$.post("deletePatch",{ids,ids},function(obj){
			if(obj){
				 alert("删除成功")
				 location.href="list"
			}else{
				 alert("删除失败")
			}
		})
	}

}
	function qx(){
		$(".ck").prop("checked",true)
	}
	function del(id){
		if(confirm("你确定要删除吗")){
			$.post("del",{id:id},function(obj){
				if(obj){
					 alert("删除成功")
					 location.href="list"
				}else{
					 alert("删除失败")
				}
			})
		}
			
	}
</script>
</html>