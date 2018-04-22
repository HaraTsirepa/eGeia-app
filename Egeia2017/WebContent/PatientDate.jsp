<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
   <link rel="shortcut icon" type="image/png" href="photos/egeialogo.png"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>e-geia</title>
 <link rel="stylesheet" href="css/patdate.css">
</head>
<body>
            <h1>Please enter Doctor Availability</h1>
              
              
<div class="container">
 <br>
  	<img src="photos/logo.png">
     <form  action="PatDate" method="post">
     <table width="50%" bgcolor="#666666">
     <tr>
     <th>Doctor Id</th>
     <th>Patient Id</th> 
     <th>Date</th>
     <th>Duration</th> 
       <th>Time</th>
     <th>Price</th> 
     </tr>           
     <tr>
    <td><input type="text" name="doctorId" required="required"  > </td>
    <td><input type="text" name="patientId" required="required" > </td> 
     <td><input type="text" name="date" required="required"  > </td>
        <td><input type="text" name="duration" required="required"  > </td>
    <td><input type="text" name="time" required="required" > </td> 
        <td><input type="text" name="price" required="required" > </td> 
     </tr></table>
     <br>
     <input type="submit" value="Insert"> 
     </form></div>
</body>



</body>
</html>