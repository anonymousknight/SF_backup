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
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <%
String a=request.getParameter("txt1");
String b=request.getParameter("txt2");
String query="select * from login where uname='"+a+"' and passwd='"+b+"'";
try
{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolfinder","root","");
pst=con.prepareCall(query);
rs=pst.executeQuery(query);
if(rs.next())
{
 response.sendRedirect("aprofile.jsp"); 
         
}
else
{
    out.print("Failed");
}}
catch (Exception e)
{
out.print(e);
}
%>
    </body>
</html>
