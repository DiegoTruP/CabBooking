<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<table style="with: 80%">
			<tr>
				<td>Ride ID</td>
				<td>User ID</td>
				<td>Route ID</td>
			</tr>
		
			<c:forEach items="${rideList}" var="ride">
				<tr>
					<td>${ride.rideId}</td>
					<td>${ride.userId}</td>
					<td>${ride.routeId}</td>
					<!--<td><input value="Book" type="submit" /></td> --> 
				</tr>
			</c:forEach>

		</table>
	

</body>
</html>