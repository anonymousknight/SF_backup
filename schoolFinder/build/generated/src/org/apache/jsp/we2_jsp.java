package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.*;

public final class we2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"we1.jsp\" method=\"POST\">\n");
      out.write("            \n");
      out.write("            AREA<select name=\"AREA\" class=\"d1\">\n");
      out.write("        <option>ENNORE</option>\n");
      out.write("        <option>MANALI</option> \n");
      out.write("        <option>THIRUVOTTIYUR</option>\n");
      out.write("        <option>TONDIARPET</option>\n");
      out.write("        <option>WASHERMENPET</option>\n");
      out.write("        <option>ROYPURAM</option>\n");
      out.write("        <option>PARRYS</option>\n");
      out.write("        <option>AVADI</option>\n");
      out.write("        <option>AMBATTUR</option>\n");
      out.write("        <option></option>\n");
      out.write("                  </select>\n");
      out.write("                  BOARD OF EDUCATION<select name=\"BOARD\" class=\"d2\">\n");
      out.write("                    <option>MATRICULATION</option>\n");
      out.write("                    <option>STATE BOARD</option>\n");
      out.write("                    <option>CBSC</option>\n");
      out.write("                    <option>IBC</option>                    </select>\n");
      out.write("                  MEDIUM <select name=\"MEDIUM\" class=\"d3\">\n");
      out.write("                      \n");
      out.write("      <option>T</option>\n");
      out.write("      <option>ENGLISH</option>\n");
      out.write("      <option>HINDI</option>\n");
      out.write("                  </select>\n");
      out.write("                  <br>\n");
      out.write("                  ");
 Connection con=null;
                  Statement st=null;
                  
      out.write("\n");
      out.write("                  <input type=\"submit\"  name=\"search\" value=\"submit\" class=\"search\">\n");
      out.write("                  <br><h3 class=\"h3\">RESULT</h3>\n");
      out.write("                   ");

            
                               String a = request.getParameter("AREA");
                               String b = request.getParameter("BOARD");
                               String c = request.getParameter("MEDIUM");
            
           String query = "select NAME,MEDIUM  from check2 where (ADD2,BOARD,MEDIUM) =('"+a+"','"+b+"','"+c+"')";
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=null;
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/check 2", "root", "");
          Statement st=con.createStatement();
          ResultSet rs = st.executeQuery(query);
         
         while (rs.next()){

      out.write("\n");
      out.write("                  <table border=\"1\" width=\"42\" cellspacing=\"15\" cellpadding=\"12\">\n");
      out.write("                      <thead>\n");
      out.write("                          <tr>\n");
      out.write("                              <th>TRYING</th>\n");
      out.write("                          </tr>\n");
      out.write("                      </thead>\n");
      out.write("                      <tbody>\n");
      out.write("                          <tr>\n");
      out.write("                              <td>HEY FOLKS</td>\n");
      out.write("                          </tr>\n");
      out.write("                      </tbody>\n");
      out.write("                  </table>\n");
      out.write("\n");
      out.write("                  \n");
      out.write("            ");
}
                  }catch(Exception e)
 {
     out.println(e);
 }
        
      out.write("                     \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
