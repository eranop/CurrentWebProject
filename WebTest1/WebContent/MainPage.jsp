
<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="windows-1255"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1255">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="GetUCServlet">
		By clicking the "Enter" button you aprove you're over 18:
		<button name="subject" type="submit" value="enter">Enter</button>
		<button name="subject" type="submit" value="exit">Exit</button>
	</form>

</body>
</html>