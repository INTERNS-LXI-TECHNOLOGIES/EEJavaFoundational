package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
public class SearchServ extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
    	MysqlRepository myrepo=new MysqlRepository();
    	String n=request.getParameter("n");
    	List<Contact> contactList=myrepo.getAllContact();
    	List<Contact> c=new ArrayList<Contact>();
        for(int i=0;i<contactList.size();i++)
        {
            if(contactList.get(i).getName().contains(n))
            {
                c.add(contactList.get(i));
            }
        }
        request.setAttribute("contactlist",c);
    	RequestDispatcher rd=request.getRequestDispatcher("Search.jsp");
		rd.forward(request,response);
    }
}