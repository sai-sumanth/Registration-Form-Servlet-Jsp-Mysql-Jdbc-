<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Employee Registration Form</h1>
		<form action="register" method="post">
			ID<input type="text" name="id" placeholder="Enter id"><br>
			FIRSTNAME<input type="text" name="firstname" placeholder="Enter First Name"><br>
			LASTNAME<input type="text" name="lastname" placeholder="Enter Last Name"><br>
			USERNAME<input type="text" name="username" placeholder="Enter Username"><br>
			PASSWORD<input type="password" name="password" placeholder="Enter Password"><br>
			ADDRESS<input type="text" name="address" placeholder="Enter Address"><br>
			CONTACT<input type="text" name="contact" placeholder="Enter Contact"><br>
			<input type="submit">
		</form>
	</div>

</body>
</html>