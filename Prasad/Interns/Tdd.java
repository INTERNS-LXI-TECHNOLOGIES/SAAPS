import java.util.*;
public class Tdd
{
	public static void main(String[] args)
	{
		Intern[] interns=new Intern[10];


		interns[0] = new Intern("Zak","London","123456789");
		interns[1] = new Intern("Sam","Italy","135792468");
		interns[2] = new Intern("Philip","Us","987654321");
		interns[3] = new Intern("James","Spain","975318642");
		interns[4] = new Intern("Prasad","India","112233445");
		interns[5] = new Intern("Rose","NewYork","556677889");
		interns[6] = new Intern("Dayana","Paris","990011223");
		interns[7] = new Intern("Jack","Austria","123453124");
		interns[8] = new Intern("Kareena","Newland","996688554");
		interns[9] = new Intern("Teena","England","999897965");


SortByAddress address = new SortByAddress();
		

/*
		for(int i=0;i<interns.length;i++)
		{
			System.out.print(sList.get(i)+"\n");
		}*/

		System.out.println("\n\t..........................Details of interns are.........................................");

		System.out.println("\n\n\t Name \t\tAddress\t\tPhone\n\n");

		for(int i=0;i<interns.length;i++)
		{
           interns[i].printDetails();

           /*Arrays.sort(interns[i].sortByName());*/
		}



		List <Intern> internList = Arrays.asList(interns);
          	
	

		System.out.println("\n\t...............Array converted To List............................... \n");

		for(Intern details: internList)

			System.out.print("\n\t"+ details );

		System.out.println("\n"); 

             /*details.sortByName();*/

        Collections.sort(internList);

		System.out.println("\n\t..........Sorted by Name using Comparable.............................\n");

		for(Intern details : internList)

		System.out.println("\n\t"+details);
		

     Collections.sort(internList,address);

     System.out.print("\n\n\t...........Sorted by Address using Comarator..............................\n");

     for(Intern details : internList)

     	System.out.println("\n\t"+details);


	}
}