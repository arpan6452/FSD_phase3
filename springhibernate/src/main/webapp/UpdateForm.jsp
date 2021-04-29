<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.user.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Form</title>
</head>
<body>
<button class="LoginLogOutButton" style="float: left;" type="button" onclick="location.href='index.jsp'">Home</button><br>
<br><br>
<% User user = (User)request.getAttribute("user");  %>
Hi, <%= user.getUsername() %>
<form action="UpdateUser" method="post">
<input type="hidden" name="userID" value="<%= user.getUserID() %>" ><br><br>
Username: <input type="text" name="username" value="<%= user.getUsername() %>" ><br><br>
Email: <input type="email" name="email" value="<%= user.getEmailId() %>" readonly><br><br>
Phone: <input type="tel" name="phoneNo" value="<%= user.getPhoneNo() %>" ><br><br>
Address: <input type="text" name="address" value="<%= user.getAddress() %>" ><br><br>
<input type="submit" value="Update">
</form>
</body>
</html>