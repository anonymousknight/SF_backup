<%-- 
    Document   : form1
    Created on : Feb 13, 2017, 5:16:04 PM
    Author     : jehoshua a
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.beans.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>

<%
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    String url = "jdbc:mysql://localhost:3306/check2?allowMultiQueries=true";
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ENROLL</title>
    </head>
    <body>
        <%
String a=request.getParameter("txtbox");
String b=request.getParameter("f2");
String c=request.getParameter("SMARTCLASSROOM");
String d=request.getParameter("f4");
String i=request.getParameter("add1");
String f=request.getParameter("add2");
String g=request.getParameter("eid");
String h=request.getParameter("map");
String query="insert into check2 values where NAME='"+a+"' MEDIUM='"+c+"' CODE='"+d+"' ADD1='"+i+"' ADD2='"+f+"' EMAIL'"+g+"' and  LOC'"+h+"'";




try
{
    Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/check 2","root","");
pst=con.prepareCall(query);
pst.execute(query);
   int count=pst.executeUpdate(query); 
         
}

catch (Exception e)
{
out.print(e);
}
%>
    </body>
</html>
