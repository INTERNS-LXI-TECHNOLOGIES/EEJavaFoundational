package com.lxisoft.sqlrepository;
public class Sqlrepository
{
	public void connection()
	{
	 try{
			if (con==null)
			{
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","root");
						
			}
		}catch(Exception e)
			{
			 	e.printStackTrace();
			 	System.out.println(e);
			} 

	}  
}