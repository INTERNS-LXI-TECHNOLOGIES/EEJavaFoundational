package com.lxisoft.servlet;
import java.util.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ViewServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException
	{
		Mysql mysql=new Mysql();
		ArrayList<Word> wordList=mysql.readAll();
	}
}