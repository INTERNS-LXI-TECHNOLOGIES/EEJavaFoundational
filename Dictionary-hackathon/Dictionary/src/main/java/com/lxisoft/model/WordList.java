package com.lxisoft.model;

import com.lxisoft.model.*;
import com.lxisoft.Domain.*;
import java.util.*;
public class WordList
{
	public ArrayList<DictionaryModel> list=new ArrayList<DictionaryModel>();
	public void setWordList(DictionaryModel wordlist)
	{
			list.add(wordlist);
	}
	public ArrayList<DictionaryModel> getWordList()
	{
		return list;
	}
}