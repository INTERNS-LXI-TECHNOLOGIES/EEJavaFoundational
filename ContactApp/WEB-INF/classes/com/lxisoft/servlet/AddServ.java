package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import com.lxisoft.models.*;

public class AddServ extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		Contact c=new Contact();
		MysqlRepository myrepo=new MysqlRepository();
		List<Contact> contactList=new ArrayList<Contact>();
		String name=request.getParameter("name");
		String contactNo=request.getParameter("contactNo");
		c.setName(name);
		c.setContactNo(contactNo);
		myrepo.insertContact(c);
		request.setAttribute("contacts",c);
		RequestDispatcher rd=request.getRequestDispatcher("Save.jsp");
		rd.forward(request,response);
	}
}