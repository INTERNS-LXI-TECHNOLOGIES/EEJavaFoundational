package com.lxisoft.contact.controller;
import com.lxisoft.contact.model.*;
import com.lxisoft.contact.repository.*;
import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*; 
import java.util.*; 
public class ContactServletUpdate extends HttpServlet{  
public void doPost(HttpServletRequest req,HttpServletResponse res)  throws ServletException,IOException  
{ 
try{
res.setContentType("text/html");//setting the content type  
PrintWriter out=res.getWriter();//get the stream to write the data  
  ContactRepository contactR=new ContactRepository();
	String editName=req.getParameter("name");
	String newName=req.getParameter("nname");
	int value=contactR.updateContact(editName,newName);
	HttpSession session=req.getSession(true);
	session.setAttribute("value",value);
	String name="success";
	res.sendRedirect("Update.jsp?name="+name);
	out.println("<a href="+"index.jsp"+">back to jsp</a>");
out.close();//closing the stream  
}
catch(Exception e)
{
	e.printStackTrace();
}
}

}  