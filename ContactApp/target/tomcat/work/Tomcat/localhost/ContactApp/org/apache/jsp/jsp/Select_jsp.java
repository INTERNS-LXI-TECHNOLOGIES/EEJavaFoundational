/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-26 10:18:38 UTC
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

public final class Select_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>CONTACT SELECTED</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color:#E6EC73;\">\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t#b1,#b2{\t\t\r\n");
      out.write("    background-color: blue;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-size: large;\r\n");
      out.write("\t}\r\n");
      out.write("\t\t#b3 {\r\n");
      out.write("\t\t\t  background-color: red;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-size: large;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#b4{\r\n");
      out.write("\t\t\tbackground-color: red;\r\n");
      out.write("\t\t\tfont-size: larger;\r\n");
      out.write("\t\t float: right;\t\r\n");
      out.write("\t\t margin: -28px 161px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<button id=\"b4\" onclick=\"window.location.href='");
      out.print(request.getContextPath());
      out.write("/index.jsp'\">close(X)</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");

	String selectId=(String) request.getParameter("selectId");
	Repository repository=new DbRepository();
	ArrayList<Contact> contactList=new ArrayList<Contact>();
	contactList=repository.findAll();
	SelectModel selectModel=new SelectModel();
	for(Contact contact:contactList)
	{
		if(contact.getId().equals(selectId))
			selectModel.setContact(contact);
	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<h2 style=\"margin: 47px;\">\r\n");
      out.write("\t\t\t<img src=\"person.jpg\" width=\"135\" height=\"135\">\r\n");
      out.write("\t\t</h2>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<h1>Id: ");
      out.print(selectModel.getContact().getId());
      out.write("</h1>\r\n");
      out.write("\t\t<h1>Name: ");
      out.print(selectModel.getContact().getName());
      out.write("</h1>\r\n");
      out.write("\t\t<h1>Number: ");
      out.print(selectModel.getContact().getNumber());
      out.write("</h1> \r\n");
      out.write("\t</div>\r\n");
      out.write("\t");

	session.setAttribute("selectModel",selectModel);
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<form action=\"..\\deleteContact\">\r\n");
      out.write("\t\t    <input type=\"submit\" id=\"b1\" value=\"delete\" onclick=\"return confirm('Are you sure you want to delete?')\" />\r\n");
      out.write("\t\t</form><br>\r\n");
      out.write("\r\n");
      out.write("\t\t<button id=\"b2\" onclick=\"window.location.href='");
      out.print(request.getContextPath());
      out.write("/jsp/Edit.jsp'\">Edit</button><br><br><br><br><br><br><br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<button id=\"b3\" onclick=\"goBack()\">Go Back</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\tfunction goBack() {\r\n");
      out.write("  \twindow.history.back();\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
