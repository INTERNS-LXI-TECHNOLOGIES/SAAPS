package com.lxisoft.view;

import com.lxisoft.model.*;
import java.util.*;


public class ContactDisplay 
{
	
	public static void listContacts(List<Contact> contactList)
	{

		System.out.print("\n\t____________Contacts____________\n");
			
		
		System.out.print("\n\t__________________________________\n\n\tName  \t  Address  \t  PhoneNo\n\n\t__________________________________\n\n");
			
		for(Contact contact: contactList)

			System.out.print(contact);
		System.out.print("\n\t____________________________________\n");


	}

}