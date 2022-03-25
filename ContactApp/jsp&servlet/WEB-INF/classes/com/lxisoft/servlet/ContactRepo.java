package com.lxisoft.servlet;

import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

import com.lxisoft.model.*;
public class ContactRepo {
     Connection con = null;
          PreparedStatement ps = null;
          Statement st = null;
          ResultSet rs = null;
     public List<Contact> printContacts() throws SQLException{
        
          List<Contact> contactList = new ArrayList<>();

          try{
          
               Class.forName("com.mysql.cj.jdbc.Driver"); 
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","root"); 
               st = con.createStatement(); 
               rs = st.executeQuery("select * from contacts "); 
               while( rs.next()) {

                    Contact contact = new Contact();
                    contact.setFirstName(rs.getString(1));
                    contact.setLastName(rs.getString(2));
                    contact.setPhNumber(rs.getString(3));
                    contact.setEmail(rs.getString(4));
                    contact.setId(rs.getInt(5));
                    contactList.add(contact);
             //  return contactList;
               }
               con.close();
         st.close();
         }catch( ClassNotFoundException e){
     System.out.println(e);
     e.printStackTrace();
    }
    catch( Exception e){
     System.out.println(e);
     e.printStackTrace();
    }
    return contactList;
     }

     public void addContacts( String n1,String n2,String ph,String email){
          try{
          
               Class.forName("com.mysql.cj.jdbc.Driver"); 
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","root"); 
               PreparedStatement ps = null;

              ps = con.prepareStatement("INSERT INTO contacts(f_name,l_name,ph_no,email) VALUES(?,?,?,?)");
              ps.setString(1, n1);
              ps.setString(2, n2);
              ps.setString(3, ph);
              ps.setString(4, email);


              ps.executeUpdate();
             // response.sendRedirect("Contacts.jsp");
              // out.println("update successfully!");
     //return c1;
         }catch(Exception e){
     System.out.println(e);
     e.printStackTrace();
    }
     }

     public void updateContacts(String n1,String n2,String ph,String mail,String num) {
        
          try{
          
               Class.forName("com.mysql.cj.jdbc.Driver"); 
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","root"); 
               Statement st  = con.createStatement(); 
               
               ResultSet rs = st.executeQuery("select * from contacts where sl_no = '"+num+"'");
               PreparedStatement ps = null;
              while(rs.next()) 
               {
     
               String fName = n1;
               String lName = n2;
               String phn = ph;
               String email = mail;
              // Integer sl_no = rs.getInt(5);
              if(fName != null && lName != null && phn != null && email != null){
     
     
                    ps = con.prepareStatement("UPDATE contacts set f_name=?,l_name=?,ph_no=?,email=? WHERE sl_no = "+num);
                    ps.setString(1, fName);
                    ps.setString(2, lName);
                    ps.setString(3, phn);
                    ps.setString(4, email);
                    ps.executeUpdate();
                    // response.sendRedirect("Contacts.jsp");
     System.out.println("update successfully!");
               }
     else{
          System. out.println("Some issues occured");
     }
}
con.close();
  st.close();
  }catch(Exception e){
System.out.println(e);
e.printStackTrace();
}

     } 


     public void deleteContacts(String num) {
          try{
          
               Class.forName("com.mysql.cj.jdbc.Driver"); 
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","root"); 
               PreparedStatement ps = null;
               
               ps = con.prepareStatement(" DELETE FROM contacts WHERE sl_no = '"+num+"'" );
                ps.executeUpdate();
               }
               catch(Exception e)
               {
               System.out.print(e);
               e.printStackTrace();
               }
     }

    public static void main(String[] args) throws IOException {
          ContactRepo cp = new ContactRepo();
          
          try {
               for (int i = 0;i < cp.printContacts().size(); i++) {
                    
             //  System.out.println(cp.printContacts(c).size());
               System.out.println(cp.printContacts().get(i).getId());
               System.out.println(cp.printContacts().get(i).getFirstName());
               System.out.println(cp.printContacts().get(i).getLastName());
               System.out.println(cp.printContacts().get(i).getPhNumber());
               System.out.println(cp.printContacts().get(i).getEmail());
               }
          } 
          catch (SQLException e) {
               
               e.printStackTrace();
          }
          
     }

 
}
