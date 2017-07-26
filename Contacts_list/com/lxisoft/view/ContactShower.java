package com.lxisoft.view;

import com.lxisoft.model.*;


import java.util.*;


public class ContactShower
{
    public void showContacts(List<Contact> contactList)
    {

      Scanner s=new Scanner(System.in);

      System.out.println("\n\t\t____________________________Contact Details_________________________\t\n");
      
      System.out.print("\t\t\t Name \t\t Address \t\tPhn_No  \t\n");

      System.out.println("\n\t\t___________________________________________________________________\t\n");



      for(Contact contact: contactList)

         contact.printDetails();                                



     System.out.println("\n\t\t___________________________________________________________________\t\n\n\n\t\t<<< prev\t\t\t\t\t\tNext >>>\t\n\n\n\t\tpress\t"+((contactList.size())+1)+" Search contact\t\n\n\t\tpress\t"+((contactList.size())+2)+" Create contact\t\n");
     
     int choice;

     do
     {
       choice=s.nextInt();

     } while(choice>((contactList.size())+2)); 
     

   } 

}