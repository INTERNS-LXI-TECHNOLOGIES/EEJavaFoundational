package com.lxisoft.contactapp;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import com.lxisoft.contactapp.contactrepo.*;
import com.lxisoft.contactapp.model.*;
public class ContactEdit extends HttpServlet{
	Contact contact=new Contact();
	Repository repo=new DbRepository();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
	response.setContentType("text/html");
	String id=request.getParameter("id");
	//int a=Integer.parseInt(id);
	//contact=repo.searchById(a);
	request.setAttribute("id",id);
	RequestDispatcher rd = request.getRequestDispatcher("Edit.jsp"); 
	rd.forward(request,response);

}

public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

		HttpSession session=request.getSession();
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
 		String c=request.getParameter("id");
 		int d=Integer.parseInt(c);
        String a = request.getParameter("Name");
        String b = request.getParameter("Number");

	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","root");
		Statement s=con.createStatement();
		s.executeUpdate("update contactlist set NAME='"+a+"',NUMBER='"+b+"' where ID ='"+d+"'");
		response.sendRedirect("Contacts.jsp");
		//RequestDispatcher rd = request.getRequestDispatcher("Contacts.jsp"); 
		//rd.forward(request,response);
	   }
	catch (Exception e2) {
            System.out.println("***************"+e2);
        }
   }
 }