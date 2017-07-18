package com.lxisoft.model;

public class Contacts
{
	private String name;
	private String address;
	private String phone_no;

	public Contacts(String name,String address,String phone_no)
	{
      this.name=name; 
      this.address=address;
      this.phone_no=phone_no;
	}

	public String toString()
	{
		return this.name + "\t\t" + this.address + "\t\t" +this.phone_no;
	}
	
}