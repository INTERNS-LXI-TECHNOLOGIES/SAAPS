import java.util.*;


public class ArrayConversion
{

	List<Intern> internList;


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

		internList=new ArrayList<Intern>(Arrays.asList(interns));
		/*if(internList instanceof List)
		internList=Arrays.asList(interns);*/

		 
         Scanner s=new Scanner(System.in);
         Scanner s1=new Scanner(System.in);
         int doAgain,choice,index=-1;
         String key;

         do{

         		System.out.print("\n\tSelect option \n\n\t\t1. Search \n\t\t2. Create \n\t\t3. Edit \n\t\t4. Delete \n\n\t");
         		int mainOption=s.nextInt();


         //do

         switch(mainOption)
         {

         	case 1:
         	{
			System.out.print("\n\tSearch interns \n\n\t\t1. by name \n\t\t2. by address \n\t\t3. by phone number \n\n\t");
			choice=s.nextInt();

			switch(choice)
			{

	         case 1:{

	         			System.out.print("\n\tEnter the name to be searched: ");
						key=s1.nextLine();
	         			index=searchByName(key);
						break;

	                }
	         case 2:{
	                 	
	                 	System.out.print("\n\tEnter the address to be searched: ");
						key=s1.nextLine();
	                 	index=searchByAddress(key);
		                break;

	                }   
	         case 3:{
	                 	
	                 	System.out.print("\n\tEnter the phone number to be searched: ");
						key=s1.nextLine();
	         			index=searchByPhNo(key);
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
				System("\n\tSorry searched element is not present in the list\n");
				listIntern();
			}

			break;
		}

		case 2:
		{

			System.out.print("\n\tEnter details of new intern\n\t");
			System.out.print("\n\tName: ");
			String name=s1.nextLine();
			System.out.print("\n\tAddress: ");
			String address=s1.nextLine();
			System.out.print("\n\tPhone number: ");
			String phoneNo=s1.nextLine();

			internList.add(new Intern(name,address,phoneNo));
			break;

		}

		case 3:
		{

			
			System.out.print("\n\tEnter the name of intern to be updated: ");
			key=s1.nextLine();
			index=searchByName(key);
			String valueToBeUpdated;
			if(index>=0)
			{

				System.out.print("\n\n\t_______________________________________\n\n\tLooked element is present in the list\n\t_______________________________________\n\n\t"+internList.get(index));				
				System.out.print("\n\t Edit \n\n\t\t1. Name \n\t\t2. Address \n\t\t3. Phone number \n\n\t");
				int editOption=s.nextInt();
				switch(editOption)
				{
					case 1:
					{
						
						System.out.print("\n\tEnter the new name :");
						valueToBeUpdated=s1.nextLine();
						(internList.get(index)).setName(valueToBeUpdated);
						System.out.print("\n\n\tContact has been updated\n");
						break;

					}

					case 2:
					{

						System.out.print("\n\tEnter the new name :");
						valueToBeUpdated=s1.nextLine();
						(internList.get(index)).setAddress(valueToBeUpdated);
						System.out.print("\n\n\tContact has been updated\n");
						break;

					}

					case 3:
					{

						System.out.print("\n\tEnter the new name :");
						valueToBeUpdated=s1.nextLine();
						(internList.get(index)).setPhNo(valueToBeUpdated);
						System.out.print("\n\n\tContact has been updated\n");
						break;
					}

					default:
						System.out.print("\n\tInvalid choice.........!");
				}

			}
			else 
				System.out.print("\n\tNo intern with this name is present in the list");	

			break;		

		}

		case 4:
		{

			System.out.print("\n\tEnter the name of intern to be deleted: ");
			key=s1.nextLine();
			index=searchByName(key);
			if(index>=0)
			{

				System.out.print("\n\n\t_______________________________________\n\n\tLooked element is present in the list\n\t_______________________________________\n\n\t"+internList.get(index));				
				internList.remove(index);

			}
			else 
				System.out.print("\n\tNo intern with this name is present in the list");
			break;

		}



		
	} 

		System.out.print("\n\t1. Continue\n\tPress any other key to exit\n\n");
			doAgain=s.nextInt();
		}while(doAgain==1);
	System.out.print("\n\tExiting.......................\n\n");
}

	public void listIntern()
	{

		System.out.print("\n\t____________InternsList____________\n");
			
		
		System.out.print("\n\t__________________________________\n\n\tName  \t  Address  \t  PhoneNo\n\n\t__________________________________\n\n");
			
		for(Intern intern: internList)

			intern.showInternDetails();
		System.out.print("\n\t____________________________________\n");
	}

	public int searchByName(String name)
	{


		Collections.sort(internList);
		return Collections.binarySearch(internList,new Intern(name,null,null));

	}

	public int searchByAddress(String key)
	{
	
		SortAddress sortAddress=new SortAddress();
		
		Collections.sort(internList,sortAddress);
		return Collections.binarySearch(internList,new Intern(null,key,null),sortAddress);

	}

	public int searchByPhNo(String key)
	{

		SortPhoneNo sortPhoneNo=new SortPhoneNo();
		Collections.sort(internList,sortPhoneNo);
		return Collections.binarySearch(internList,new Intern(null,null,key),sortPhoneNo);

	}

}