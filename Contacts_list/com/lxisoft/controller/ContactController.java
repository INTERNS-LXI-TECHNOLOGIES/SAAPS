package com.lxisoft.controller;

import com.lxisoft.model.*;

import com.lxisoft.view.*;


import java.util.*;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   

public class ContactController
{

      List<Contact> contactList;

	public ContactController()
	{

           Contact[] contacts=new Contact[10];

           contacts[0]=new Contact("sanil","malapurm","56755");
           contacts[1]=new Contact("sarangi","guruvayur","44514"); 
           contacts[2]=new Contact("prasad","chelakkara","96755");
           contacts[3]=new Contact("amiya","palakkad","98765");
           contacts[4]=new Contact("abhina","thiruvila","56757");
           contacts[5]=new Contact("anjali","malapurm","36756");
           contacts[6]=new Contact("sinusha","pattambi","32345");
           contacts[7]=new Contact("vishnu","palakkad","56749");
           contacts[8]=new Contact("bazil","wayanaaad","45647");
           contacts[9]=new Contact("richu","perubilav","21424");

           contactList=new ArrayList<Contact>(Arrays.asList(contacts));

           NameSorter sortName=new NameSorter();

           Collections.sort(contactList,sortName);

           ContactShower cs=new ContactShower();
           
           cs.showContacts(contactList);

  }

}  