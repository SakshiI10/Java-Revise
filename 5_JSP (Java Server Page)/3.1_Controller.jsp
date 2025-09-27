<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String pageName=request.getParameter("page");
	if(pageName.equals("Java")){
		response.sendRedirect("javaCourse.jsp");
	}
	else if (pageName.equals("Javascript")){
		response.sendRedirect("javascriptCourse.jsp");
	}
	%>
</body>
</html>