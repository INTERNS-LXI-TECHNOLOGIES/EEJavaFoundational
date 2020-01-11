package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import com.lxisoft.models.*;
public class ResourceBundle extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		RequestDispatcher rd=request.getRequestDispatcher("Welcom.jsp");
		rd.forward(request,response);
	}
}