package com.lxisoft.contact.servlets;
import com.lxisoft.contact.model.*;
import com.lxisoft.contact.repositoryimpl.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.lxisoft.contact.model.*;
public class UpdateNameServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String oldName=request.getParameter("oldValue");
		String newName=request.getParameter("newValue");
		ContactModel c=new ContactModel();
		RepositoryImpl repo=new RepositoryImpl();
		repo.updateName(oldName,newName);
	}
}