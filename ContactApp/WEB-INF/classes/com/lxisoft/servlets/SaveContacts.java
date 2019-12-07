package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.models.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.sql.*;

public class SaveContacts extends HttpServlet 
{
	private Repository repo=new MySqlRepo();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
      try{
              Contact contact=new Contact();
              contact.setName(request.getParameter("name"));
              contact.setNo(request.getParameter("num"));
              repo.addContactDetails(contact);
              ArrayList<Contact> contactList=repo.getAllContacts();
              request.setAttribute("contacts",contactList);
              RequestDispatcher rd=request.getRequestDispatcher("jsp\\ContactView.jsp");
              rd.forward(request,response);
              // response.sendRedirect("jsp\\ContactView.jsp");
         }catch(SQLException n)
         {
           n.printStackTrace();
         }
  	}


}