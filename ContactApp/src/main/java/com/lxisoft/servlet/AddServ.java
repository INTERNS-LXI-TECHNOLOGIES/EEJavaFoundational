package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
/**
 * class for add new contact
 */
	
public class AddServ extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		Contact c=new Contact();
		MysqlRepository myrepo=new MysqlRepository();
		String fName=request.getParameter("fname");
		String lName=request.getParameter("lname");
		String contactNo=request.getParameter("contactNo");
		c.setFName(fName);
		c.setLName(lName);
		c.setContactNo(contactNo);
		myrepo.insertContact(c);
		request.setAttribute("contacts",c);
		RequestDispatcher rd=request.getRequestDispatcher("Save.jsp");
		rd.forward(request,response);
	}
}