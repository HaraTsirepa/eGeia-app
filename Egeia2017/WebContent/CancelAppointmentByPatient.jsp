<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    

<%@ page import="java.util.List" %>
<%@ page import="com.main.egeia.models.Appointment" %>
<%@ page import="com.main.egeia.services.AppointmentService" %>
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
    	<th>Firstname</th>
    	<th>Lastname</th> 
    	<th>ID</th>
    </tr>
<%
AppointmentService service = new AppointmentService();
List<Appointment> appointments = service.GetAppointments();
for(Appointment apo : appointments)
{
%>
	<tr>
    	<td><%= apo.getTime() %></td>
    	<td><%= apo.getDuration() %></td> 
    	
    	<td class="doctorId"><input type="button" value="Delete"></td>
    </tr>
<%
} 
%>
</table>
<script type="text/javascript">
$(document).ready(function(){
	console.log("yo");
	
$('.doctorId').on('click', function(){
	
	var $that = $(this);
	var id = $that.prev().text(); 
	
	$.ajax({
		  method: "POST",
		  url: "/Egeia2017/DelAppbypatient",
		  data: { doctorId: id }
		}).done(function( msg ) {
		    alert( "Data Saved: " + msg );
		});
});

	
});
</script> </div>
</form>

</body>
</html>