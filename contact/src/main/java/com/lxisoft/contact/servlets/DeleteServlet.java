package com.lxisoft.contact.servlets;
import com.lxisoft.contact.model.ContactModel;
import com.lxisoft.contact.repositoryimpl.RepositoryImpl;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import com.lxisoft.contact.model.*;
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
	  String delete=request.getParameter("deleteValue");
	  ContactModel c=new ContactModel();
	  RepositoryImpl repo=new RepositoryImpl();
	  repo.delete(delete);
	}
 }