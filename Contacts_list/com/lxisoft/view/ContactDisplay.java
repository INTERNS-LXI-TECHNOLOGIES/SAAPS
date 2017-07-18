package com.lxisoft.view;

import com.lxisoft.model.*;


import java.util.*;


public class ContactDisplay
{
    public static void showContacts(List<Contact> contactList)
    {
      System.out.println("\n\t\t____________________________Contact Details_________________________\t\n");
      
      System.out.print("\t\t\t Name \t\t Address \t\tPhn_No  \t\n");

      System.out.println("\n\t\t___________________________________________________________________\t\n");



      for(Contact contact: contactList)

         contact.printDetails();                                



     System.out.println("\n\t\t___________________________________________________________________\t\n");

   } 

}