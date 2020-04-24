package com.lxisoft.model;
import java.util.*;
import java.io.*;
import com.lxisoft.model.*;

public class WordListModel
{
	private List<WordModel>wordsList=new ArrayList<WordModel>();
	 
	public void setWordsList(WordModel model)
	{
		wordsList.add(model);	
	}
	public List<WordModel> getWordsList()
	{
		return wordsList;
	}
}