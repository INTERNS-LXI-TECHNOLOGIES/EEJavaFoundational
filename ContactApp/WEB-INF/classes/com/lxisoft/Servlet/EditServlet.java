package com.lxisoft.Servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Models.*;

import com.lxisoft.Domain.*;


public class EditServlet extends HttpServlet
{
	static MysqlRepository repo=new MysqlRepository();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		HttpSession session=request.getSession();
		Contact c=(Contact) session.getAttribute("users");
		String name=(String) request.getParameter("newName");
		c.setName(name);
		String number=(String) request.getParameter("newNo");
		c.setNo(number);
		PrintWriter out=response.getWriter();
		repo.editContact(c,1);
		response.sendRedirect("viewall");
		// out.println(newName + c.getId()+""+c.getName());

	}
}