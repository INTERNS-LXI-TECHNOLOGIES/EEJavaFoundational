package com.lxisoft.contactapp.servelet;
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
		PrintWriter out=res.getWriter();
		List<Contact> conlist=new ArrayList<Contact>();
		conlist=repo.getAll();
		out.println(conlist);
		req.setAttribute("data",conlist);
		//res.sendRedirect("Contacts.jsp");
		 RequestDispatcher rd = req.getRequestDispatcher("Contacts.jsp"); 
		 rd.forward(req,res);

		}
}