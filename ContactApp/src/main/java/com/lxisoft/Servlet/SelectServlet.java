package com.lxisoft.Servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Models.*;

import com.lxisoft.Domain.*;


public class SelectServlet extends HttpServlet
{
	// public void init()throws ServletExecption
	// {
	// }
        static MysqlRepository repo=new MysqlRepository();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
   		
        try {

        		ArrayList<Contact> contacts=repo.getAllContacts();
        		String type=(String)request.getParameter("type");
        		String name=(String)request.getParameter("name");
        		PrintWriter out=response.getWriter();
        		out.println(name+" "+ type);
        	}catch(Exception e)
        	{

        	}
    }
}