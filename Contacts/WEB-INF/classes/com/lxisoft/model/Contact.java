package com.lxisoft.model;

import java.util.*;

public class Contact
{
	
	private String name,address,phNo;

	public Contact(String name,String address,String phNo)
	{

		this.name=name;
		this.address=address;
		this.phNo=phNo;

	}

/*	public void showContactDetails()
	{

		System.out.print("\t"+name+"\t  "+address+"\t  "+phNo+"\n\n");

	}*/

/*	public int compareTo(Contact secondContact)
	{
     return this.name.compareTo(secondContact.getname());
	}*/

	public String getName()
	{
      
      return this.name;

	}

    public String getAddress()
	{
      
      return this.address;

	}

	public String getPhNo()
	{
		
		return this.phNo;

	}

	public String toString()
	{

		return ("\n\t"+this.name+"\t   "+this.address+"     "+this.phNo+"\n");
		
	}

	public void setName(String name)
	{

		this.name=name;

	}

	public void setAddress(String address)
	{

		this.address=address;

	}

	public void setPhNo(String phNo)
	{

		this.phNo=phNo;

	}


}