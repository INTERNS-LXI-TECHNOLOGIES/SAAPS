import java.util.*;

public class PhoneContacts
{
	Intern[] interns=new Intern[10];
		int select,num;
		SortByAddress address = new SortByAddress();
		SortByPhoneNo phoneNo = new SortByPhoneNo(); 

	Scanner ss=new Scanner(System.in);
	Scanner s=new Scanner(System.in);	

	List <Intern> internList;

public PhoneContacts() 
{
		interns[0] = new Intern("Zak",    "London", "9545867991");
		interns[1] = new Intern("Sam",    "Italy",  "8086684571"); 
		interns[2] = new Intern("Philip", "Us",     "9846543210");
		interns[3] = new Intern("James",  "Spain",  "9749318642");
		interns[5] = new Intern("Rose",   "NewYork","9387778892");
		interns[4] = new Intern("Prasad", "India",  "9947334451");
		interns[6] = new Intern("Dayana", "Paris",  "9526112233");
		interns[7] = new Intern("Jack",   "Austria","8606802191");
		interns[8] = new Intern("Kaif",   "Newland","9966885544");
		interns[9] = new Intern("Teena",  "England","7359891724");

		internList = new ArrayList<Intern>(Arrays.asList(interns));



		System.out.println("\n\t..........................Details of interns are.........................................");
	

		System.out.println("\n\n\t\t\t Name \t\tAddress\t\tPhone\n\n");
         for(int i=0;i<interns.length;i++)
		 {
           interns[i].printDetails();
         }
         System.out.println("\t\t_____________________________________________________________________");
        
/*
		System.out.println("\n\t...............Array converted To List............................... \n");
		for(Intern details: internList)*/
/*      System.out.print("\n\t"+ details );
        System.out.println("\n"); */
        /* System.out.println("\n one ="+Arrays.binarySearch(internList,"Prasad"));*/

do
{
System.out.println("\n\nSelect Your Choice..:\n\t 1.Sort By Name \n\t 2.Sort By Address\n\t 3.Sort By Phone_no\n\t 4.search for Name \n\t 5.Search for Address \n\t 6.Search for Phone_no \n\t 7.Edit your details \n\t 8.Add new Contact \n\t 9.Delete Your contact\n\t 10.Show Details");
int choice=s.nextInt();

switch(choice)
{
  case 1:
  {
   nameByComparable();
   break;
  }
	case 2:
	 {
	  addressByComparator();
      break;
	 }
      case 3:
      {
      	phoneNoByComparator();
	   break;
       }
	case 4:
	{
	  searchByName();
     break;
	}
	case 5:
	 {
	 	searchByAddress();
	 	break;
	 }
	case 6:
	{
      searchByPhoneNo();
	  break;
    }

    case 7:
    {
    	editDetails();
    	break;
    }

    case 8:
    {
    addContact();
    break;

    }
    case 9:
    {
    	removeContact();
    	break;
    }
     
     case 10:
     {
     	showDetails();
     	break;
     }
  default:
   System.out.println("Invalid choice..please try again later");
   break;
}
	System.out.println("\n\t\t..Do you want to continue..!\n\t\t   1 Continue 2 Exit\n");
    System.out.print("\t\t\t");
	select= s.nextInt();
       }
       while(select==1);
}

public void showDetails()
{
        System.out.println("\n\t..........................Details of interns are................................");
		System.out.println("\n\t___________________________________________________________________________");
		System.out.println("\n\n\t\t Name \t\tAddress\t\tPhone\n\n");
        
		for(Intern details : internList)
        System.out.println("\n\t\t " + details);
         System.out.println("\t_____________________________________________________________________");
}
public void nameByComparable()
{
	 	Collections.sort(internList);
		System.out.println("\n\t..........Sorted by Name using Comparable.............................\n");
		for(Intern details : internList)
     	System.out.println("\n\t" + details);
}

public void addressByComparator()
{
  Collections.sort(internList,address);
  System.out.print("\n\n\t...........Sorted by Address using Comparator..............................\n");
  for(Intern details : internList)
  System.out.println("\n\t" + details);
}

public void phoneNoByComparator()
{
 Collections.sort(internList,phoneNo);
 System.out.println("\n\n\t........Sorted by Phone_no using Comparator................................\n");
 for(Intern details : internList)
 System.out.println("\n\t " + details);
}

public void searchByName()
{
 Collections.sort(internList);
 System.out.println("enter a name to search..\n");
 String nameToBeSearched=ss.nextLine();
 int index=Collections.binarySearch(internList,new Intern(nameToBeSearched,"null","null"));
 System.out.println("\n Found element at position "+ index);

	 if(index>=0)
	 {
	 System.out.println("\n\n\tHere the details..\n\t"+" "+internList.get(index));
	 }

	 else
	 {
	 System.out.println("\n Your search not found..here the list of saved data.......\n");
	 for(Intern details : internList)
	 System.out.println("\n\t" +details);
	 }

}

public void searchByAddress()
{
Collections.sort(internList,address);
System.out.println("\n\tEnter an address to search\n");
String addressToBeSearched=ss.nextLine();
int index=Collections.binarySearch(internList,new Intern("null",addressToBeSearched,"null"),address);
System.out.println("\n Found element at position "+index);

	 if(index >= 0)
	 {
	 System.out.println("\n\n\t\there the details...\n"+"\t"+internList.get(index));
	 }

	  else
	  {   
	  System.out.println("\n\t Your search not found..here the list of Saved data\n");
	  for(Intern details : internList)
	  System.out.println("\n\t"+details);
	  }

}

public void searchByPhoneNo()
{
	Collections.sort(internList,phoneNo);
	System.out.println("\n\t Enter a Phone_no to search\n");
	String phoneNoToBeSearched=ss.nextLine();
	int index=Collections.binarySearch(internList,new Intern("null","null",phoneNoToBeSearched),phoneNo);
	System.out.println("\n Found at position "+index);

	 if(index>=0)
	 {
	 System.out.println("\n\n\there the deatils....\n"+"\t"+internList.get(index));
	 }
	  else
	  {   
	  System.out.println("\n\tYour search not found..here the list of saved data");
	  for(Intern details : internList)
	  System.out.println("\n\t"+details);
	  }
	
}

public void editDetails()
{
	do
	{
		Collections.sort(internList);
	System.out.println("Enter your name\n");
	String idToSearch = ss.nextLine();
	int index=Collections.binarySearch(internList,new Intern(idToSearch,"null","null"));

	if(index>=0)
	{
		System.out.println("\n\n\t here your details..\n"+"\t"+internList.get(index));
		System.out.println("\n\n\t Select your option to edit..\n1.Edit Name \n2.Edit Phone no \n3.Edit Address\n");
		int opt= s.nextInt();

		switch(opt)
		{
			case 1:
			{
			   System.out.println("Enter your name\n");
			   String newName= ss.nextLine();
			   internList.get(index).updateName(newName);
			   System.out.println("\n\t!....Succesfully Saved....!\n");
			   System.out.println("\n\n\t here your updated details..\n"+"\t"+internList.get(index));
			   	System.out.println("\n\t\t_________________Updated List_________________________\n");
			   showDetails();

			   break;
            }

            case 2:
            {
            	System.out.println("Enter your new phone number\n");
            	String newPhone = ss.nextLine();
            	internList.get(index).updatePhoneNo(newPhone);
            	System.out.println("\n\t!....Succesfully Saved....!\n");
            	System.out.println("\n\n\t here your updated details..\n"+"\t"+internList.get(index));
            	System.out.println("\n\t\t_________________Updated List_________________________\n");
            	showDetails();
            	break;
            }

            case 3:
            {
            	System.out.println("enter your new Address\n");
            	String newAddress = ss.nextLine();
            	internList.get(index).updateAddress(newAddress);
            	System.out.println("\n\t!....Succesfully Saved....!\n");
            	System.out.println("\n\n\t here your updated details..\n"+"\t"+internList.get(index));
            	System.out.println("\n\t\t_________________Updated List_________________________\n");
            	showDetails();
            	break;
            }

            default:
            System.out.println("\n_______Invalid entry____________");
		}
	}

	else
	{
		System.out.println("Sorry..! Your search not found..please enter a valid name");
	}
	System.out.println("\n\tDo you want to search again...\n\t 1.Yes 2.No");
	num = s.nextInt();
 }
    while(num==1);
}

public void addContact()
{   
	/*Collections.sort(internList);
    internList = new ArrayList<Intern>();*/
    System.out.println("Enter Your name\n\t");
    String newName=ss.nextLine();
    System.out.println("Enter Your Address\n\t");
    String newAddress=ss.nextLine();
    System.out.println("Enter Your Phone_no");
    String newPhone=ss.nextLine();
	internList.add(new Intern(newName,newAddress,newPhone));
	System.out.println("\t\tSuccesfully Saved your Data....!");
	System.out.println(".......................Updated List........................\n");
     showDetails();

}

public void removeContact()
{
	Collections.sort(internList);

    
	System.out.println("Enter your name\n");
	String nameToSearch = ss.nextLine();
	int index=Collections.binarySearch(internList,new Intern(nameToSearch,"null","null"));
	if(index>=0)
	{
		System.out.println("\n\n\t Here your deatils..\n\t"+internList.get(index));
		internList.remove(index);
		System.out.println("\n\n\tSuccesfully removed");
		System.out.println("\n\t\t_________________Updated List_________________________\n");
	     showDetails();

	}
	else
	{
		System.out.println("not found");
	}
}
}