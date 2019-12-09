package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
import com.lxisoft.domain.*;
public class ShowAllContactServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		MysqlRepository dbrepo=new MysqlRepository();
		List<Contact>contactList=dbrepo.findAllContact();
		ContactListModel listModel=new ContactListModel();
	    for(int i=0;i<contactList.size();i++)
	    {
	    	ContactModel model=new ContactModel();
	    	model.setId(contactList.get(i).getContactId());
	    	model.setName(contactList.get(i).getContactName());
	    	listModel.setContactListModel(model);
	    }
		request.setAttribute("allContact",listModel.getContactListModel());
		RequestDispatcher rd=request.getRequestDispatcher("ViewAll.jsp");
		rd.forward(request,response);
	}
}