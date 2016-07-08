<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE HTML>
<html>
<head>
	<title>Home</title>
	
	<style>
		table, th, td {
		    border: 1px solid black;
		    border-collapse: collapse;
		}
		th, td {
		    padding: 15px;
		}
	</style>
</head>
<body>
<h1>
	Spring mvc example!  
</h1>

<table>
	<thead>
		<tr>
			<th>이름</th>
			<th>나이</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="sample" items="${sampleList}" varStatus="status">
			<tr>
				<td>${sample.name}</td>
				<td>${sample.age}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>
