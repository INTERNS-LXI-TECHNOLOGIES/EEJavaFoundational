package com.lxisoft.Contact.repositoryImpl;

import java.sql.*;


import javax.sql.DataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import com.lxisoft.Contact.model.User;

public class LoginRepoImpl
{
	
DataSource ds= ConnectionImpl.getMySQLDataSource();

public boolean setUser(User user ) throws SQLException
{	int num=0;
	Connection con=ds.getConnection();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from users");
	while(rs.next())
	{
		String userers=rs.getString("username");
		if(userers.equals(user.getUsername()))
		{
			num++;
		}
	}
	if(num==0)
	{
		PreparedStatement ps=con.prepareStatement("insert into users(id,name,email,username,phonenumber,password) values (?,?,?,?,?,?)");
		System.out.println(user.getUsername());
		System.out.println(user.getPhonenumber());
		ps.setInt(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getEmail());
		ps.setString(4,user.getUsername());
		ps.setString(5,user.getPhonenumber());
		ps.setString(6, user.getPassword());
		ps.execute();
		
		return true;
	}
	else {
		return false;
	}
		
	}
public int getDetails(String name, String password) throws SQLException
{
	
	int x=0;
	Connection c = ds.getConnection();

	Statement s = c.createStatement();
	ResultSet r = s.executeQuery("select * from users where username = '"+name+"'");
	while(r.next()){
		String pass = r.getString("password");
		if(pass.equals(password))
		{
			x++;
		}
	}
	return x;

}
}

