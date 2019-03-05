<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>adminregister</title>
</head>
<style>
body
{
   text-align:center;
   padding-top:200px;
}
form
{
   display: inline-block;
}
</style>
<body bgcolor = "orange">
     <form method = "post" action = "StudentServlet">
   <table>
   <tbody>
   <tr>
   <td align = "left">Id</td>
   <td><input type = "number" name = "id" required></td>
   </tr>
   <tr>
   <td align = "left">Name</td>
   <td><input type = "text" name = "name" required></td>
   </tr>
   <tr>
   <td align = "left">Password</td>
   <td><input type = "text" name = "password" required></td>
   </tr>
   <tr>
   <tr>
   <td align = "left">Dob</td>
   <td><input type = "date" name = "dob" required></td>
   </tr>
   <tr>
   <td align = "left">Email</td>
   <td><input type = "email" name = "email" required></td>
   </tr>
   <tr>
   <td align = "left">Phoneno</td>
   <td><input type = "number" name = "phoneno" required></td>
   </tr>
   
   </tbody>
   </table><br><br>
   <Button type = "Submit" name = "submit">Register</Button>
   </form>
   
</body>
</html>