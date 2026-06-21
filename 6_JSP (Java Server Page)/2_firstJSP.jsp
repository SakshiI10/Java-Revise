<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor='pink'>
	<% 
	int n1=Integer.parseInt(request.getParameter("num1"));
	int sq=n1*n1;
	out.print("Square of the number = "+sq);
	%>
</body>
</html>
<!-- No need of extending any class, any annotation or creating writer, request or response object -->
