<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>Home page</h1>
	<p>This is Home page.</p>
	<p>Don't forget: ${thought}</p>
	
	<p>The last student was: ${personObj.firstName}, ${personObj.age}</p>
	
	<p>
		<a href="person-form.html">Person page</a> <br />
		<a href="single-field.html">Single field page</a>
		<a href="test-message.html"><b>TEST page</b></a> <br />
	</p>
</body>
</html>