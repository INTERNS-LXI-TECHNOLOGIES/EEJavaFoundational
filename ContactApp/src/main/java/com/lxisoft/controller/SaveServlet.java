package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SaveServlet extends HttpServlet
{
	Repository repository=new DbRepository();

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		Contact contact=new Contact();
		contact.setFName(request.getParameter("firstName"));
		contact.setLName(request.getParameter("lastName"));
		contact.setNumber(request.getParameter("number"));
		repository.save(contact);
		response.sendRedirect("showAll");
	}
}
