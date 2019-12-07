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
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
      try{
             String[] contacts=new String[2];
              contacts[0]=request.getParameter("name");  
              contacts[1]=request.getParameter("num");
              Contact contact=new Contact();
              contact.setName(contacts[0]);
              contact.setNo(contacts[1]);
              repo.addContactDetails(contact);
         }catch(SQLException n)
         {
           n.printStackTrace();
         }
  	}


}