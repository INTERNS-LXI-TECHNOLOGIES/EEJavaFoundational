package com.lxisoft.domain;
import java.util.*;
import java.io.*;
public class Word 
{
	private String id;
	private String word;
	private String meaning;
 
	public void setId(String id)
	{
		this.id=id;
	}
	public String getId()
	{
		return id;
	}
	

	public void setWord(String word)
	{
		this.word=word;
	}
	public String getWord()
	{
		return word;
	}


	public void setMeaning(String meaning)
	{
		this.meaning=meaning;
	}
	public String getMeaning()
	{
		return meaning;
	}
}
