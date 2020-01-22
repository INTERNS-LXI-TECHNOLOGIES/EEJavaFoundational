package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import com.lxisoft.models.*;
public class EditServ extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		Contact c=new Contact();
		MysqlRepository myrepo=new MysqlRepository();
		String name=request.getParameter("name");
		String contactNo=request.getParameter("contactNo");
		String id=request.getParameter("id");
		c.setName(name);
		c.setContactNo(contactNo);
		Contact co=myrepo.updateContact(id,c);
		request.setAttribute("contacts",co);
		HttpSession session=request.getSession();
		session.setAttribute("contact",co);
		RequestDispatcher rd=request.getRequestDispatcher("Save.jsp");
		rd.forward(request,response);
	}
}