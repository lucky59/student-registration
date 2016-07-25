<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="faculty" method="post" modelAttribute="facReg">
	<fieldset>
	<legend>List of Faculties Available</legend><br/>
	<form:label path="name">
	Name:<form:errors path="name" cssStyle="color:red"/>
	</form:label>
	<form:input path="name"/><br/>
	
	<form:label path="email">
	Email:<form:errors path="email" cssStyle="color:red"/>
	</form:label>
	<form:input path="email"/><br/>
	
	<form:label path="tech">
	Tech:<form:errors path="tech" cssStyle="color:red"/>
	</form:label>
	<form:input path="tech"/><br/>	
	<input type="submit" name="button" value="save">

	</fieldset>
	
	</form:form>
	
</body>
</html>