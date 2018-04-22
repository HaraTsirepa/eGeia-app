<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    

<%@ page import="java.util.List" %>
<%@ page import="com.main.egeia.models.Availability" %>
<%@ page import="com.main.egeia.services.DocAvailabilityService" %>
<%@ page import="com.main.egeia.utils.SessionUtils" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <meta charset="UTF-8">
   <link rel="shortcut icon" type="image/png" href="photos/egeialogo.png"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>e-geia</title>
  <link rel="stylesheet" href="css/deletedoc.css">
<body>
<body>

<h4>Welcome New User!!!</h4>
<form>
<div class="container">
  	<img src="photos/logo.png">
<table style="width:100%" bgcolor="#666666">
	<tr>
    	<th>Date</th> 
    	<th>Time</th>
    </tr>
<%
int userId = SessionUtils.getSessionUserId(session);

DocAvailabilityService service = new DocAvailabilityService();
List<Availability> availabilities = service.GetAppointments(userId);
for(Availability av : availabilities)
{
%>
	<tr>
    	<td><%= av.getDate() %></td>
    	<td><%= av.getTime() %></td> 
    
    </tr>
<%
} 
%>
</table>
</form>

</body>
</html>