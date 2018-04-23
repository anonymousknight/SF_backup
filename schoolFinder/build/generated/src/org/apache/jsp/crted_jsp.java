package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public final class crted_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Profile</title>\n");
      out.write("        <link href=\"css/enroll.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"Header\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("            <img src=\"folder/logo1.png\" class=\"img\" alt=\"\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"heading\">\n");
      out.write("            <h1>School-Finder</h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"enroll\">\n");
      out.write("            <h2>School-Enrollment</h2>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"con-1\">\n");
      out.write("            <input type=\"file\" name=\"f1\" class=\"file1\" />\n");
      out.write("            <input type=\"text\" name=\"txtbox\" class=\"txt1\" />\n");
      out.write("            </div>\n");
      out.write("        <div class=\"con-2\">\n");
      out.write("            <label>BOARD :<input type=\"text\" class=\"txt2\" name=\"f2\"></label>\n");
      out.write("            <label>MEDIUM :<input type=\"text\" class=\"txt2\" name=\"f2\"></label>\n");
      out.write("            <label>SCHOOL CODE :<input type=\"text\" class=\"txt2\" name=\"f2\"></label>\n");
      out.write("            <button class=\"butn\">Search</button>\n");
      out.write("            \n");
      out.write("        </div>  \n");
      out.write("      \n");
      out.write("       \n");
      out.write("        <div class=\"try\" name=\"beep\" >    \n");
      out.write("        <div class=\"con-3\">\n");
      out.write("            <h3 align=\"left\">CONTACT</h3>\n");
      out.write("            ADDRESS 1<input type=\"text\" name=\"addrs1\" value=\"\" class=\"c2\" /><br>\n");
      out.write("            ADDRESS 2<input type=\"text\" name=\"addrs1\" value=\"\" class=\"c2\"/><br>\n");
      out.write("            Email<input type=\"text\" name=\"eid\" value=\"\" class=\"c3\"/><br>\n");
      out.write("            PHONE<input type=\"text\"class=\"c4\" name=\"phone\" value=\"\" />\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("            <div class=\"loc\">\n");
      out.write("                <h3 align=\"center\">LOCATION</h3>\n");
      out.write("                <input type=\"file\" name=\"map\" value=\"\" />\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("        <div class=\"con-5\">\n");
      out.write("            <h3 align=\"center\">FACILITIES</h3>\n");
      out.write("            <input type=\"checkbox\" name=\"SMART CLASSROOM\" value=\"yes\" class=\"check1\" enabled=\"enabled\" />SMART CLASSROOM &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;\n");
      out.write("            <input type=\"checkbox\" name=\"HOSTEL\" value=\"ON\" class=\"check1\" />HOSTEL\n");
      out.write("            <br>\n");
      out.write("            <input type=\"checkbox\" name=\"HANDICAPPED SUPPORT\" value=\"ON\" class=\"check2\" />HANDICAPPED SUPPORT  &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <input type=\"checkbox\" name=\"AC\" value=\"ON\"class=\"check2\" />MEDICAL\n");
      out.write("            <br>\n");
      out.write("            <input type=\"checkbox\" name=\"TRANSPORT\" value=\"ON\" class=\"check3\" />TRANSPORT   &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <input type=\"checkbox\" name=\"MEDICAL\" value=\"ON\" class=\"check3\" />SPORTS\n");
      out.write("        </div>  \n");
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
