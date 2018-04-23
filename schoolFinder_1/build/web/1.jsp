<%-- 
    Document   : 1
    Created on : 25 Feb, 2017, 11:03:24 PM
    Author     : Dark Knight
--%>

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
   
      djghsedhb
         <%
            String a = request.getParameter("AREA");
            
           String query = "select NAME,MEDIUM  from check2 where ADD2 ='"+a+"'";
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/check 2", "root", "");
          Statement st=con.createStatement();
          ResultSet rs = st.executeQuery(query);
         
         while (rs.next()){
                   %>
                   
                   
                   kgfvlasgv
                   <table >
                      <tr><td><%=rs.getString("NAME")%></td><td><%=rs.getString("MEDIUM")%></td></tr>
                              
                  </table>
                    <%}         
        

        
}catch(Exception e)
 {
     out.println(e);
 }
        %>      
      
        
        
        
        
    
</html>
