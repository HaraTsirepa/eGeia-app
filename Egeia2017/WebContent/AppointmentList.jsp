<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="com.main.egeia.models.Doctor" %>
<%@ page import="com.main.egeia.services.DoctorService" %>
<%@ page import="com.main.egeia.models.Availability" %>
<%@ page import="com.main.egeia.services.DocAvailabilityService" %>
<%@ page import="com.main.egeia.utils.SessionUtils" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <meta charset="UTF-8">
   <link rel="shortcut icon" type="image/png" href="photos/egeialogo.png"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>e-geia</title>
  <link rel="stylesheet" href="css/askforapp.css">
<body>
<div class="container1">
<img src="photos/logo.png">
<h3>Doctors</h3>
<table style="width:100%" bgcolor="#666666">
<tr>
    	<th>Firstname</th>
    	<th>Lastname</th> 
    	<th>ID</th>
    </tr>
<%
DoctorService service = new DoctorService();
List<Doctor> doctors = service.GetDoctors();
for(Doctor doc : doctors){
%>
<tr>

<td><%= doc.getFirstName() %> <%= doc.getLastName() %></td>
<td><%= doc.getSpeciality() %></td>
<td><%= doc.getId() %></td>
</tr>
<%} %>
</table> </div>
<div class="container2">
<img src="photos/logo.png">
<h3>Availabilities</h3>
<table style="width:100%" bgcolor="#666666">
<tr>
    	<th>Date</th>
    	<th>Time</th> 
    	<th>Doctor Id</th>
    </tr>
<%
DocAvailabilityService avservice = new DocAvailabilityService();
List<Availability> availabilities = avservice.GetAppointments();
for(Availability av : availabilities)
{
%>
	<tr>
    	<td><%= av.getDate() %></td>
    	<td><%= av.getTime() %></td> 
    	<td><%= av.getDoctorId() %></td>
    
    </tr>
<%
} 

%>
</table>
</div>
</body>
</html>