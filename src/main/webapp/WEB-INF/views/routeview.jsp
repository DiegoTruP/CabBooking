<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Route available</h2>
	<form action="routes" method="post" name="routeForm">
	
	<input name="route" value="${route.routeId}" type="hidden" />
		<table style="with: 80%">
			<tr>
				<td>Source</td>
				<td>Destination</td>
				<td>Duration</td>
			</tr>
		
			<c:forEach items="${rList}" var="route">
				<tr>
					<td>${route.source}</td>
					<td>${route.destination}</td>
					<td>${route.duration}</td>
					<td><input type = "hidden"  name="action" value="book" />
					<input name="user" value="${userId}" type="hidden" />
					<!--<input value="book" type="submit" /> -->
					<input type="button" name="bt" value="book" onclick="{document.routeForm.route.value=${route.routeId};document.routeForm.submit();}" /></td>
					</td>
				</tr>
				
			</c:forEach>

		</table>
	</form>
		
	


</body>
</html>