package com.lxisoft.controller;

import com.lxisoft.model.*;
import com.lxisoft.view.*;
import java.util.*;

public class ContactInitializer
{

	protected List<Contact> contactList;

	public ContactInitializer()
	{

		Contact[] contacts=new Contact[10];

		contacts[0]=new Contact("Sarangi","Koonamuchi","98956");
		contacts[1]=new Contact("Prasad","Chelakkara","65894");
		contacts[2]=new Contact("Amiya","Chandranagar","67656");
		contacts[3]=new Contact("Abhina","Thiruvilamala","675544");
		contacts[4]=new Contact("Anjali","Palakkad","64698");
		contacts[5]=new Contact("Sinusha","Palakkad","46512");
		contacts[6]=new Contact("Uvais","Kootupatha","27453");
		contacts[7]=new Contact("Sandra","Nilambur","34665");
		contacts[8]=new Contact("Jaseel","Chelakara","247746");
		contacts[9]=new Contact("Sarath","Chelakara","67778");

		contactList=new ArrayList<Contact>(Arrays.asList(contacts));

		ContactDisplay.listContacts(contactList);

	}
}