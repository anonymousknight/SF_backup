package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <link href=\"css/cprofile.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("       <div class=\"Header\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("            <img src=\"folder/logo1.png\" class=\"img\" alt=\"\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"heading\">\n");
      out.write("            <h1>Welcome To School-Finder</h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"class1\">\n");
      out.write("            <img class=\"class2\" src=");
      out.write("  alt=\"\"/><h1>");
      out.write("</h1>\n");
      out.write("        </div><br><br>\n");
      out.write("        <div class=\"class3\">\n");
      out.write("            <label>BOARD:</label><label onclick=\"beep\"> MEDIUM:</label>            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"class4\">\n");
      out.write("            <table border=\"1\" class=\"class5\">\n");
      out.write("                <tr><th colspan=\"2\" bgcolor=\"maroon\"class=\"th\">LOCATION</th></tr>\n");
      out.write("                <tr><td class=\"class7\">");
      out.write("Address1</td><td class=\"class6\" rowspan=\"6\"> <img class=\"classic\" src=");
      out.write("  alt=\"\"/>");
      out.write("</td></tr>\n");
      out.write("                <tr><td class=\"class7\">Address2</td></tr>\n");
      out.write("                <tr><td class=\"class7\">Address3</td></tr>\n");
      out.write("                <tr><td class=\"class7\">Address4</td></tr>\n");
      out.write("                <tr><td class=\"class7\">Phone</td></tr>\n");
      out.write("                <tr><td class=\"class7\">Email</td></tr>\n");
      out.write("            </table>          \n");
      out.write("        </div>\n");
      out.write("                <div class=\"royal\">\n");
      out.write("                    <table border=\"1\" class=\"class8\">\n");
      out.write("                        <tr><th bgcolor=\"pink\"class=\"th2\">ABOUT</th></tr>\n");
      out.write("                        <tr class=\"class9\"><td>hi</td></tr>   \n");
      out.write("                      \n");
      out.write("                    </table>\n");
      out.write("                    <table border=\"1\" class=\"tok\">\n");
      out.write("                        <tr><th colspan=\"2\" bgcolor=\"skyblue\" class=\"th2\">FACILLITIES</th></tr>\n");
      out.write("                        <tr class=\"toko\"><td class=\"toku\">SMART CLASSROOM</td><td class=\"toki\"></td>  </tr>\n");
      out.write("                        <tr class=\"toko\"><td class=\"toku\">PLAY GROUND</td ><td class=\"toki\"></td>  </tr>\n");
      out.write("                        <tr class=\"toko\"><td class=\"toku\">Library</td><td class=\"toki\"></td>  </tr>\n");
      out.write("                        <tr class=\"toko\"><td class=\"toku\"></td><td class=\"toki\"></td>  </tr>\n");
      out.write("                        <tr class=\"toko\"><td class=\"toku\"></td><td class=\"toki\"></td>  </tr>\n");
      out.write("                        <tr class=\"toko\"><td class=\"toku\"></td><td class=\"toki\"></td>  </tr>\n");
      out.write("                        <tr class=\"toko\"><td class=\"toku\"> </td><td class=\"toki\"></td>  </tr>\n");
      out.write("                    </table>\n");
      out.write("                        \n");
      out.write("                 </div> \n");
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
