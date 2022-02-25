package com.lxisoft;
import java.sql.*;
public class Contact{
    static Connection con = null;
    static PreparedStatement ps = null;
    static Statement st = null;
    static ResultSet rs = null;
     public static ResultSet retriveData(){
     
     try{
          
          Class.forName("com.mysql.cj.jdbc.Driver"); 
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","root"); 
          st = con.createStatement(); 
          rs = st.executeQuery("select * from contacts "); 
          while(!rs.isLast() && rs.next()) 
          {
               System.out.println("First_Name : " +rs.getString(1)+ "\n Last_Name : "+rs.getString(2)+ "\n PH_Number : "+rs.getString(3)+ "\n Mail_ID : "+ rs.getString(4));
           } con.close();
    st.close();
    return rs;
}catch(Exception e){
     System.out.println(e);
     e.printStackTrace();
    }
    return rs;
}
public static void main(String[] args) {
     retriveData();
}

}