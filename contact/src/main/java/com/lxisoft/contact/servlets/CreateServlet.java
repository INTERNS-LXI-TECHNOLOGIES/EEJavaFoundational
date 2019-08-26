package com.lxisoft.contact.servlets;
import com.lxisoft.contact.model.*;
import com.lxisoft.contact.repositoryimpl.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import com.lxisoft.contact.model.*;

@WebServlet("/save")
public class CreateServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String userName=request.getParameter("userName");
		String phoneNumber=request.getParameter("phoneNumber");
		ContactModel c=new ContactModel();
		RepositoryImpl rimpl=new RepositoryImpl();
		rimpl.add(userName,phoneNumber);
	}
}