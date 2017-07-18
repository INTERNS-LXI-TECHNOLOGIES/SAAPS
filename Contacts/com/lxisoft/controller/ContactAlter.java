 package com.lxisoft.controller;

 import com.lxisoft.model.*;
 import com.lxisoft.view.*;
 import java.util.*;

 public class ContactAlter
 {
   Contacts[] contacts = new Contacts[10];
   List <Contacts> contactList;

public ContactAlter()
{

		contacts[0] = new Contacts("Zak",    "London", "9545867991");
		contacts[1] = new Contacts("Sam",    "Italy",  "8086684571"); 
		contacts[2] = new Contacts("Philip", "Us",     "9846543210");
		contacts[3] = new Contacts("James",  "Spain",  "9749318642");
		contacts[4] = new Contacts("Rose",   "NewYork","9387778892");
		contacts[5] = new Contacts("Prasad", "India",  "9947334451");
		contacts[6] = new Contacts("Dayana", "Paris",  "9526112233");
		contacts[7] = new Contacts("Jack",   "Austria","8606802191");
		contacts[8] = new Contacts("Kaif",   "Newland","9966885544");
		contacts[9] = new Contacts("Teena",  "England","7359891724");

		contactList=new ArrayList<Contacts>(Arrays.asList(contacts));
		DisplayMenu.displayContacts(contactList);
}

}