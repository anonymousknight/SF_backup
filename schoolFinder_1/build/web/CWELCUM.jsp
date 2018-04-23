<%-- 
    Document   : CWELCUM
    Created on : 18 Feb, 2017, 10:23:56 PM
    Author     : Dark Knight
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.beans.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.Statement"%>
<%
    Connection con=null;
    ResultSet rs=null;
    String url = "jdbc:mysql://localhost:3306/check2?allowMultiQueries=true";
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <link href="css/WELCOME.css" rel="stylesheet" type="text/css"/>
    <body background ="folder/doodle-1.jpg" alt=""/>
    <form action="WELCOME.jsp" method="POST">
    </form>
        <div class="Header">
            <div class="logo">
            <img src="folder/logo1.png" class="img" alt=""/>
            </div>
            <div class="heading">
            <h1>Welcome To School-Finder</h1>
            </div>
        </div>
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
                      
      <option>TAMIL</option>
      <option>ENGLISH</option>
      <option>HINDI</option>
                  </select>
                  <br>
                  
                  <input type="button" value="SEARCH" name="search" class="search">
                  <br><h3 class="h3">RESULT</h3>
                  
                  
                  <table border="1" class="tab1">
                      
                      
                        <%
            String a = request.getParameter("AREA");
             String b = request.getParameter("BOARD");
            String c = request.getParameter("MEDIUM");
            
           String query = "select NAME,MEDIUM  from check2 where (ADD2,BOARD,MEDIUM) =('"+a+"','"+b+"','"+c+"');";
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/check 2","root"," ");
          Statement st=con.createStatement();
          rs = st.executeQuery(query);
          while (rs.next()){
                   %>
                  
                   
                   <tr><td> <%=rs.getString("NAME")%> </td><td> <%=rs.getString("MEDIUM")%> </td></tr>
                  
                  
                 <%}
                  }catch(Exception e)
 {
     out.println(e);
 }
        %>      
                     
                  </table>
                  
                  
        </div>
        </form>
    </body>
</html>
