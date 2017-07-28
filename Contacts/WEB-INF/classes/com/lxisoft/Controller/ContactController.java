 package com.lxisoft.Controller;

 //import com.lxisoft.View.*;
 import com.lxisoft.Model.*;
 import java.util.*;
 public class ContactController
 {
 	protected List<Contact> contactList;

 	public ContactController()
 	{
 		Contact[] contact=new Contact[7];

 		contact[0] = new Contact("Amiya","Palakkad",92453452);
 		contact[1] = new Contact("Abhina","Thiruvilamala",92696897);
 		contact[2] = new Contact("Anjali","Pattambi",92450002);
 		contact[3] = new Contact("Sarangi","Guruvayur",92455752);
 		contact[4] = new Contact("Sanil","Malapuram",92303450);
 		contact[5] = new Contact("Prasad","Chelakara",92453451);
 		contact[6] = new Contact("Vishnu","Nemmara",92450450);

 		contactList=new ArrayList<Contact>(Arrays.asList(contact));

 		NameSort nameSort=new NameSort();

		Collections.sort(contactList,nameSort);

		//Display.contactList(contactList);

	}

	public List<Contact> getContacts()
	{
		return contactList;
	}
}	
 		//int index=0;
 		//List<contact> contactList=Arrays.asList(contact);
 		//NameSort sortByName=new NameSort();
 		//AddressSort sortByAddress=new AddressSort();
 
 		/*Scanner s=new Scanner(System.in);
 		Scanner sc=new Scanner(System.in);
 		//do{
 			System.out.println("Select\n 1. To sort contacts by name \n 2. To sort contacts by place\n 3. To search contact by name \n 4. To search contact by place \n");
 			int option=s.nextInt();
 			switch(option)
 				{
 				case 1 : {Collections.sort(contactList);
 						break;}
 				case 2 : {Collections.sort(contactList,sortByAddress);
 						break;}
 				case 3 : {	System.out.println("Enter number to search:");
 							int option=s.nextInt();
 							Collections.sort(contactList,sortByName);
 							index=Collections.binarySearch(contactList,new contact("Amiya",null,0),sortByName);
 							System.out.println(index+1);
 							break;}
 				case 4 : {	System.out.println("Enter number to search:");
 							int option=s.nextInt();
 							Collections.sort(contactList,sortByAddress);
 							index=Collections.binarySearch(contactList,new contact(null,"Palakkad",0),sortByAddress);
 							System.out.println(index+1);
 							break;}
  				}

  		}
 }

 			/*System.out.println("Do you wish to continue?\nEnter '1' to continue else '2'");
 			int choice=sc.nextInt();
 		}while(choice==1);

 		for(contact x:contactList)
 		{
 			x.printDetails();
 		}*/
 	
 