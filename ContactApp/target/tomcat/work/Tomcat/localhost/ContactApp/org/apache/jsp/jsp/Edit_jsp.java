/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-27 04:34:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.lxisoft.controller.*;
import com.lxisoft.domain.*;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
import java.util.*;

public final class Edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>EDIT CONTACT</title>\r\n");
      out.write("\t<center style=\"color: blue\"><h1><b>Edit contact</b><h1></center>\r\n");
      out.write("</head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t#b3{\r\n");
      out.write("\t\t\tbackground-color: red;\r\n");
      out.write("\t\t\tfont-size: larger;\r\n");
      out.write("\t\t float: right;\t\r\n");
      out.write("\t\t  margin: -54px 161px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\tform{\r\n");
      out.write("    font-size: xx-large;\r\n");
      out.write("    margin: 79px\r\n");
      out.write("\t\t}\r\n");
      out.write("\tinput{\r\n");
      out.write("\t\t\tpadding-right: 50px;\r\n");
      out.write("\t\t\tpadding-top: 10px;\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t#b1{\r\n");
      out.write("\t\t\t\r\n");
      out.write("    background-color: blue;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-size: large;\r\n");
      out.write("\t}\r\n");
      out.write("\t#b2 {\r\n");
      out.write("\t\t\t  background-color: red;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-size: large;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<button id=\"b3\" onclick=\"window.location.href='");
      out.print(request.getContextPath());
      out.write("/index.jsp'\">close(X)</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background-color:#E6EC73;\">\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t<form action=\"..\\editContact\" method=\"post\">\r\n");
      out.write("\t\t\tFirst Name:<input type=\"type\" name=\"firstName\" placeholder=\"enter first name to save\"><br><br>\r\n");
      out.write("\t\t\tLast Name:<input type=\"type\" name=\"lastName\" placeholder=\"enter last name to save\"><br><br>\r\n");
      out.write("\t\t\tNumber:<input type=\"type\" name=\"number\" placeholder=\"enter new name\"><br><br>\r\n");
      out.write("\t\t\t<button id=\"b1\" type=\"submit\" >confirm</button><br><br><br>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<button id=\"b2\"  onclick=\"onclick=goBack()\">Back</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\tfunction goBack() {\r\n");
      out.write("  \twindow.history.back();\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
