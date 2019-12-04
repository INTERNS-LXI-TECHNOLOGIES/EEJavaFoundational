package com.lxisoft.ctr;
import com.lxisoft.Domain.Contact;
import com.lxisoft.View.View;
import com.lxisoft.Model.SortName;
import java.util.ArrayList;
import com.lxisoft.Repository.Repository;
import com.lxisoft.Repository.DataRepository;

public class Controller
{ ArrayList <Contact> contactsList = new ArrayList <Contact>();
  Repository repo = new Repository();
  DataRepository drr=new DataRepository();
  public void start()
  {
    
    drr.display();
   contactsList=repo.getFromFile();
   View view = new View();
   view.menu(contactsList);
  }
  public void addNewContact(Contact c )
  {
    //repo.add(c);
    drr.add(c);
  }
  public ArrayList <Contact>  getContacts(){
  	contactsList=repo.getFromFile();
  	return contactsList;
  }

  public void deleteContact(String name)
  {
    drr.delete(name);
  }


  // public void editContact(String name,String newname,String number)
  // {
  //  drr.edit(name,newname,number);
  // }

  public void editByName(String name,String newname)
  {
   drr.editByName(name,newname);
  }
   public void editByNumber(String name,String newnumber)
  {
   drr.editByNumber(name,newnumber); 
  }
  
  public ArrayList <Contact> sort()
  {
    repo.sortName();
    return contactsList;
  }

}
