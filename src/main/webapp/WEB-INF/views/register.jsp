<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<form action="users" method="post">
		<table style="with: 80%">
			<tr>
				<td>User Name</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>PhoneNO</td>
				<td><input type="text" name="phoneNo" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" /></td>
			</tr>
		</table>
		<input type = "hidden" name="action" value="register"/>
		<input type="submit" value="Register" />
	</form>
</body>
</html>