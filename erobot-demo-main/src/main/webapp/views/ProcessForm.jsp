<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="in.cryptofocus.dev.erobotdemo.MainController" %>
     <%@page import="in.cryptofocus.dev.erobotdemo.GetterAndSetter" %>
<%@page import="java.util.*" %>    
<%@page import="java.io.*" %> 
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Response</title>
<style type="text/css">
*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: 'Poppins',sans-serif;
}
body{
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 10px;
  background: linear-gradient(135deg, #71b7e6, #9b59b6);
}
div {
  background-color: white;
  width: 1400px;
  border: 5px solid black;
  padding: 20px;
  margin: 5px;
}
</style>
</head>
<body>
    <div>
   <%! String Reply = GetterAndSetter.getReply(); %>
      <h2><u>Your entries is successfully entered</u></h2>
    <br><br>
   
    <br><br>
    <h3>response from server is: <span style="width:1300px; word-wrap:break-word; display:inline-block;"><% out.println(Reply); %></span> </h3> 
      <a href="data1.txt" download= "signed_pdf">Click here to download</a>
    </div>
</body>
</html>