package com.lxisoft.sqlrepository;
import java.sql.*;  
import java.util.*;
import com.lxisoft.model.Model;
public class Sqlrepository
{
	Connection con=null;
	PreparedStatement ps=null;

	ArrayList<Model> questions= new ArrayList<Model>();
	public void connection()
	{
	 try{
			if (con==null)
			{
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sanfar","root","root");
						
			}
		}catch(Exception e)
			{
			 	e.printStackTrace();
			 	System.out.println(e);
			} 
	}

	public ArrayList<Model> readquestion()
	{
		try{
			connection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from mockexam");
			Model model=null;
			while (rs.next())
			{
				model=new Model();
				model.setId(rs.getInt("id"));
				model.setQuestion(rs.getString("Question"));
				model.setAnswer(rs.getString("Answers"));
				model.setOption1(rs.getString("option1"));
				model.setOption2(rs.getString("option2"));
				model.setOption3(rs.getString("option3"));
			}
			questions.add(model);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return questions;
	}
}