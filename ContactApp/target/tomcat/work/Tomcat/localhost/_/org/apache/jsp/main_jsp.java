/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-28 08:23:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.lxisoft.Domain.*;
import com.lxisoft.Models.*;
import java.util.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("<title> CONTACT APP</title>\r\n");
      out.write("<head>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\"><CENTER><font color=\"red\" size=\"32\"><b> CONTACT APP </b></font></CENTER></head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"addnew.jsp\"><button >+</button></a>\r\n");
      out.write("</button> \r\n");
      out.write(" <center>\r\n");
      out.write("<form action=\"search\" method=\"GET\"  align=\"center\">\r\n");
      out.write("\t<font color=\"white\"> search a contact: </font><br><input  type=\"text\"  align=\"center\" name=\"user\">\r\n");
      out.write("\t<button name=\"search\" type=\"submit\">search</button></form>\r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("<center><button  onclick=\"window.location.href='deleteAll';\" >delete All Contact</button> <br>\r\n");
      out.write("<form action=\"sort\">\r\n");
      out.write("\t<select name=\"sort\">\r\n");
      out.write("\t\t<option value=\"first\">first name</option>\r\n");
      out.write("\t\t<option value=\"last\">last name</option>\r\n");
      out.write("\t\t<option value=\"id\">id</option>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</select>\r\n");
      out.write("\t<input type=\"submit\" value=\"sort\">\r\n");
      out.write("</form>\r\n");
      out.write("<button onclick=\"window.location.href='viewall';\">refresh</button></center>\r\n");
 ArrayList<ViewListModel>contacts=new ArrayList<ViewListModel>();
contacts=(ArrayList<ViewListModel>)session.getAttribute("contacts"); 
      out.write("\r\n");
      out.write("\r\n");
 	if(contacts.size()==0  ){ 
      out.write('\r');
      out.write('\n');
	 out.println("<b><h1><CENTER>"+"no contact to show"+"</CENTER></h1></b>"); 
      out.write(" \r\n");
      out.write("\r\n");
 } else{
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\t<!-- <img src=\"dead.jpg\" width=\"50\" height=\"50\"> -->\r\n");
      out.write("<div style=\"overflow-x: auto;\">\r\n");
      out.write("<table align=\"center\">\r\n");
      out.write("\t<p><tr><th></th><th><h3>ID</h3></th>\r\n");
      out.write("\t\t<th><h3>NAME</h3></th></p></tr>\r\n");
      out.write("\r\n");
      out.write("\t ");
  for (ViewListModel a: contacts){
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td><img src=\"contact.png\" width=\"50\" height=\"50\"></td>\r\n");
      out.write("\t\t<td><font color=\" grey\" size=\"65\">");
out.println(a.getId());
      out.write("</font></td>\r\n");
      out.write("\t\t<td><a href=\"search?user=");
      out.print(a.getFullName());
      out.write("\"><font color=\" green\" size=\"65\">");
out.println(a.getFirstName());
      out.write("</font></td></a>\r\n");
      out.write("\t\t<td><a href=\"select?type=edit&name=");
      out.print(a.getFirstName());
      out.write("\">edit</a></td>\r\n");
      out.write("\t\t<td><a href=\"select?name=");
      out.print(a.getFullName());
      out.write("&type=delete\">delete</a></td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("</table></div>\r\n");
      out.write("\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
