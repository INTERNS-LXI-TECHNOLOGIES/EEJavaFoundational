package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.model.*;
import com.lxisoft.Repository.*;
import java.util.*;
import java.sql.*;
public class LogoutServlet extends HttpServlet
{
	private MySqlRepository repo=new MySqlRepository();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
      	  HttpSession session=request.getSession();
          session.invalidate();
          PrintWriter out=response.getWriter();
        
          session=request.getSession(false);
          response.sendRedirect("view");  
  

          
      
     }
	
	}