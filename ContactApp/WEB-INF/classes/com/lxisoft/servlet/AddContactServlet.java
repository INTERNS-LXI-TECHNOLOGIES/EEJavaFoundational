package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;
import com.lxisoft.servlet.*;
public class AddContactServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		String name=request.getParameter("name");
		String number=request.getParameter("number");
		Contact cont=new Contact();
		cont.setContactName(name);
		cont.setContactNumber(number);
		MysqlRepository dbrepo=new MysqlRepository();
		dbrepo.saveContact(cont);
		// dprepo.findAllContact();
		request.setAttribute("getContactById",cont);
		RequestDispatcher rd=request.getRequestDispatcher("GetContactById.jsp");
		rd.forward(request,response);
	}
}