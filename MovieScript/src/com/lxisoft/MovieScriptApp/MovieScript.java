package com.Lxisoft.MovieScriptApp;
import com.Lxisoft.MovieScriptApp.*;
import com.Lxisoft.Files.*;
//import java.util.io.*;
import java.util.*;
import java.io.FileNotFoundException;

public class MovieScript
{
	Scene1 s1 =new Scene1();
	Scanner scanner=new Scanner(System.in);
	public void scenes()
	{  
 	int choice=0;
    do
   		{
      	System.out.println("\n________________________");
        System.out.println("\n\n1. Scene-1 \n\n2. Scene-2  \n\n Press 0 for Exit \n");
        choice=scanner.nextInt();
        if(choice==1)
        {
            s1.sc1();

        }
        if(choice==2)
        {
             
           //admin.getMenu();
         
        }
        if(choice==3)
        {
             
           //admin.getMenu();
         
        }
        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    while(choice>0);
      
}

}