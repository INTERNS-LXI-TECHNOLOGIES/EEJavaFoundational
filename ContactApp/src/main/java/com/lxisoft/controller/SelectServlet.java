
package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SelectServlet extends HttpServlet
{

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		HttpSession session=request.getSession();
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
		session.setAttribute("selectModel",selectModel);
		String type=(String) request.getParameter("type");
		if(type.equals("e"))
			response.sendRedirect("deleteContact");
		else if(type.equals("d"))
			response.sendRedirect("editContact");
		
	}
}