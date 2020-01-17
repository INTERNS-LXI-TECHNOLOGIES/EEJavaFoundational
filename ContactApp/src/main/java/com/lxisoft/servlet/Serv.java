package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import com.lxisoft.models.*;
/**
 * class for read data from database
 */
public class Serv extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		List<ContactModel>contactsList=new ArrayList<ContactModel>();
		MysqlRepository myrepo=new MysqlRepository();
		ContactListModel lm=new ContactListModel();
		List<Contact>contactList=myrepo.getAllContact(); 
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