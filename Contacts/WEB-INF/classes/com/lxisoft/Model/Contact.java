 package com.lxisoft.Model;

import java.util.*;
public class Contact implements Comparable<Contact>
{
	private String name,place;
	private int phoneNum;
	public Contact(String name,String place,int phoneNum)
	{
		this.name=name;
		this.place=place;
		this.phoneNum=phoneNum;
	}

	public String toString()
	{
		return ("\t"+name+"\t"+place+"\t"+phoneNum+"\t");
	}

	public int compareTo(Contact secondContact)
	{
		return name.compareTo(secondContact.getName());
	}

	public String getName()
	{
		return name;
	}
	public String getPlace()
	{
		return place;
	}
	public int getPhoneNum()
	{
		return phoneNum;
	}
	public void setName(String name)
	{

		this.name=name;

	}

	public void setPlace(String place)
	{

		this.place=place;

	}

	public void setPhoneNum(int phoneNum)
	{

		this.phoneNum=phoneNum;

	}

	//public void printDetails()
	//{
	//	System.out.print("Name : "+name+"\tPlace : "+place+"\tPhoneNum : "+phoneNum+"\n");
	//}
	
} 