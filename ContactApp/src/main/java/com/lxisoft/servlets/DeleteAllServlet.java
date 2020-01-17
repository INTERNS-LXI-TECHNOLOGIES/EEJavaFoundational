package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.models.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.sql.*;


public class DeleteAllServlet extends HttpServlet
{
	static Repository repo=new MySqlRepo();
   
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
    {
		try {
             repo.clearRepository();
             response.sendRedirect("View");
           }catch(Exception e)
          {
            e.printStackTrace();
          }
    }
}