package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.models.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.sql.*;

public class ViewAllContacts extends HttpServlet 
{
	private Repository repo=new MySqlRepo();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
      // response.setContentType("text");
       String name="Aji"; 
        // response.sendRedirect("jsp/ContactAdd.jsp"); 
      try{

      // ArrayList<Contact> contactList=repo.getAllContacts();
      request.setAttribute("contacts",name);
      RequestDispatcher rd=request.getRequestDispatcher("jsp\\ContactView.jsp");
	  rd.forward(request,response);
      }catch(Exception n)
  {
    n.printStackTrace();
  }
	}

      // PrintWriter out = response.getWriter();
      // out.println("<h3 align="center">" + "CONTACTLIST" + "</h3>");
    }