import java.util.*;


public class ArrayConversion
{
	public ArrayConversion()
	{

       Intern[] interns=new Intern[10];

		SortAddress sortAddress=new SortAddress();
		SortPhoneNo sortPhoneNo=new SortPhoneNo();
		
		interns[0]=new Intern("Sarangi","Koonamuchi","98956");
		interns[1]=new Intern("Prasad","Chelakkara","65894");
		interns[2]=new Intern("Amiya","Chandranagar","67656");
		interns[3]=new Intern("Abhina","Thiruvilamala","675544");
		interns[4]=new Intern("Anjali","Palakkad","64698");
		interns[5]=new Intern("Sinusha","Palakkad","46512");
		interns[6]=new Intern("Uvais","Kootupatha","27453");
		interns[7]=new Intern("Sandra","Nilambur","34665");
		interns[8]=new Intern("Jaseel","Chelakara","247746");
		interns[9]=new Intern("Sarath","Chelakara","67778");


		List<Intern> internList=Arrays.asList(interns);

		 
         Scanner s=new Scanner(System.in);
         Scanner s1=new Scanner(System.in);
         int doAgain;

         do
         {
			System.out.print("\n\tSearch interns \n\n\t\t1. by name \n\t\t2. by address \n\t\t3. by phone number\n\n\t");
			int choice=s.nextInt();
			String key;
			int index=-1;

			switch(choice)
			{

	         case 1:{

		         		System.out.print("\n\tEnter the name to be searched: ");
		         		key=s1.nextLine();
		         	    Collections.sort(internList);
		         	    index=Collections.binarySearch(internList,new Intern(key,null,null));
		                break;

	                }
	         case 2:{
	                 	
	                 	System.out.print("\n\tEnter the address to be searched: ");
		         		key=s1.nextLine();
		         	    Collections.sort(internList,sortAddress);
		         	    index=Collections.binarySearch(internList,new Intern(null,key,null),sortAddress);
		                break;
	                }   
	         case 3:{
	                 	
	                 	System.out.print("\n\tEnter the phone number to be searched: ");
		         		key=s1.nextLine();
		         	    Collections.sort(internList,sortPhoneNo);
		         	    index=Collections.binarySearch(internList,new Intern(null,null,key),sortPhoneNo);
		                break;
	                } 
	        default:
	        		System.out.print("\n\tIncorrect choice...\n\t\n");    

			}

			if(index>=0)
			{

				System.out.print("\n\n\t_______________________________________\n\n\tSearched element is present in the list\n\t_______________________________________\n\n\t"+internList.get(index));

			}

			else
			{

				System.out.print("\n\t____________InternsList____________\n");
			
		
				System.out.print("\n\t__________________________________\n\n\tName  \t  Address  \t  PhoneNo\n\n\t__________________________________\n\n");
			
				for(Intern intern: internList)

					intern.showInternDetails();
				System.out.print("\n\t____________________________________\n");
			}

			System.out.print("\n\t1. Continue\n\tPress any other key to exit\n\n");
			doAgain=s.nextInt();
		}while(doAgain==1);

		System.out.print("\n\tExiting.......................\n\n");
	}
}