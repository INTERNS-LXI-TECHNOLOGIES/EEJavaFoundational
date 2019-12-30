package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginServlet extends HttpServlet
{
	Repository repository=new DbRepository();
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		boolean isTrue=repository.validate(username,password);

	}
}