package com.lxisoft.view;

import com.lxisoft.model.*;
import java.util.*;
public class DisplayMenu
{
	public static void displayContacts(List <Contacts> contactList)
	{
        //contactList = new ArrayList<Contacts>(contactList);
		System.out.println("\n\t..........................Contact details.........................................");
	

		System.out.println("\n\n\t\t Name\t\tAddress\t\tPhone\n");
         for(Contacts details : contactList)
		 {
           System.out.println("\n\t\t"+details);
         }
         System.out.println("\t_____________________________________________________________________");
	}
	
} 