package com.lxisoft.dao;

import java.sql.*;

import com.lxisoft.model.User;

public class UserDAO {
     
     Connection con ;

     public UserDAO(Connection con) {
         this.con = con;
     }
     
     //for register user 
     public boolean saveUser(User user){
         boolean set = false;
         try{
             //Insert register data to database
             String query = "insert into user(username,email,password) values(?,?,?)";
            
            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setString(1, user.getName());
            pt.setString(2, user.getEmail());
            pt.setString(3, user.getPassword());
            
            pt.executeUpdate();
            set = true;
         }catch(Exception e){
             e.printStackTrace();
         }
         return set;
     }

//user Login

public User logUser(String email, String pass){
    User usr=null;
    try{
        String query ="select * from user where email=? and password=?";
        PreparedStatement pst = this.con.prepareStatement(query);
        pst.setString(1, email);
        pst.setString(2, pass);
        
        ResultSet rs = pst.executeQuery();
        
        if(rs.next()){
            usr = new User();
            usr.setId(rs.getInt("userid"));
            usr.setName(rs.getString("username"));
            usr.setEmail(rs.getString("email"));
            usr.setPassword(rs.getString("password"));
            
        }
        
    }catch(Exception e){
        e.printStackTrace();
    }
    return usr;
}

























}
