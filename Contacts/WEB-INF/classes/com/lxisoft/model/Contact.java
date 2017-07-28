package com.lxisoft.model;

public class Contact 
{
	private String contactName,contactAddress,contactPhnNo;

	public Contact(String name,String address,String phn_No)
	{
		this.contactName=name;
		this.contactAddress=address;
		this.contactPhnNo=phn_No;
	}

	public String toString()
	{

		return this.contactName+"\t\t\t\t\t"+this.contactAddress+"\t\t\t\t\t"+this.contactPhnNo;
	}

    public void setName(String newName)
	{
		this.contactName=newName;
	}

	public void setAddress(String newAddress)
	{
		this.contactAddress=newAddress;
	}

	public void setPhnNo(String newPhnNo)
	{
		this.contactPhnNo=newPhnNo;
	}
	public void printDetails()
	{
		System.out.print("\n\t\t\t"+this.contactName+"\t\t"+this.contactAddress+"\t\t"+this.contactPhnNo+"\n\t\t");

	}

	public String getName()
	{
		return this.contactName;
	}

	public String getAddress()
	{
		return contactAddress;
	}
	public String getPhnNo()
	{
		return contactPhnNo;
	}





}