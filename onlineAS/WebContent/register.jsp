<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="registerServlet" method="post">
		
		Name:<input type="text" name="userName"/><br/><br/>
		Password:<input type="password" name="userPass"/><br/><br/>
		Email Id:<input type="text" name="userEmail"/><br/><br/>
		Country:
		<select name="userCountry">
		<option>India</option>
		<option>Pakistan</option>
		<option>other</option>
		</select>
		
		<br/><br/>
		<input type="submit" value="register"/>

	</form>
</body>
</html>