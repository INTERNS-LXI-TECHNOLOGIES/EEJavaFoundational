package com.lxisoft.servlet;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;

public class UpdateServlet extends HttpServlet
{
		ContactRepository contactrepo = new ContactRepository();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException
	{
	   String id = request.getParameter("id");
	   String newname= request.getParameter("name");
	   String newlastname= request.getParameter("lname");
	   String newemail= request.getParameter("email");
	   String newnumber= request.getParameter("number");
	   Contact contact=new Contact();
	   //contact.setID(id);
	   contact.setFirstName(newname);
	   contact.setLastName(newlastname);
	   contact.setMailId(newemail); 
	   contact.setNumber(newnumber);
	   contactrepo.updateDatabase(id,newname,newlastname,newemail,newnumber);
	   		RequestDispatcher rd = request.getRequestDispatcher("/ViewServlet");
	   		rd.forward(request,response);
	}

}