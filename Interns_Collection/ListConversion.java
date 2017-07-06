import java.util.*;

public class ListConversion
{
	public ListConversion()
	{
       
       Intern[] interns=new Intern[10];

       interns[0]=new Intern("sanil","malapurm","56755");
       interns[1]=new Intern("sarangi","guruvayur","44514"); 
       interns[2]=new Intern("prasad","chelakkara","96755");
       interns[3]=new Intern("amiya","palakkad","98765");
       interns[4]=new Intern("abhina","thiruvila","56757");
       interns[5]=new Intern("anjali","malapurm","36756");
       interns[6]=new Intern("sinusha","pattambi","32345");
       interns[7]=new Intern("vishnu","palakkad","56749");
       interns[8]=new Intern("bazil","wayanaaad","45647");
       interns[9]=new Intern("richu","perubilav","21424");

       List<Intern> internList=Arrays.asList(interns);

       Scanner s=new Scanner(System.in);
       System.out.print("\n\tEnter..\n\t 1: to sort interns by name\n\n\t 2: to sort by address\n\n");
       int choice=s.nextInt();
       AddressSort addressSort=new AddressSort();
       switch(choice)
       {

       		case 1:
       		{

    			Collections.sort(internList);
    			break;

       		}
       		case 2:
       		{
       			Collections.sort(internList,addressSort);
       			break;
       		}
       }

       System.out.println("\n\t\t____________________________Intern Details_________________________\t\n");

       System.out.print("\t\t\t Name \t\t Address \t\tPhn_No  \t\n");

       System.out.println("\n\t\t___________________________________________________________________\t\n");

       




       for(Intern x: internList)

       		x.printDetails();

/*       	for(Intern x: internList)
       	
       		System.out.print("\n"+x);*/

       System.out.println("\n\t\t___________________________________________________________________\t\n");



	}
}