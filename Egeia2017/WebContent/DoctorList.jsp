<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="com.main.egeia.models.Doctor" %>
<%@ page import="com.main.egeia.services.DoctorService" %>
<%@ page import="com.main.egeia.utils.SessionUtils" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<%
DoctorService service = new DoctorService();
List<Doctor> doctors = service.GetDoctors();
for(Doctor doc : doctors){
%>
<tr>
<td><%= doc.getId() %></td>
<td><%= doc.getFirstName() %> <%= doc.getLastName() %></td>
<td><%= doc.getSpeciality() %></td>
</tr>
<%} %>
</table>
</body>
</html>