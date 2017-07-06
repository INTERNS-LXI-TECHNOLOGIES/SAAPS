 import java.util.*;
 public class Conversion
 {
 	private Intern[] intern=new Intern[7];
 	public Conversion()
 	{
 		intern[0] = new Intern("Amiya","Palakkad",92453452);
 		intern[1] = new Intern("Abhina","Thiruvilamala",92696897);
 		intern[2] = new Intern("Anjali","Pattambi",92450002);
 		intern[3] = new Intern("Sarangi","Guruvayur",92455752);
 		intern[4] = new Intern("Sanil","Malapuram",92303450);
 		intern[5] = new Intern("Prasad","Chelakara",92453451);
 		intern[6] = new Intern("Vishnu","Nemmara",92450450);

 		List<Intern> arrayList=Arrays.asList(intern);

 		SortComparator sc=new SortComparator();

 		Scanner s=new Scanner(System.in);

 		System.out.println("\nSelect choice \n\t 1: Sort by name \n\t 2.sort by address\n\t ");
 		int ch=s.nextInt();
 		switch(ch)
 		{
          case 1:{

                   Collections.sort(arrayList);
                   break;
 		
                 }
         case 2:{
                  Collections.sort(arrayList,sc);
                  break;

                }




 		}
 		for(Intern x:arrayList)
 		{
 			x.printDetails();
 		}
 	}
 }