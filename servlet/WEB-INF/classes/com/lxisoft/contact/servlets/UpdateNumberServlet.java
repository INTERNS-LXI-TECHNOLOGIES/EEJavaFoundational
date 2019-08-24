package com.lxisoft.contact.servlets;
import com.lxisoft.contact.model.*;
import com.lxisoft.contact.repositoryimpl.RepositoryImpl;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class UpdateNumberServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String oldNumber=request.getParameter("oldNumber");
		String newNumber=request.getParameter("newNumber");
		ContactModel c=new ContactModel();
		RepositoryImpl repo=new RepositoryImpl();
		repo.updateNumber(oldNumber,newNumber);
	}
}