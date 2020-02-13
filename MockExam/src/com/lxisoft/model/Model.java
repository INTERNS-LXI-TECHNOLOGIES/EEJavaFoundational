package com.lxisoft.model;
import java.util.*;
public class Model
{
	int slno;
	String qn;
	String opt1;
	String opt2;
	String ans;
	public void setQn(String str)
	{
		this.qn=str;
	}
	public void setOpt1(String str)
	{
		this.opt1=str;
	}
	public void setOpt2(String str)
	{
		this.opt2=str;
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
		public String getOpt1()
	{
		return opt1;
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