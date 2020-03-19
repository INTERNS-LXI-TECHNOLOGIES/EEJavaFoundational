package com.lxisoft.Controler;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
public class LanguageServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		request.getRequestDispatcher("Delete.jsp").forward(request,response);
	}
}