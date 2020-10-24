package com.Lxisoft.MovieScriptApp;
import java.util.*;

public class Thanos
{
	public ArrayList<String> thanosArray = new ArrayList<String>();
	private String thanosDialogue;
	Random random=new Random();
	
	public void setThanosDialogue(String a)
	{
		this.thanosDialogue=a;

	}

	public String getThanosDialogue()
	{
		return thanosDialogue;
	}

	public void thanosDialogueMethod()
	{
		thanosArray.add("Thanos : Iam Waitinng");
		thanosArray.add("Thanos : Give Throne With Stone");
		System.out.println(thanosArray.get(random.nextInt(thanosArray.size())));

		
		
	}
}