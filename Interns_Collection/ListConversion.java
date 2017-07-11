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

       Scanner sc=new Scanner(System.in);

       int ch;
       
       do
       {
       
       System.out.print("\n\t\tSearch intern ...\n\t 1: by name\n\n\t 2: by address \n\n\t 3: by phn_no\t\t\n\n\t\t");
      
        //System.out.print("\n\t\tEnter..\n\t 1: to sort interns by name\n\n\t 2: to sort by address\n\n");
       int choice=s.nextInt();

       AddressSort addressSort=new AddressSort();

       PhnNOSort phnNoSort=new PhnNOSort();

       int index=-1;


       switch(choice)
       {

       		case 1:
       		{

                  System.out.print("\n\t\tEnter the name to be Searched\t:\t");

                  String searchName=sc.nextLine();    

    			Collections.sort(internList);
                  
                  index=Collections.binarySearch(internList,new Intern(searchName,null,null));

    			break;

       		}
       		case 2:
       		{
                        System.out.print("\n\t\tEnter the Address to be Searched\t:\t");

                        String searchAddress=sc.nextLine();    

       			Collections.sort(internList,addressSort);

                        index=Collections.binarySearch(internList,new Intern(null,searchAddress,null),addressSort);

       			break;
       		}

                  case 3:
                         {

                       System.out.print("\n\t\tEnter the phn_no to be Searched\t:\t");

                       String searchPhnNo=sc.nextLine();    

                       Collections.sort(internList,phnNoSort);
                  
                       index=Collections.binarySearch(internList,new Intern(null,null,searchPhnNo),phnNoSort);

                        break;
                       }

                  default:{

                           System.out.println("\n\t\tincorrect choice\t\n");

                           
                          }


             }
                  if(index<0 && choice<=3)
                  {
                      
                      System.out.println("\n\t\tthis intern is not founded in the list\t\n\n\t\t");

                  }
      

                  if(index>=0)

                        {
                            System.out.println("\n\t\tserched element is founded in the list\t\n");

                            System.out.println("\n\t\t"+internList.get(index)+"\t\n");


                        }
                      
                  else 

                      {  

                      System.out.println("\n\t\t____________________________Intern Details_________________________\t\n");
      
                      System.out.print("\t\t\t Name \t\t Address \t\tPhn_No  \t\n");

                      System.out.println("\n\t\t___________________________________________________________________\t\n");

       

                      for(Intern x: internList)

       		         x.printDetails();



                      System.out.println("\n\t\t___________________________________________________________________\t\n");

                     }

            

            System.out.print("\n\t\t Select ur choice ......press 1 or 2 \n\t\t 1. continue \n\t\t 2.exit\n\t\t");
            ch=s.nextInt();
      }while(ch==1);

            System.out.print("\n\t\t exit......................\n\t\t");
      
                     
	}
}