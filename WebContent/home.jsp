<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<style>
body
{
   background-image : url("image/as.jfif");
   background-repeat : no-repeat;
   background-attachement : fixed;
   background-size: 1400px 700px;
   text-align:center;
   padding-top:200px;
}
form
{
   display: inline-block;
}
</style> 
<body bgcolor = "orange">
     <form method = "post" action = "HomeServlet">
     <table>
     <tbody>
     <tr>
     <td align = "left"><b>Name</b></td>
     <td><input type = "text" name = "name" required></td>
     </tr>
     <tr>
     <td align = "left"><b>Date</b></td>
     <td><input type ="date" name ="dates" required></td>
     </tr>
     <tr>
     <td><Button type = "Submit" name = "submit">Check</Button></td>
     
     </tbody>
     </table>
    </form>
     </body>
     </html>