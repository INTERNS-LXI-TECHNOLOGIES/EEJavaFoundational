/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-30 05:00:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.lxisoft.servet.*;
import com.lxisoft.repository.*;
import com.lxisoft.sqlrepository.*;
import com.lxisoft.model.*;
import java.util.*;

public final class Display_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head> \r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\ttable th,td \r\n");
      out.write("\t{\twidth: 2px;\r\n");
      out.write("\t\tborder:2px solid black;\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("</style> \r\n");
      out.write("\t<h1 align=\"center\">CONTACTS</h1>\r\n");
      out.write("\t<title>\r\n");
      out.write("\tDisplay \t\r\n");
      out.write("\t</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body button style =\"background: lightgreen\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"Search\" method=\"get\">\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t <input type=\"text\" name=\"searchname\">\r\n");
      out.write("\t\t<input type=\"submit\" value=\"search\"><br><br>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t</form>\t\r\n");
      out.write("<table align=\"center\" style=\"border-collapse: collapse;\">\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t\t\t\t<th style=\"font-family: fantasy;font size: 10px\">NAME</th>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
 ArrayList<Contact> contactList=(ArrayList<Contact>) request.getAttribute("contactList");
	
	for(Contact i : contactList)
		{ 
      out.write("\r\n");
      out.write("\t\t\t<b>\r\n");
      out.write("\t\t\t<tr style=\" font-style:oblique;  \">\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<a href=\"Select.jsp?temp=");
      out.print(i.getId());
      out.write("\r\n");
      out.write("\t\t\t\t\t&temp1=");
      out.print(i.getFirstname());
      out.write("\r\n");
      out.write("\t\t\t\t\t&temp2=");
      out.print(i.getLastname());
      out.write("\r\n");
      out.write("\t\t\t\t\t&temp3=");
      out.print(i.getNumber());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" name=\"submit\" value=\"");
      out.print(i.getFirstname());
      out.write(" &nbsp;");
      out.print(i.getLastname());
      out.write("\">\r\n");
      out.write("\t\t\t\t</a><br>\r\n");
      out.write("\t\t\t\t\t<a href=\"Update.jsp?id=");
      out.print(i.getId());
      out.write("\"> EDIT &nbsp; </a> \r\n");
      out.write("\t                    <a href=\"Delete.jsp?id=");
      out.print(i.getId());
      out.write("\"> &nbsp;DELETE </a>\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t</b>\r\n");
      out.write("\t\t\t");

		} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<center><br>\r\n");
      out.write("<a style=\"font-family:fantasy; font size: 70px;\"  href=\"Add.jsp\" > ADD NEW CONTACT</a>\t\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
