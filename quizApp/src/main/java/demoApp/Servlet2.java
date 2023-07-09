package demoApp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet{
	
	Question qs = null;
	Question qs1 = null;
	int rr;
	public int userscore;
	
	Repository db = new Repository();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	
    	String name1 = request.getParameter("name1");
    	
    	 if(name1 != null) {
    		 try {
				db.nameC(name1);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	 }
    	 else {
    		 
    	 }
    
    	 
    	 
    	 String pp = request.getParameter("question_no");
    	 pp = (pp != null)? pp: "1";
    	  rr = Integer.parseInt(pp);
    	 String result = (rr < 11)? "question.jsp":"result.jsp";     
  
         int rrr;
         rrr = ( rr == 1)?rr: rr-1;
    
    	try {
			qs = (db.getQuestion(rr));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    	try {
			 qs1 = (db.getQuestion(rrr));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
    	 HttpSession session = request.getSession();
        
        
			
				session.setAttribute("quest", qs);
			
				session.setAttribute("quest1", qs1);
				

        
       
        RequestDispatcher dispatcher = request.getRequestDispatcher(result);
        

     
        dispatcher.forward(request, response);    
        
    }
    
    
    public String removeLastChar(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        return s.substring(0, s.length()-1);
    }

	public void updateScore(Question qs1, String option ) throws SQLException{
		
		if(qs1.getRightAnswer().equals(option) ){
		  userscore++;
		  db.getQ(userscore);
		}
	
}
	
}