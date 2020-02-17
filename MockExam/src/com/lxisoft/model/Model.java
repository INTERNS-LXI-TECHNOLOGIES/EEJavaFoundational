package com.lxisoft.model;
import java.util.*;
public class Model
{
	int slno;
	String qn;
	String opt= new String[4];
	String ans;
	public void setQn(String str)
	{
		this.qn=str;
	}
	public void setOpt(String[] str)
	{
		this.opt[0]=str[];
	}
	public void setAns(String str)
	{
		this.ans=str;
	}
	public void setSlno(int a)
	{
		this.slno=a;
	}
	public String getQn()
	{
		return qn;
	}
		public String[] getOpt()
	{
		return opt[];
	}
	public String getOpt2()
	{
		return opt2;
	}
		public String getAns()
	{
		return ans;
	}
    	public int getSlno()
	{
		return slno;
	}

}