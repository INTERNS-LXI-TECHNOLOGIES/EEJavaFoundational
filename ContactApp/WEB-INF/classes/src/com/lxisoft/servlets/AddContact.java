package com.lxisoft.servlets;
import  java.servlet.*;
import  java.servlet.http.*;
import  java.util.*;
import com.lxisoft.repository.ContactList;

public class AddContact extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response){
		Contacts contact = new Contacts();
		ContactList list = new ContactList();
		String name = request.getParameter("name");
		String num = request.getParameter("number");
		String mail = request.getParameter("email");
		contact.setName(name);
		contact.setNumber(number);
		contact.setEmail(mail);
		list.addToContactDatabase(name,number,mail);
	}
}