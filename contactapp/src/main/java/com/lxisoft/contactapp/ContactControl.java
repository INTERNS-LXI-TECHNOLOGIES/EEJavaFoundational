package com.lxisoft.contactapp;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.lxisoft.contactapp.contactrepo.*;
import com.lxisoft.contactapp.model.*;
public class ContactControl extends HttpServlet{
	Repository repo=new DbRepository();
	Contact contact=new Contact();
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
	HttpSession session=req.getSession();
		List<Contact> conlist=new ArrayList<Contact>();
		conlist=repo.getAll();
		System.out.println(conlist);
		session.setAttribute("data",conlist);
		 res.sendRedirect("Contacts.jsp"); 
		

		}
}

