<%-- 
    Document   : result
    Created on : 25 Feb, 2017, 10:54:28 PM
    Author     : Dark Knight
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <H1><%
            String a = request.getParameter("AREA");
            out.println("Select value is"+a);
         
        %>
       </h1>
    </body>
</html>
