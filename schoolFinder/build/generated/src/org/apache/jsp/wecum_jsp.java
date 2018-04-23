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

public final class wecum_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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

    Connection con =null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <link href=\"css/WELCOME.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    \n");
      out.write("    <body >\n");
      out.write("    <form name=\"aj\" action=\"WELCOME1.jsp\" method=\"POST\">\n");
      out.write("    \n");
      out.write("        <div class=\"Header\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("            <img src=\"folder/logo1.png\" class=\"img\" alt=\"\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"heading\">\n");
      out.write("            <h1>Welcome To School-Finder</h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("     <a href=\"index.jsp\" > admin</a>\n");
      out.write("       <div class=\"col\"> <DIV class=\"wel-1\">\n");
      out.write("                  AREA<select name=\"AREA\" class=\"d1\">\n");
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
      out.write("                    <option>IBC</option></h4>\n");
      out.write("                    </select>\n");
      out.write("                  MEDIUM <select name=\"MEDIUM\" class=\"d3\">\n");
      out.write("                      \n");
      out.write("      <option>T</option>\n");
      out.write("      <option>ENGLISH</option>\n");
      out.write("      <option>HINDI</option>\n");
      out.write("                  </select>\n");
      out.write("                  <br>\n");
      out.write("                  \n");
      out.write("                  <input type=\"submit\"  name=\"search\" value=\"submit\" class=\"search\">\n");
      out.write("                  <br><h3 class=\"h3\">RESULT</h3>\n");
      out.write("                  \n");
      out.write("                          \n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</form>\n");
      out.write("</html>");
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
