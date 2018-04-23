<%-- 
    Document   : form3
    Created on : 20 Feb, 2017, 9:04:15 AM
    Author     : Dark Knight
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
           </head>
           <body>
        
        <%
            
String a=request.getParameter("txtbox");
String b=request.getParameter("f2");
String g=request.getParameter("checkbox1");
String d=request.getParameter("f4");
String i=request.getParameter("add1");
String f=request.getParameter("add2");
String c=request.getParameter("eid");
String h=request.getParameter("map");
          try
        {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/check 2", "root", "");
          
          Statement st = con.createStatement();
          
          st.executeUpdate("insert into check2(NAME,BOARD,MEDIUM,CODE,ADD1,ADD2,FK,LOC) values ('"+a+"','"+b+"','"+c+"','"+d+"','"+i+"','"+f+"','"+g+"','"+h+"')");
          
          
           out.println("enrolled");
        

        
        }
          
        
       
        
 catch(Exception e)
 {
     out.println(e);
 }
        %>
    </body>
</html>
