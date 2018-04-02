<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 引入公共的样式和js文件 -->
<%@ include  file="/pages/common/common-config.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%-- <base href="<%=basePath%>"> --%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    
<title>首页</title>
<script type="text/javascript">
</script>
</head>
<body>
<center>  
 <div class="panel panel-primary">  
   <div class="panel-heading" align="center">  
      <h2>首页目录</h2>  
   </div>  
   <div class="panel-body">
   	  <!-- 在线预览PDF文件 -->  
      <a href="pages/pdf/pdf.jsp">在线预览PDF文件</a> <br> <br>
      <a href="${app}/pdfController/loanContract1">在线预览PDF文件</a>  
   </div> 
</center>
</body>
</html>