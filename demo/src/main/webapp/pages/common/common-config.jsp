<%@ page contentType="text/html; charset=UTF-8"%>
<%
	/* /demo */
	request.setAttribute("app",request.getContextPath());
%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
/* http://localhost:8080/demo/ */
request.setAttribute("basePath",request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/");
%>
<link rel="stylesheet" href="${app}/css/bootstrap/bootstrap.css">  
<script type="text/javascript" src="${app}/js/JQuery/jquery-3.0.0.js"></script>
<script type="text/javascript" src="${app}/js/JQuery/media/jquery.media.js"></script>