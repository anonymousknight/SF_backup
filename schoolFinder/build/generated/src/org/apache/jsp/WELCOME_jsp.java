package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WELCOME_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    \n");
      out.write("        <title>JSP Page</title> \n");
      out.write("            </head>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <body>\n");
      out.write("                \n");
      out.write("                <h1 align='center'> WELCOME TO SCHOOLFINDER</h1>\n");
      out.write("                <input type=\"submit\" align=\"center\" value=\"ADMIN\" name=\"ADMIN\" />\n");
      out.write("                <form name=\"SEARCH\" action=\" \" method=\"POST\" >\n");
      out.write("                      \n");
      out.write("                AREA  <select name=\"AREA\">\n");
      out.write("        <option>ENNORE</option>\n");
      out.write("        <option>MANALI</option>\n");
      out.write("        <option>THIRUVOTTIYUR</option>\n");
      out.write("        <option>TONDIARPET</option>\n");
      out.write("        <option>WASHERMENPET</option>\n");
      out.write("        <option>ROYPURAM</option>\n");
      out.write("        <option>PARRYS</option>\n");
      out.write("        <option>AVADI</option>\n");
      out.write("        <option>AMBATTUR</option>\n");
      out.write("        <option></option>\n");
      out.write("    </select>\n");
      out.write("               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("               \n");
      out.write("    BOARD OF EDUCATION<select name=\"BOARD\">\n");
      out.write("                    <option>MATRICULATION</option>\n");
      out.write("                    <option>STATE BOARD</option>\n");
      out.write("                    <option>CBSC</option>\n");
      out.write("                    <option>IBC</option></h4>\n");
      out.write("                    </select>\n");
      out.write("     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("  \n");
      out.write("   \n");
      out.write("  MEDIUM <select name=\"MEDIUM\">\n");
      out.write("      <option>TAMIL</option>\n");
      out.write("      <option>ENGLISH</option>\n");
      out.write("      <option>HINDI</option>\n");
      out.write("  </select>\n");
      out.write("  \n");
      out.write("  <br>\n");
      out.write("  <p align=\"center\">\n");
      out.write("     <input type=\"submit\"   value=\"SEARCH\" name=\"SEARCH\"  /></p>\n");
      out.write("  \n");
      out.write("  <h5> VIEW ALL</h5>\n");
      out.write("  \n");
      out.write("  <h3 align=\"center\"  > SEARCH RESULT </h3>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("                </form>\n");
      out.write("                             </body>\n");
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
