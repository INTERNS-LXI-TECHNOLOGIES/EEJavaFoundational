package com.lxisoft.View;
import com.lxisoft.ctr.Controller;
import com.lxisoft.Domain.Contact;
import java.io.*;
import java.util.*;
/*
*class for view All 
*
*/
public class View
{ 
  
   static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
   static Scanner in = new Scanner(System.in);
   static Controller control = new Controller();
   /*
   *MENU
   */
   public void menu( ArrayList <Contact> currentList)
  {

    int a;
    System.out.println("ID\tNAME\tNUMBER");
   // System.out.println(currentList.size());
    for(int i=0;i<currentList.size();i++){
      System.out.println(currentList.get(i).getId()+"\t"+currentList.get(i).getName()+"\t"+currentList.get(i).getNumber());
    }
    do
    {
      System.out.println("\t\t\t***************MENU****************");
      System.out.println("\t\t\t1. ADD"+"\t\t\t2. DELETE\n");
      System.out.println("\t\t\t3. DISPLAY"+"\t\t4. EDIT\n\n\t\t\t5. SORT"+"\t\t\t6. EXIT\n\n\n\t\t\tEnter your Choice:");
      a = in.nextInt();
       switch(a)
       {

        
           case 1 : //ADD
                  addContact();
                  break;
          case 2 : //DELETE
                 deleteContact();
                 break;
          case 3 : //DISPLAY
                 displayAll();
                 break;  
          case 4 : // EDIT
                 editContact();  
                 break;    
          case 5 : //SORTING
                 sort();

                 break;  
          case 6 : //EXIT
                 break;        
           default :  System.out.println("INVALID CHOICE");
                 break;                     
        }
     }while(a!=6);
         //contactslist = control.addContact();
  }
  public void addContact()
  { 
    try{
        Contact contact = new Contact();
        System.out.println("Enter the name   : ");
        String name = input.readLine();
        contact.setName(name);
        System.out.println("Enter the number : ");
        String number = input.readLine();
        contact.setNumber(number);
        control.addNewContact(contact);
       }catch(IOException e){}
    //System.out.println(id+"*****");
  
  }
  public void displayAll(){
    ArrayList <Contact>  currentList= control.getContacts();
      System.out.println("ID\tNAME\tNUMBER");
   // System.out.println(currentList.size());
    for(int i=0;i<currentList.size();i++)
    {
      System.out.println(currentList.get(i).getId()+"\t"+currentList.get(i).getName()+"\t"+currentList.get(i).getNumber());
    }
  }
  public void deleteContact()
  { 
    boolean flag=false;
    try{
        System.out.println("Enter the name to delete :");
        String name = input.readLine();
        control.deleteContact(name);
       }catch(IOException e){}
  }
  public void editContact()
  { boolean flag=false;
    try{  String name,newnamw,newnumber;
          System.out.println("Enter the name     : ");
          name = input.readLine();
          System.out.println("Select anyone to edit...");
          System.out.println("1. NAME"+"\t\t\t2. NUMBER\n");
          int a = in.nextInt();
          switch(a)
          {
            case 1 : editByName(name);
                     break;
            case 2 : editByNumber(name);
                     break;
          }  
          Contact contact= new Contact();
          //flag=control.editContact(name,newname,newnumber);
       }catch(IOException e){}
  }
  public void editByName(String name)
  {
    try{
        System.out.println("Enter the new Name :");
        String newname = input.readLine();
        control.editByName(name,newname);
       }catch(IOException e){}

  }
  public void editByNumber(String name)
  {
    try{
        System.out.println("Enter the new Number :");
        String newnumber = input.readLine();
        control.editByNumber(name,newnumber);
        }catch(IOException e){}
  }
  public void sort()
  { ArrayList <Contact> sortList = new ArrayList <Contact>();
    sortList = control.sort();
    for(int i=0;i<sortList.size();i++)
       {
        System.out.println(sortList.get(i).getName());
       }
  }

}
