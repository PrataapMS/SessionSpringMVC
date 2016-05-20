<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>Test page</h1>
	
	<p><b>You Are Now Logged Out: ${loggedout.firstName}</b></p>
	
	<hr />
	<h3>Request Scope (key==values)</h3>
	<%
		java.util.Enumeration<String> reqEnum = request.getAttributeNames();
		while (reqEnum.hasMoreElements()) {
			String s = reqEnum.nextElement();
			out.print(s);
			out.println("==" + request.getAttribute(s));
	%><br />
	<%
	}
	%>


	
	
	<p>This is <b>TEST</b> page.</p>
	<p>Don't forget: ${thought}</p>
	
	<p>The last student was: ${personObj.firstName}, ${personObj.age}</p>
	
	<p><b>TEST MESSAGE: ${testModel.firstName}</b></p>
	
	
	<p>
		<a href="logout.html">Log Out</a> <br/>
		<a href="person-form.html">Person page</a> <br />
		<a href="single-field.html">Single field page</a> <br />
		<a href="${pageContext.request.contextPath}">Main Page</a> <br/>
		
	</p>
</body>
</html>