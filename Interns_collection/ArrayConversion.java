import java.util.*;


public class ArrayConversion
{
	public ArrayConversion()
	{

       Intern[] interns=new Intern[10];

		SortAddress sortAddress=new SortAddress();
		
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

		System.out.print("\n\tselect ur choice \n\t1 . sort interns by name \n\t 2.sort interns by address \n\t");

		int choice=s.nextInt();

		switch(choice)
		{

         case 1:{

         	    Collections.sort(internList);
                break;
                }
         case 2:{
                 Collections.sort(internList,sortAddress);
                 break;
                }       

		}





	System.out.print("\n\t___________________________________________InternsList______________________________________________\n");
		
	
	System.out.print("\n\t________________________________\n\n\tName  \t  Address  \t  PhoneNo\n\n\t____________________________\n");
		
		
		



		for(Intern intern: internList)

			intern.showInternDetails();

		System.out.print("\n\t________________________________________________________________________________________\n");
	

	}
}