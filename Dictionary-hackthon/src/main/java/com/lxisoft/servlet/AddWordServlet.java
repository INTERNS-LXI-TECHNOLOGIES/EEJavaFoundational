package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
/**
 *class: servlet for adding word
 */
public class AddWordServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		WordUnit wu=new WordUnit();
		wu.setWord(request.getParameter("word"));
		wu.setMeaning(request.getParameter("meaning"));
		MysqlRepository dbrepo=new MysqlRepository();
		WordUnit w=dbrepo.saveWord(wu);
		request.setAttribute("getWord",w);
		RequestDispatcher rd=request.getRequestDispatcher("admin");
		rd.forward(request,response);
	}
}