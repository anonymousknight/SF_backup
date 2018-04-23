<%-- 
    Document   : CWELCUM
    Created on : 18 Feb, 2017, 10:23:56 PM
    Author     : Dark Knight
--%>


<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%
   Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
%>
<html>
    <link href="style.css" rel="stylesheet" type="text/css"/>
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    
   
    
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
                    <option>IBC</option>
                    </select>
                  MEDIUM <select name="MEDIUM" class="d3">
                      
      <option>T</option>
      <option>ENGLISH</option>
      <option>HINDI</option>
                  </select>
                  <br>
                  
                  <input type="submit"  name="search" value="submit" class="search">
                  <br><h3 class="h3">RESULT</h3>
                   <%
            
                               String a = request.getParameter("AREA");
                               String b = request.getParameter("BOARD");
                               String c = request.getParameter("MEDIUM");
            
           String query = "select * from logs ";
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/zeru","root","");
          pst=con.prepareCall(query);
          rs = pst.executeQuery(query);
         
         while (rs.next()){
%>
                  
                       <table border="1" width="100%" >
                           
                           <tr>
                               <th>Name</th>
                               <th>Password</th>
                           </tr>
                
                   <tr><td> <%=rs.getString("name")%> </td><td> <%=rs.getString("passwd")%> </td><td> <%=rs.getByte("image")%> </td></tr>
                
                  
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