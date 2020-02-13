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
	public void createtable()
	{
	 try{
			connection();
			String query="create table MockExam(Question varchar(100),Answers varchar(100)) ";
			ps=con.prepareStatement(query);
			ps.execute();
		}catch(Exception e)
				{
					e.printStackTrace();
					System.out.println(e);
				} 
	} 
	public void createContact(ArrayList<Contact> contacts)
	{
	 	try{
				 	connection();
				 	String query="insert into contacts(id,name,number)values(?,?,?)";
					ps=con.prepareStatement(query);
				 	for (int i=0;i<contacts.size();i++) 
				 	{
				 		
				 		ps.setInt(1,contacts.get(i).getId());
					 	ps.execute();
				 	}

				 
			}catch(Exception e)
				{
					e.printStackTrace();
					System.out.println(e);
				} 
	} 
}