<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>home</title>
</head>
<body>

<%= %>

	<table>
		<c:forEach items="${graduates}" var="graduate">
			<tr>
				<td>${graduate.firstName}</td>
				<td>${graduate.email}</td>
				
			</tr>
		</c:forEach>
	</table>

</body>
</html>