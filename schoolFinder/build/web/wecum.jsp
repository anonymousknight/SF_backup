<%-- 
    Document   : CWELCUM
    Created on : 18 Feb, 2017, 10:23:56 PM
    Author     : Dark Knight
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page import="java.util.*" %>
<%
    Connection con =null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <link href="css/WELCOME.css" rel="stylesheet" type="text/css"/>
    
   
    
    <body >
    <form name="aj" action="WELCOME1.jsp" method="POST">
    
        <div class="Header">
            <div class="logo">
            <img src="folder/logo1.png" class="img" alt=""/>
            </div>
            <div class="heading">
            <h1>Welcome To School-Finder</h1>
            </div>
        </div>
        
    

        
        
        
     <a href="index.jsp" > admin</a>
       <div class="col"> <DIV class="wel-1">
                  AREA<select name="AREA" class="d1">
        <option>ENNORE</option>
        <option>MANALI</option> 
        <option>THIRUVOTTIYUR</option>
        <option>TONDIARPET</option>
        <option>WASHERMENPET</option>
        <option>ROYPURAM</option>
        <option>PARRYS</option>
        <option>AVADI</option>
        <option>AMBATTUR</option>
        <option></option>
                  </select>
                  BOARD OF EDUCATION<select name="BOARD" class="d2">
                    <option>MATRICULATION</option>
                    <option>STATE BOARD</option>
                    <option>CBSC</option>
                    <option>IBC</option></h4>
                    </select>
                  MEDIUM <select name="MEDIUM" class="d3">
                      
      <option>T</option>
      <option>ENGLISH</option>
      <option>HINDI</option>
                  </select>
                  <br>
                  
                  <input type="submit"  name="search" value="submit" class="search">
                  <br><h3 class="h3">RESULT</h3>
                  
                          
        </div>
    
    </body>
</form>
</html>