package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.models.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.sql.*;

public class LoginServlet extends HttpServlet 
{
	private Repository repo=new MySqlRepo();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
      
      PrintWriter out=response.getWriter();
      String username=request.getParameter("username");
      String password=request.getParameter("password");
      out.println(username);
      out.println(password);
      if(repo.validateUser(username,password))
      {
      	  HttpSession session=request.getSession();
          session.setAttribute("name",username);
      	  response.sendRedirect("View");
      }
      else
      {
           RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
           rs.forward(request, response);
      }
    }
 }
