<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<title>Multiplication Table</title>
</head>

<body>

<h2>Multiplication Table</h2>

<%
int num = Integer.parseInt(request.getParameter("num"));

for(int i=1; i<=10; i++)
{
    out.println(num + " x " + i + " = " + (num*i) + "<br>");
}
%>

</body>
</html>