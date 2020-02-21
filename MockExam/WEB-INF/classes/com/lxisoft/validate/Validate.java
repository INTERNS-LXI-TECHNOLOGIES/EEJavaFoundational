package com.lxisoft.validate;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.Math;
import java.util.*;
import com.lxisoft.sqlrepository.*;
import com.lxisoft.model.*;
import com.lxisoft.exam.*;
public class Validate extends HttpServlet
{
	Sqlrepository sqlrep=new Sqlrepository();
	Sqlrepository sql=new Sqlrepository();
	int count;
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException  
	{
		ArrayList<Model>model=sql.readquestion();
		String quest=req.getParameter("option");
		for (int i=0;i<model.size();i++) 
		{
			if(quest.equals(model.get(i).getAnswer()))
			{
				count=count+1;
			}

		}
		
			System.out.println("count : "+count);
	}

}