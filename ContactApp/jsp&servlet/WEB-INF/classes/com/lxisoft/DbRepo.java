

import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

import com.lxisoft.model.*;


public class DbRepo {
     
     public static Connection getConnection ()
     {
         Connection con = null;
         try
         {
             Class.forName ("com.mysql.cj.jdbc.Driver");
             con =DriverManager.getConnection ("jdbc:mysql://localhost:3306/lxisoft","root","root");
         } 
         catch (Exception e)
         {
             System.out.println (e);
         }
         return con;
     }
     
     public static int saveContact(Contact c)
     {
         int status = 0;
         try
         {
             Connection con = DbRepo.getConnection ();
             PreparedStatement ps =con.prepareStatement ("INSERT INTO contacts(f_name,l_name,ph_no,email) VALUES(?,?,?,?)");
             ps.setString (1, c.getFirstName());
             ps.setString (2, c.getLastName());
             ps.setString (3, c.getPhNumber());
             ps.setString (4, c.getEmail());

             status = ps.executeUpdate ();
             con.close ();
         } 
         catch (Exception ex)
         {
             ex.printStackTrace ();
         }
         return status;
     }


     public static int update (Contact c)
     {
         int status = 0;
         try
         {
             Connection con = DbRepo.getConnection ();
             PreparedStatement ps = con.prepareStatement ("update contacts set f_name=?,l_name=?,ph_no=?,email=? where sl_no=?");
             ps.setString (1, c.getFirstName());
             ps.setString (2, c.getLastName());
             ps.setString (3, c.getPhNumber());
             ps.setString (4, c.getEmail());
             ps.setInt (5, c.getId());
             status = ps.executeUpdate ();
             con.close ();
         } 
         catch (Exception ex)
         {
             ex.printStackTrace ();
         }
         return status;
     }

     public static int delete (int id)
     {
         int status = 0;
         try
         {
             Connection con = DbRepo.getConnection ();
             PreparedStatement ps =con.prepareStatement ("delete from Contacts where sl_no=?");
             ps.setInt (1, id);
             status = ps.executeUpdate ();
             con.close ();
         } 
         catch (Exception e)
         {
             e.printStackTrace ();
         }
         return status;
     }

     public static Contact getContactById (int id)
    {
        Contact contact = new Contact ();
        try
        {
            Connection con = DbRepo.getConnection ();
            PreparedStatement ps =con.prepareStatement ("select * from Contacts where sl_no=?");
            ps.setInt (1, id);
            ResultSet rs = ps.executeQuery ();
            if (rs.next ())
         {
             contact.setId (rs.getInt (5));
             contact.setFirstName(rs.getString(1));
             contact.setLastName(rs.getString(2));
             contact.setPhNumber(rs.getString(3));
             contact.setEmail(rs.getString(4));

             
         }
            con.close ();
        }
        catch (Exception ex)
        {
            ex.printStackTrace ();
        }
        return contact;
    }

    public static List < Contact > getAllContacts ()
    {
        List<Contact> list = new ArrayList<Contact>();
        try
        {
            Connection con = DbRepo.getConnection ();
            PreparedStatement ps = con.prepareStatement ("select * from Contacts");
            ResultSet rs = ps.executeQuery ();
            while (rs.next ())
         {
            Contact contact = new Contact ();
             contact.setId (rs.getInt (1));
             contact.setFirstName(rs.getString(1));
             contact.setLastName(rs.getString(2));
             contact.setPhNumber(rs.getString(3));
             contact.setEmail(rs.getString(4));
             list.add (contact);
         }
            con.close ();
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
        return list;
    }

}
