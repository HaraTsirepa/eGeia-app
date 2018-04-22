<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
   <link rel="shortcut icon" type="image/png" href="photos/egeialogo.png"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>e-geia</title>
  <link rel="stylesheet" href="css/registration.css">

</head>
 <body>

<h1>Welcome Admin!!!</h1>
<div class="container">
  	<img src="photos/logo.png">
   <div align="center">
   <form action="Dr" method="post">
   <table style="width:100%">
  <tr>
    <td>Firstname</td>
    <td><input type="fname" name="fname"/></td>
  </tr>
  <tr>
    <td>Lastname</td>
    <td><input type="lname" name="lname"/></td>
  </tr>
  <tr>
    <td>Username</td>
    <td><input type="uname" name="uname"/></td>
  </tr>
  <tr>
    <td>Password</td>
    <td><input type="password" name="password"/></td>
  </tr>
    <tr>
    <td>Confirm Password</td>
    <td><input type="password" name="cpassword"/></td>
  </tr>
  <tr>
    <td>Email</td>
    <td><input type="email" name="email"/></td>
  </tr>
  <tr>
    <td>Gender</td>
    <td>
    <table><tr>
    Male&nbsp;&nbsp;&nbsp;&nbsp;:<input type="radio" name="gender" value="Male"/></tr><br>
    <tr>Female:<input type="radio" name="gender" value="Female"/></tr></table></td>
  </tr>
  <tr>
  <td>Specialty</td>
  <td>
  <select name="Speciality">
  <option value="pathologist">pathologist</option>
  <option value="ophthalmologist">ophthalmologist</option>
  <option value="orthopedist">orthopedist</option>
  </select>
  <tr></td></tr></table>
<br><br>
  <input type="submit" value="Register">

   </form></div></div>
  </body>
</html>