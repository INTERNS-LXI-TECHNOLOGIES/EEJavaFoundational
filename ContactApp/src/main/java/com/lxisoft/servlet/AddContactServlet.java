package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;
public class AddContactServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		Contact cont=new Contact();
		cont.setContactFirstName(request.getParameter("first name"));
		cont.setContactLastName(request.getParameter("last name"));
		cont.setContactNumber(request.getParameter("number"));
		MysqlRepository dbrepo=new MysqlRepository();
		Contact c=dbrepo.saveContact(cont);
		request.setAttribute("getContactById",c);
		RequestDispatcher rd=request.getRequestDispatcher("GetContactById.jsp");
		rd.forward(request,response);
	}
}