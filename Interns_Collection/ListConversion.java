import java.util.*;

public class ListConversion
{

      List<Intern> internList;

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

           internList=new ArrayList<Intern>(Arrays.asList(interns));

           Scanner s=new Scanner(System.in);

           Scanner sc=new Scanner(System.in);

           int ch;

           do
           {

               System.out.print("\n\n\t\tselect ur choice ..\n\t\t______________________________________________________________________\n\t\t");

               System.out.print("\n\t\t 1: edit intern \n\n\t\t 2: Add intern \n\n\t\t 3: remove interns \n\n\t\t 4: Search interns \n\t\t______________________________________________________________________\n\n\t\t");

               int choice=s.nextInt();



               int index=-1;

               
               switch(choice)
               {

                  case 1:
                          {
                           
                           System.out.print("\n\t\tenter the name of intern to be edited\t:\t");
                           
                            String edittName=sc.nextLine();

                            index=searchByName(edittName);

                            if(index>=0)
                            {
 
                              (internList.get(index)).printDetails();

                              System.out.print("\n\t\tSelect ur choice...\n\t 1: by name\n\n\t 2: by address \n\n\t 3: by phn_no\t\t\n\n\t\t");

                              int choice1=s.nextInt();

                                 switch(choice1)

                                 {
                               
                                   case 1:{

                                            System.out.print("\n\t\tEnter the new name to be edited\t:\t");

                                            String editName=sc.nextLine();    

                                            (internList.get(index)).setName(editName);

                                            System.out.println("\n\n\t\tnew contact has been updated sucessfully updated with new name\t"+(internList.get(index)).getName());
                                            
                                            (internList.get(index)).printDetails();

                                             break;


                                          }  
                               
                                   case 2:{
                                              System.out.print("\n\t\tEnter the new Address to be edited\t:\t");

                                              String editAddress=sc.nextLine();    

                                              (internList.get(index)).setAddress(editAddress);

                                              System.out.println("\n\n\t\tnew contact has been updated sucessfully updated with new address\t"+(internList.get(index)).getAddress());
                                            
                                              (internList.get(index)).printDetails();

                                             
                                              break;

                                          }
                                   case 3:{
                                             System.out.print("\n\t\tEnter the new phnNo to be edited\t:\t");

                                              String editPhnNo=sc.nextLine();    

                                              (internList.get(index)).setPhnNo(editPhnNo);

                                              System.out.println("\n\t\tnew contact has been updated sucessfully updated with new name\t"+(internList.get(index)).getPhnNo());
                                            
                                              (internList.get(index)).printDetails();
                                            
                                              break;



                                          }
                                  default:{
                                           System.out.println("\n\t\tincorrect choice\t\n");

                                          }
      

                              }



                            }
                            
                            else
                            {
                              System.out.print("\n\t\tSorry.....this intern is not present in the list\t\n\n\t");
                            }
                            break;

                            }

                           /*System.out.print("\n\t\t Select ur choice ......press 1 or 2 \n\t\t 1. continue \n\t\t 2.exit\n\t\t");

                            ch=s.nextInt();

                          }while(ch==1);

                          System.out.print("\n\t\t exit......................\n\t\t");
*/                                         
                  case 2:{

                           System.out.println("\n\t\tenter the details of new intern to be added\t\n\n");

                           System.out.print("\n\t\tenter the name\t:\t");

                           String newname=sc.nextLine();

                           System.out.print("\n\t\tenter the Address\t:\t");

                           String newAddress=sc.nextLine();

                           System.out.print("\n\t\tenter the phn_no\t:\t");
                           
                           String newPhnNo=sc.nextLine();


                           internList.add(new Intern(newname,newAddress,newPhnNo));

                           System.out.println("\n\t\tThis intern has been added from the list\t\n\n");
                           
                           showInterns();


                           break;
                           
                         }
                  
                  case 3:
                           {

                           System.out.print("\n\t\tEnter the name to be Deleted\t:\t");

                            String deleteName=sc.nextLine();    

                            index=searchByName(deleteName);

                            (internList.get(index)).printDetails();

                             internList.remove(index);
                           
                            System.out.println("\t\t\nThis intern has been removed from the list\t\n\n");
                            
                            showInterns();

                             break;

                         }






                 case 4: 
                         {

                             System.out.print("\n\t\tSearch intern ...\n\t 1: by name\n\n\t 2: by address \n\n\t 3: by phn_no\t\t\n\n\t\t");

                               int choice4=s.nextInt();


                               switch(choice4)
                               {

                                 case 1:
                                 {
                                       System.out.print("\n\t\tEnter the name to be Searched\t:\t");

                                       String searchName=sc.nextLine();    

                                       index=searchByName(searchName);

                                       break;

                                 }
                                 case 2:

                                 {

                                   System.out.print("\n\t\tEnter the Address to be Searched\t:\t");

                                   String searchAddress=sc.nextLine();    

                                   index=searchByAddress(searchAddress);

                                   break;

                             }

                             case 3:
                             {

                                 System.out.print("\n\t\tEnter the phn_no to be Searched\t:\t");

                                 String searchPhnNo=sc.nextLine();    

                                 index=searchByPhnNo(searchPhnNo);

                                 break;

                           }

                           default:{

                                 System.out.println("\n\t\tincorrect choice\t\n");


                           }


                     }


                     if(index<0 && choice4<=3)

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

                     showInterns();
       
                    }

                    break;

             }

      }

       System.out.print("\n\t\t Select ur choice ......press 1 or 2 \n\t\t 1. continue \n\t\t 2.exit\n\t\t");

       ch=s.nextInt();

 }while(ch==1);

 System.out.print("\n\t\t exit......................\n\t\t");

}          


public void showInterns()
{
      System.out.println("\n\t\t____________________________Intern Details_________________________\t\n");
      
      System.out.print("\t\t\t Name \t\t Address \t\tPhn_No  \t\n");

      System.out.println("\n\t\t___________________________________________________________________\t\n");



      for(Intern x: internList)

         x.printDetails();                                



   System.out.println("\n\t\t___________________________________________________________________\t\n");

} 

public int searchByName(String searchName)
{

     
     Collections.sort(internList);

     return Collections.binarySearch(internList,new Intern(searchName,null,null));

} 

public int searchByAddress(String searchAddress)
{

    AddressSort addressSort=new AddressSort();

    Collections.sort(internList,addressSort);

    return Collections.binarySearch(internList,new Intern(null,searchAddress,null),addressSort);

} 

public int searchByPhnNo(String searchPhnNo)
{
 
      PhnNOSort phnNoSort=new PhnNOSort();

     
     Collections.sort(internList,phnNoSort);

     return Collections.binarySearch(internList,new Intern(null,null,searchPhnNo),phnNoSort);


}

}

