package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;
public class SearchContactServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		MysqlRepository dbrepo=new MysqlRepository();
		List<Contact>contact=new ArrayList<Contact>();
		List <Contact> contactList=dbrepo.findAllContact();
		String name=request.getParameter("name");
		if(!name.equals(null))
		{
			for(int i=0;i<contactList.size();i++)
			{
				if(contactList.get(i).getContactName().contains(name))
				{
					contact.add(contactList.get(i));
				}
			}
			request.setAttribute("search",contact);
			RequestDispatcher rd=request.getRequestDispatcher("SearchContact.jsp");
			rd.forward(request,response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("home");
			rd.forward(request,response);
		}
	}
}
