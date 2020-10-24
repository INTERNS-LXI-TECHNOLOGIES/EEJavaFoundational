package com.Lxisoft.MovieScriptApp;

import java.util.*;

public class Thor
{
	public ArrayList<String> thorArray = new ArrayList<String>();
	Random random=new Random();
	private String thorDialogue;
	public void setThorDialogue(String a)
	{
		this.thorDialogue=a;

	}
	public String getThorDialogue()
	{
		return thorDialogue;
	}

	public void setThorDialoges()
	{

	 	System.out.println("\n SCENE 1");
	 	thorArray.add("\n Thor: what................");
		thorArray.add("\n Thor: I NOTICED YOU COPIED MY BEARD");
		thorArray.add("\n Thor:Well, the Asgardians of the Galaxy back together again");
		thorArray.add("\n Thor:I need a horse. Then give me one of those large enough to ride");

		System.out.println(thorArray.get(random.nextInt(thorArray.size())));

        
    }


	
	
}