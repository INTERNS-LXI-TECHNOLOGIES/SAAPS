package com.lxisoft.controller;

import com.lxisoft.model.Contact;
//import com.lxisoft.view.*;
import java.util.*;
import com.lxisoft.utility.*;
import java.util.regex.*;


public class ContactController
{

	private static SortedSet<Contact> contactSet;
	private static boolean isSetCreated=false;
	private static Contact currentContact;
	private static FileUtility fu=new FileUtility();
	private static int i=0;

	public static void initializeContactSet()
	{

		/*Contact[] contacts=new Contact[10];*/

/*		contacts[0]=new Contact("Sarangi balu","sarangibalu.a@lxisoft.com","Koonamuchi","9895652121");
		contacts[1]=new Contact("Sanil kumar p","sanilkumar.p@lxisoft.com","Wandoor","9895677787");
		contacts[2]=new Contact("Prasad vg","prasad.v.g@lxisoft.com","Chelakkara","9945658944");
		contacts[3]=new Contact("Amiya sushanand","amiya.sushanand@lxisoft.com","Chandranagar","9446676564");
		contacts[4]=new Contact("Abhina s","abhina.s@lxisoft.com","Thiruvilamala","8129675544");
		contacts[5]=new Contact("Anjali chandran","anjali.chandran@lxisoft.com","Palakkad","9745664698");
		contacts[6]=new Contact("Sinusha","sinusha@lxisoft.com","Palakkad","7102146512");
		contacts[7]=new Contact("Vishnu g","vishnu.g@lxisoft.com","Nenmara","9995274530");
		contacts[8]=new Contact("Basil jude","basil.jude@lxisoft.com","Nilambur","8086346657");
		contacts[9]=new Contact("Shanees mk","shanees.m.k@lxisoft.com","Wayanad","9024247746");*/
		contactSet=new TreeSet<Contact>(fu.readFromFile());
		System.out.println("reading contact....."+contactSet);
		/*contactList=new ArrayList<Contact>(Arrays.asList(contacts));*/
/*		NameSorter nameSorter=new NameSorter();

		Collections.sort(contactList,nameSorter);*/
		isSetCreated=true;

/*		MenuShower ms=new MenuShower();
l
		ms.listContacts(contactList);*/
		          
	}

/*	public static List<Contact> getContactList()
	{
		return contactList;
	}*/

	public static Set<Contact> getContactSet()
	{
		return contactSet;
	}

	public static void createContact(Contact contact)
	{
		System.out.println("method createContact() is called to create..."+contact+currentContact);
		boolean b=contactSet.add(contact);
		//System.out.println(contactSet);
   		System.out.println(b);
   		fu.writeToFile(contactSet);
   		System.out.println("create.."+(i++));

	}

	public static boolean isSetCreated()
	{
		return isSetCreated;
	}
	public static void editContact(Contact contact)
	{
		System.out.println("method editContact() is called to create.."+contact);
		System.out.println("edit.."+(i++));
		deleteContact(currentContact);
		createContact(contact);
	}
/*	public static void setCurrentIndex(int index)
	{
		currentIndex=index;
	}*/
/*	public static int getCurrentIndex()
	{
		return currentIndex;
	}*/
	public static void setCurrentContact(Contact contact)
	{
		currentContact=contact;
		//System.out.println("current contact"+currentContact);
	}
	public static Contact getCurrentContact()
	{
		
		return currentContact;

	}
	public static void deleteContact(Contact contact)
	{
		System.out.println("method deleteContact() is called to delete..."+contact);
		contactSet.remove(contact);
		fu.writeToFile(contactSet);
		System.out.println("delete.."+(i++));
	}
	public static Set<Contact> searchName(String keyName)
	{

		Pattern p =null;

		Matcher m =null;

  		Set<Contact> resultSet=new TreeSet<Contact>();

     	p = Pattern.compile(keyName,Pattern.CASE_INSENSITIVE); // the expression

     	for(Contact contact:contactSet)
     	{

      		m = p.matcher(contact.getName()); 

      		while(m.find() && m.start()==0)
      		{
        		
        		resultSet.add(contact);

      		}
      
    	}
     
     return  resultSet;

	}
} 