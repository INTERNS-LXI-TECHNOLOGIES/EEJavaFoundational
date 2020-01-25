package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;
import com.lxisoft.servlet.*;
import com.lxisoft.model.*;
/**
 *class: servlet for sorting contacts
 */
public class SortContactServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		String sort=request.getParameter("sort");
		MysqlRepository dbrepo=new MysqlRepository();
		List<Contact>contactList=new ArrayList<Contact>();
		ContactListModel listModel=new ContactListModel();
		switch(sort)
		{
			case "1":contactList=dbrepo.sortByName(); break;
			case "2":contactList=dbrepo.sortByNumber(); break;
			case "3":contactList=dbrepo.sortById(); break;
		}
		for(int i=0;i<contactList.size();i++)
	    {
	    	ContactModel model=new ContactModel();
	    	model.setId(contactList.get(i).getContactId());
	    	model.setFirstName(contactList.get(i).getContactFirstName());
	    	model.setLastName(contactList.get(i).getContactLastName());
	    	listModel.setContactListModel(model);
	    }
		request.setAttribute("allContact",listModel.getContactListModel());
		RequestDispatcher rd=request.getRequestDispatcher("ViewAll.jsp");
		rd.forward(request,response);
	}
}