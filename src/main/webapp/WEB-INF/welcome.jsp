<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	${getWelcome}
	
	<div>
		<form action="welcome" method="post" id="l" >
		
		First Name : <input type="text" id="fname" name="fname">
		Last Name : <input type="text" id="lname" name="lname">
		Address : <input type="text" id="address" name="address">
		
		<input type="submit" id="nameSubmit">
		</form>
		
	</div>
	
</body>
</html>