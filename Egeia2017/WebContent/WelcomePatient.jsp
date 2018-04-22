<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
   <link rel="shortcut icon" type="image/png" href="photos/egeialogo.png"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>e-geia</title>
 <link rel="stylesheet" href="css/login.css">
     <link rel="stylesheet" href="css/patlogin.css">
</head>
<body>
            <h4>Please enter user name and password</h4>
            <div class="container">
              <br>
  	<img src="photos/logo.png">
            <form  action="Patl" method="post">
               <input type="text" name="uname" required="required" placeholder="Username" >
                <input type="password" name="password" required="required" placeholder="Password" >
                <input type="submit" value="log in">
               
            </form>
            
<p style="color:#800000;">If you are not registered yet, please sign  up!<br><a href='NewPatientRegistration.jsp'>Register here!</a></p>
            </div>
</body>
</html>