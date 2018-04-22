<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    

<%@ page import="java.util.List" %>
<%@ page import="com.main.egeia.models.Doctor" %>
<%@ page import="com.main.egeia.services.DoctorService" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <meta charset="UTF-8">
   <link rel="shortcut icon" type="image/png" href="photos/egeialogo.png"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>e-geia</title>
  <link rel="stylesheet" href="css/deletedoc.css">
<body>
</body>

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
DoctorService service = new DoctorService();
List<Doctor> doctors = service.GetDoctors();
for(Doctor doc : doctors)
{
%>
	<tr>
    	<td><%= doc.getFirstName() %></td>
    	<td><%= doc.getLastName() %></td> 
    	<td><%= doc.getId() %></td>
    	<td class="doctorId"><input type="button" value="Delete"></td>
    </tr>
<%
} 
%>
</table>
<script src="js/jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	
$('.doctorId').on('click', function(){
	
	var $that = $(this);
	var id = $that.prev().text(); 
	
	$.ajax({
		  method: "POST",
		  url: "/Egeia2017/DeleteDoctor",
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