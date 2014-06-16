<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="windows-1255"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>first try</p>
	<p>second try</p>
	<%!int x = 9;%>
	<%=x%>
	<p>
		Today's date:
		<%=(new java.util.Date()).toString()%>
	</p>
	<%--@ page import="java.util.ArrayList"--%>
	<%--
		ArrayList<Post> c = new ArrayList<Post>();
		String title = "try number ";
		String content = "succsses ";
		Integer x = 1;
		for (int i = 0; i < 10; i++) {
			c.add(new Post(title.concat(x.toString()), content.concat(x
					.toString())));
			x++;
		}
		for (int i = 0; i < 10; i++) {
	--%>
	
	<%-- {List<Integer> l=new List();}
		
		
--%>
</body>
</html>