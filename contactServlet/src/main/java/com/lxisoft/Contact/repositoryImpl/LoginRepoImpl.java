package com.lxisoft.Contact.repositoryImpl;

import java.sql.*;
import java.util.ArrayList;

import javax.sql.DataSource;

import com.lxisoft.Contact.model.SignupModel;

public class LoginRepoImpl {
		DataSource ds = RepoDataSource.getMySQLDataSource();
		Statement st;
		ResultSet rs;	
		Connection con;
		ArrayList<SignupModel> contacts=new ArrayList<SignupModel>();
		
			
	public int getUser(String name,String password) throws SQLException, ClassNotFoundException { 
		
		int x=0;
		Connection c = ds.getConnection();

		Statement s = c.createStatement();
		ResultSet r = s.executeQuery("select * from user where username = '"+name+"'");
		while(r.next()){
			String pass = r.getString("password");
			if(pass.equals(password)) {
				x++;
			}
		}
		return x;
		
	}
	public boolean setUser(SignupModel sm) throws ClassNotFoundException, SQLException {
		int x = 0;
		
			Connection c = ds.getConnection();
			Statement s = c.createStatement();
			ResultSet r = s.executeQuery("select * from user");
			while(r.next()){
				String usernames = r.getString("username");
				if(usernames.equals(sm.getUserName())) {
					x++;
				}
			}
		if(x==0) {
			PreparedStatement p = c.prepareStatement("insert into user(name,email,username,phonenumber,password) values(?,?,?,?,?)");
			p.setString(1, sm.getName());
			p.setString(2, sm.getMailId());
			p.setString(3, sm.getUserName());
			p.setString(4, sm.getPhoneNumber());
			p.setString(5, sm.getPassword());
			p.execute();
			
			
			return true;
		}
		else {
			return false;
		}
		
		
	}
}
