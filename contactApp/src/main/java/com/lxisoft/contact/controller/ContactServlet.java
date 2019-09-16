package com.lxisoft.contact.controller;
import com.lxisoft.contact.model.*;
import com.lxisoft.contact.repository.*;
import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*; 
import java.util.*; 
public class ContactServlet extends HttpServlet{  
public void doPost(HttpServletRequest req,HttpServletResponse res)  throws ServletException,IOException  
{ 
try{
res.setContentType("text/html");//setting the content type  
PrintWriter out=res.getWriter();//get the stream to write the data  
  Contact contact=new Contact();
	contact.setName(req.getParameter("name"));
	contact.setNum(req.getParameter("num"));
	ContactRepository contactR=new ContactRepository();
	contactR.createContact(contact);
	out.println("<a href="+"home.jsp"+">back to jsp</a>");
out.close();//closing the stream  
}
catch(Exception e)
{
	e.printStackTrace();
}
}
public void doGet(HttpServletRequest req,HttpServletResponse res)  throws ServletException,IOException  
{ 
try{
/*res.setContentType("text/html");//setting the content type  
PrintWriter out=res.getWriter();//get the stream to write the data 
ArrayList<Contact> contacts=new ArrayList<Contact>();
	ContactRepository contactR=new ContactRepository();
	// out.println(contactR.readContact());
	contacts=contactR.readContact();
	out.println("<html><body><table>");
	out.println("<tr><th>Contact Name   </th><th>Contact Number</th></tr>");

	for(int i=0;i<contacts.size();i++)
	{
		out.println("<tr><td>");
		out.println(contacts.get(i).getName()); 
		out.println(" </td><td>");
		out.println(contacts.get(i).getNum());
		out.println("</td></tr>");

	
	}

	
	out.println("</table></body></html>");
	out.println("<a href="+"home.jsp"+">back to jsp</a>");
out.close();*/
//private static final long serialVersionUID = 1L;
    //protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        ContactRepository cR=new ContactRepository();
        String spageid=req.getParameter("page");
        int pageid=Integer.parseInt(spageid);
        int total=5;
        if(pageid==1){}
        else{
            pageid=pageid-1;
            pageid=pageid*total+1;
        }
        List<Contact> list=cR.getRecords(pageid,total);
        out.print("<html><body>");
        out.print("<h1>Page No: "+spageid+"</h1>");
        out.print("<table border='1' cellpadding='4' width='60%'>");
        out.print("<tr><th>Contact Name</th><th>Contact number</th>");
        for(Contact c:list){
            out.print("<tr><td>"+c.getName()+"</td><td>"+c.getNum()+"</td></tr>");
        }
        
        out.print("</table>");
        int count=cR.getAllData();
	for(int i=1;i<=count/5;i++)
	{
        out.print("<form action='read' method=''><input type='submit' name='page' value="+i+"></form>");
    }
        out.print("</body></html>");
        out.close();
}
 catch(Exception e)
{
	e.printStackTrace();
}
}
}


