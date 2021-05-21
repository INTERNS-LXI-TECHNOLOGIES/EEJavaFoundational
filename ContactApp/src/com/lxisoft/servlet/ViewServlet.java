package com.lxisoft.servlet;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ViewServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		String pageid = request.getParameter("page");
		int pgno = Integer.parseInt(pageid);
		int total = 5;
		if(pgno==1){}
	    else{
	    	pgno = pgno-1;
	    	pgno = pgno*total+1;
	    }
		ContactDatabase db = new ContactDatabase();
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		contactList = db.viewDatabase(contactList,pgno,total);
		for (int i=0;i<contactList.size();i++) 	{
		    int id = contactList.get(i).getId();
		    String name = contactList.get(i).getName();
		    String number = contactList.get(i).getNumber();
		    String mail = contactList.get(i).getEmail();

		    out.println("<table border="1" width="50%">");
	    	out.println("<tr><th>Id</th><th>Name</th><th>Number</th><th>E-Mail</th><th>Actions</th></tr>");
		    out.println("<tr><td>"+id+"</td><td>"+name+"</td><td>"+number+"</td><td>"+mail+"</td><td><a href="edit.jsp?id="+id+" & name="+name+" & num ="+number+"& mail="+mail+"><button class="button">Edit</button></a><a href="contactDelete?name=<%=contactList.get(i).getName()%>"><button class="button button2">Delete</button></a></td></tr>");
		    out.println("</table>")
	    }
	    out.println("<a href="view.jsp ? page=1"><button class="button">1</button></a>");
	    out.println("<a href="view.jsp ? page=2"><button class="button">1</button></a>");
	    out.println("<a href="view.jsp ? page=3"><button class="button">1</button></a>");
	
     	    out.println("<br>");
    	    out.println("<a href="search.html"><button class="button">Search</button></a>");
	<br>
	    out.println("<a href="index.html"><button class="button">Home</button></a>");
	<br>
	out.println("<a href="add.html"><button class="button">AddContact</button></a>");
	
	}

}