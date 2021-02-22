package com.Lxisoft.Moviescript.Control;
//import com.Lxisoft.Moviescript.Model.*;
import com.Lxisoft.Moviescript.Control.*;
//import com.Lxisoft.Files.*;
//import java.util.io.*;
import java.util.*;
//import java.io.FileNotFoundException;
public class View 
public class Control
{
	String dialogue;
     Scanner scanner=new Scanner(System.in);
     Scene1 s1 =new Scene1();

	 public void addDynamically(){


            System.out.println("Enter the nextLine" );
             dialogue=scanner.next();


         s1.scene1.add(dialogue);
            
           
            }
             public void removeDynamically()
             {
            System.out.println("Enter the index Number of item to be deleted");
            int indexnumber=scanner.nextInt();

          
          s1.scene1.remove(indexnumber);
            }

            
            
             public void  modifyNameDynamically(){
                System.out.println("Enter the index number to be modified");
                int indexnumber=scanner.nextInt();
                System.out.println("Enter the new name");
                String newDialouge=scanner.next();
               // comedian.comedianScript[indexnumber].set(newDialouge);
            }


             ArrayList<String>  scene1= new ArrayList<>();
    ArrayList<String>  scene2= new ArrayList<>();
    Random random=new Random();
    private int randomNumber;


    public void setRandomNumber(int a)
    {
    this.randomNumber=a;

    }
    public int getRandomNumber(){
        return randomNumber;
    }

    public void addingDialogue()
    {
   
  

   scene1.add("SCENE 1");
   scene1.add(" Tony Stark : Hey!");

   scene1.add("Father : The door is this way, pal.");

scene1.add("Tony Stark : Oh, yeah.");

scene1.add("Father : Looking for Doctor Zola, have you seen him?");

scene1.add("Tony Stark : Yeah, Doctor Zola.\nNo, I haven't seen a soul.");

scene1.add("Tony Stark : Pardon me.");

scene1.add("Father : Do I know you?");

scene1.add("Tony Stark : No, sir.");

scene1.add("Tony Stark : I'm a visitor from MIT.");

scene1.add("Father : MIT.");

scene1.add("Father : Got a name?");

scene1.add("Tony Stark : Howard.");
scene1.add("Father : - That'll be easy to remember.\n - Howard... ");

scene1.add("Father :  Potts.");

scene1.add("Tony Stark : Well, I'm Howard Stark. ");

scene1.add("............THE END( Scene-1 )..............");

}
public void addingDialogueScene2()
{
    scene2.add("SCENE 2");
    scene2.add("    SOMEWHERE AT SPACE   ")
    scene2.add("CLINT BARTON: Okay, hold on. Don't shoot. You see where you're going?");

    scene2.add("LILA BARTON: Mhm.");

scene2.add("CLINT BARTON: Okay, now let's worry about how you get there.");

scene2.add("CLINT BARTON: Here. Can you see?");

scene2.add("LILA BARTON: Yeah.");

scene2.add("CLINT BARTON: You sure?");

scene2.add("LILA BARTON: Mhm.");

scene2.add("CLINT BARTON: How about now?");

scene2.add("CLINT BARTON: Alright. Ready your fingers.");

scene2.add("COOPER BARTON: Nice.");

scene2.add("LAURA BARTON: Nice throw, kiddo.");

scene2.add("COOPER BARTON: You go.");
scene2.add("LAURA BARTON: Hey, you guys want mayo or mustard, or both? [Camera switches to Lila who then proceeds to look at Clint.");

scene2.add("LILA BARTON: Who wants mayo on a hotdog?");

scene2.add("CLINT BARTON: Probably your brothers.");

scene2.add("............THE END( Scene-2 )..............");

}
}
