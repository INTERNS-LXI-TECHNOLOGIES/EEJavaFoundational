package com.lxisoft.servlet ;

import javax.servlet.* ;
import java.io.* ;
import java.util.* ;

public class DateServlet extends GenericServlet
{

	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{

		PrintWriter pw = null ;
		Date date = null ;

		//setting response type
		res.setContentType("text/html") ;

		//get printwriter object
		pw = res.getWriter() ;

		//request processing
		date = new Date() ;

		//write output to response object
		pw.println("<h1 style='align:center'>Date and Time : " + date + "</br>") ;

		//close stream
		pw.close() ;
	
	}//service(-,-)

}// class