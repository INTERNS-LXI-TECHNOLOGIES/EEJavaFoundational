package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.models.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.sql.*;

public class LogoutServlet extends HttpServlet 
{
	// private Repository repo=new MySqlRepo();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
      	  HttpSession session=request.getSession();
          session.invalidate();
          PrintWriter out=response.getWriter();
         // response.sendRedirect("Login2.jsp");  
         // HttpSession nsession = request.getSession(false);
          if(session!=null) {
             out.println("active");
          }
          else
            out.println("Session is not active");

          
      
     }
 }
