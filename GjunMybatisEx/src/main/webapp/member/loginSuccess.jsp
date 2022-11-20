<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.member"%>
<%member m=(member)session.getAttribute("M"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<h1>歡迎<%=m.getName()%>，登入成功</h1>
<a href="../porder/index.jsp">開始購物</a>
</body>
</html>