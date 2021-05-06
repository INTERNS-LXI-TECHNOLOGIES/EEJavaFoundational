package com.lxisoft.servlets;
import java.io.*;
import  javax.servlet.*;
import  javax.servlet.http.*;
import  java.util.*;
import com.lxisoft.model.*;
import com.lxisoft.repository.ContactList;

public class AddContactServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		Contacts contact = new Contacts();
		ContactList list = new ContactList();
		String name = request.getParameter("contactName");
		String num = request.getParameter("number");
		String mail = request.getParameter("mailid");
		contact.setName(name);
		contact.setNumber(num);
		contact.setEmail(mail);
		list.addToContactDatabase(name,num,mail);
		/*try{
			response.sendRedirect("ViewContacts.jsp");
		}
		catch(Exception e){
			e.printStackTrace();
		}*/
	}
}