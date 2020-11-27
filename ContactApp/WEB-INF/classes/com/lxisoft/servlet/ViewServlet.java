package com.lxisoft.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;


import com.lxisoft.modal.Contact;
import com.lxisoft.repository.AddressBook;
public class ViewServlet extends HttpServlet {
	public ViewServlet(){
		super();
	}

		protected void doPost(HttpServletRequest request,HttpServletResponse response)
	{
		
	 try{
	 	Contact cm=new Contact();
AddressBook addressbook=new AddressBook();
System.out.println("\n"+addressbook.read()+"\t"+"\n");
	//response.sendRedirect("boxDelete.jsp");

	   }
	 catch(Exception e){}
}
}