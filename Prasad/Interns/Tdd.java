import java.util.*;
public class Tdd
{
	public static void main(String[] args)
	{
		Intern[] interns=new Intern[10];
		int select;


		interns[0] = new Intern("Zak","London","9545867991");
		interns[1] = new Intern("Sam","Italy","8086684571");
		interns[2] = new Intern("Philip","Us","9846543210");
		interns[3] = new Intern("James","Spain","9749318642");
		interns[4] = new Intern("Prasad","India","9947334451");
		interns[5] = new Intern("Rose","NewYork","9387778892");
		interns[6] = new Intern("Dayana","Paris","9526112233");
		interns[7] = new Intern("Jack","Austria","8606802191");
		interns[8] = new Intern("Kareena","Newland","9966885544");
		interns[9] = new Intern("Teena","England","7359891724");


SortByAddress address = new SortByAddress();
SortByPhoneNo phoneNo = new SortByPhoneNo(); 

Scanner ss=new Scanner(System.in);
Scanner s=new Scanner(System.in);	

/*
		for(int i=0;i<interns.length;i++)
		{
			System.out.print(sList.get(i)+"\n");
		}*/

		System.out.println("\n\t..........................Details of interns are.........................................");

		System.out.println("\n\n\t\t\t Name \t\tAddress\t\tPhone\n\n");

		for(int i=0;i<interns.length;i++)
		{
           interns[i].printDetails();

           /*Arrays.sort(interns[i].sortByName());*/
		}
         System.out.println("\t\t_____________________________________________________________________");

		List <Intern> internList = Arrays.asList(interns);
/*
		System.out.println("\n\t...............Array converted To List............................... \n");

		for(Intern details: internList)*/
/*
			System.out.print("\n\t"+ details );

		System.out.println("\n"); */

       

        /* System.out.println("\n one ="+Arrays.binarySearch(internList,"Prasad"));*/

do
{
System.out.println("\n\nSelect Your Choice..:\n\t 1.Sort By Name \n\t 2.Sort By Address\n\t 3.Sort By Phone_no\n\t 4.search for Name \n\t 5.Search for Address \n\t 6.Search for Phone_no \n\t");

int choice=s.nextInt();

switch(choice)
{

	case 1:
	{
	 	Collections.sort(internList);

		System.out.println("\n\t..........Sorted by Name using Comparable.............................\n");
		 for(Intern details : internList)

     	System.out.println("\n\t" + details);
 
	break;
	}
	case 2:
	 {

     Collections.sort(internList,address);

     System.out.print("\n\n\t...........Sorted by Address using Comparator..............................\n");
      for(Intern details : internList)

     	System.out.println("\n\t" + details);

	break;
	 }
      case 3:
      {
	 Collections.sort(internList,phoneNo);

	 System.out.println("\n\n\t........Sorted by Phone_no using Comparator................................\n");
	 for(Intern details : internList)
	 	System.out.println("\n\t " + details);
       break;
       }
	case 4:
	{
     Collections.sort(internList);

 	 System.out.println("enter a name to search..\n");

	 String nameToBeSearched=ss.nextLine();

	 int index=Collections.binarySearch(internList,new Intern(nameToBeSearched,"null","null"));

	 System.out.println("\n Found element at position "+ index);

	 if(index>0)
	 {
	 System.out.println("\n\n\tHere the details..\n\t"+" "+internList.get(index));
	 }

	 else
	 {
	 System.out.println("\n Your search not found..here the list of saved data.......\n");
	 for(Intern details : internList)
	 System.out.println("\n\t" +details);
	 }

	 break;
	}

	case 5:
	{
	 Collections.sort(internList,address);

 	 System.out.println("\n\tEnter an address to search\n");
  
	 String addressToBeSearched=ss.nextLine();
	 int index=Collections.binarySearch(internList,new Intern("null",addressToBeSearched,"null"),address);

	 System.out.println("\n Found element at position "+index);

	 if(index > 0)
	 {
	 System.out.println("\n\n\t\there the details...\n"+"\t"+internList.get(index));
	 }

	  else
	  {   
	  System.out.println("\n\t Your search not found..here the list of Saved data\n");
	  for(Intern details : internList)
	  System.out.println("\n\t"+details);
	  }
	  break;
	}

	case 6:
	{

	Collections.sort(internList,phoneNo);

	System.out.println("\n\t Enter a Phone_no to search\n");

	String phoneNoToBeSearched=ss.nextLine();
	int index=Collections.binarySearch(internList,new Intern("null","null",phoneNoToBeSearched),phoneNo);

	System.out.println("\n Found at position "+index);

	 if(index>0)
	 {
	 System.out.println("\n\n\there the deatils....\n"+"\t"+internList.get(index));
	 }
	  else
	  {   
	  System.out.println("\n\tYour search not found..here the list of saved data");
	  for(Intern details : internList)
	  System.out.println("\n\t"+details);
	  }
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
}