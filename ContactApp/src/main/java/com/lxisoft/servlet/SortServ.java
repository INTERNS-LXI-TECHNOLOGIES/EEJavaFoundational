package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import com.lxisoft.models.*;
public class SortServ extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
    	MysqlRepository myrepo=new MysqlRepository();
        String sort=request.getParameter("sort");
        ContactListModel lm=new ContactListModel();
        List<Contact> contactList=new ArrayList<Contact>();
    	switch(sort)
		{
			case "a":contactList=myrepo.nameSort();break;
			case "b":contactList=myrepo.numberSort();break;
		}

    	for(int i=0;i<contactList.size();i++)
		{
			ContactModel model=new ContactModel();
			model.setId(contactList.get(i).getId());
			model.setFName(contactList.get(i).getFName());
			model.setLName(contactList.get(i).getLName());
			lm.setContactsList(model);
		}
    	request.setAttribute("contactlist",lm.getContactsList());
		RequestDispatcher rd=request.getRequestDispatcher("ViewAll.jsp");
		rd.forward(request,response);
    }
}