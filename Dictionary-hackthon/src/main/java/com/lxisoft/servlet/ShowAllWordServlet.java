package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
/**
 *class: servlet for getting all words
 */
public class ShowAllWordServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		final static Logger logger = Logger.getLogger(ShowAllWordServlet.class);
		MysqlRepository dbrepo=new MysqlRepository();
		List<WordUnit>wordList=dbrepo.findAllWords();
		request.setAttribute("allWord",wordList);
		if(logger.isDebugEnabled())
		{
	    logger.debug("This is debug");
		}
		RequestDispatcher rd=request.getRequestDispatcher("ViewAll.jsp");
		rd.forward(request,response);
	}
}