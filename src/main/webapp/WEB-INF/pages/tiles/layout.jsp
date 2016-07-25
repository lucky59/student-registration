<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<div class="table-responsive">
	<table class="table">
	<tr>
		<td height="50" align="center" colspan="2" style="background-color: pink; border: thick;font:bold;"  >
		<tiles:insertAttribute name="header"/>
		</td>
		</tr>
		
		<tr>
		<td height="50" align="center" width="200" style="background-color: purple; border: thick;font:bold;">
		<tiles:insertAttribute name="menu"/>
		</td>
		<td height="200" align="center" width="400" style="background-color: yellow; border: thick;font:bold;">
		<tiles:insertAttribute name="title"/><br>
		<tiles:insertAttribute name="body"/>
		</td>
		</tr>
		
		<tr>
		<td height="50" align="center" colspan="2" style="background-color: pink; border: thick;font:bold;">
		<tiles:insertAttribute name="footer"/>
		</td>
		</tr>	
		
	</table>
	</div>
	</div>
	




</body>
</html>