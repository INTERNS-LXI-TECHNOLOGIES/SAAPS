package com.lxisoft.forest;

import com.lxisoft.animals.*;

import com.lxisoft.animalgenre.*;

import com.lxisoft.exceptions.*;

import java.util.*;



	
public class Forest
{
	List <Animal> animalList=new ArrayList<Animal>();

     public static int noOfAnimals=10;

	public Forest()
	{

		animalList.add(new Lion("LION"));

		animalList.add(new Tiger("TIGER 1"));
		animalList.add(new Tiger("TIGER 2"));

		animalList.add(new Rabbit("RABBIT "));

		animalList.add(new Deer("DEER 1"));
		animalList.add(new Deer("DEER 2"));

		animalList.add(new Zebra("ZEEBRA 1"));
		animalList.add(new Zebra("ZEEBRA 2"));

		animalList.add(new Elephant("ELEPHANT 1"));
		animalList.add(new Elephant("ELEPHANT 2"));


	}
	

   public void startGame()
	{
		System.out.print("\n\n\t\t________________________________________|ANIMAL GAME STARTS|_________________________________________\t\n\n\t"+"\n\n\t\tThese Animals in the forest..........,\n\n\n\t\t");
		
		for (int i=0;i<animalList.size();i++ )
		 {
			
			System.out.print(animalList.get(i));

			if(i!=animalList.size()-1)

				System.out.print(" , ");

		 }

		System.out.println("\n\n\n\t\t______________________________________________________________________________________________________\n\n\t\t"); 

		while(meetAnimal()==true);
	}
 
	public boolean meetAnimal()
	{

		Animal firstAnimalCarnivore=animalList.get((int)(Math.random()*3));

		Animal secondAnimal;

		if(firstAnimalCarnivore.getALive()==true)
		{
			secondAnimal=findNearestAnimal(firstAnimalCarnivore);

			if(firstAnimalCarnivore.equals(secondAnimal)==false)
			{
               // System.out.print("\n\n\n\t\t-->\t"+firstAnimalCarnivore+"\t meet\t"+secondAnimal+"\n\n\n\t\t\t\tDomain :"+firstAnimalCarnivore.getDomain()+","+secondAnimal.getDomain()+"\n");

				if(firstAnimalCarnivore instanceof Lion && secondAnimal instanceof carniviours)

				{

					((Lion)firstAnimalCarnivore).fight(secondAnimal);

				}


				else if(firstAnimalCarnivore instanceof Lion && secondAnimal instanceof herbiviours)

				{

					((Lion)firstAnimalCarnivore).hunt(secondAnimal);

				}

				else if(firstAnimalCarnivore instanceof Tiger && secondAnimal instanceof carniviours)

				{

					((Tiger)firstAnimalCarnivore).fight(secondAnimal);

				}

				else if(firstAnimalCarnivore instanceof Tiger && secondAnimal instanceof herbiviours)

				{

					((Tiger)firstAnimalCarnivore).hunt(secondAnimal);

				}
			}

			else
			{
				firstAnimalCarnivore.increaseHungerLevelOfAnimal(1);

				firstAnimalCarnivore.increaseDomainRange();
			}

		}	
		int count=0;
 
			for (int i=0;i<3 ;i++ ) 
			{
				
				if((animalList.get(i)).getALive()==true)
				{
					count++;
				}
			}

			if(count==0 || noOfAnimals==1)

			     return false;

            else if(count==noOfAnimals)
            {	

				for (int i=0;i<3 ;i++ ) 
			    {
			    	if((animalList.get(i)).getALive()==true)

			    	(animalList.get(i)).increaseHungerLevelOfAnimal(1);	
			    }
						
				return true;
			}
			else
				return true;
		
	}

    public Animal findNearestAnimal(Animal firstAnimalCarnivore)
    {

    	Animal nearestAnimal=null;

    	int minimumDistance=0,distance=0;

    	Location carniviourLocation=firstAnimalCarnivore.roam(); 

    	for(Animal secondAnimal:animalList)
    	{
    		if(secondAnimal.getALive()==true)

    		{

    			distance=calculateDistance(carniviourLocation,secondAnimal.roam());

    			if(minimumDistance==0)
    				minimumDistance=distance;

    			if((distance<=firstAnimalCarnivore.getDomain()) && (minimumDistance>=distance) && ((secondAnimal.equals(firstAnimalCarnivore))==false))
    			{
    				minimumDistance=distance;
    				nearestAnimal=secondAnimal;
    			}

            }
        }    
            if(nearestAnimal==null)

    			return firstAnimalCarnivore;
    	    else

    	       return nearestAnimal;    

    }

    public static int calculateDistance(Location carnivorLocation,Location secondAnimallocation)
	{
		return (int)Math.sqrt(((carnivorLocation.getXCoordinate()-secondAnimallocation.getXCoordinate())*(carnivorLocation.getXCoordinate()-secondAnimallocation.getXCoordinate()))+((carnivorLocation.getYCoordinate()-secondAnimallocation.getYCoordinate())*(carnivorLocation.getYCoordinate()-secondAnimallocation.getYCoordinate())));
	}


    public static void updateNumOfAnimals()
	{

		noOfAnimals--;
		
	}

    public void displayWinner()
	{

		System.out.println("\n\n\n\t\t______________GAME OVER..!_____________\n\n");
		 
			
		
		for (int i=0;i<animalList.size() ;i++ ) 
		{
			
			if((animalList.get(i)).getALive()==true && noOfAnimals==1)
			{
				System.out.println("\n\n\t\t"+(animalList.get(i))+" wins the game....!\n\n");
			}
			else if((animalList.get(i)).getALive()==true)
			{
				System.out.print("\n\n\t\t"+(animalList.get(i))+"  ");
			}

			else if(i==9)
				System.out.print("\n\n");
		}

        if (noOfAnimals!=1 && noOfAnimals!=0)

        	System.out.print("\n\n\t\t\t Unfortunately..no single winner is there..!\n\n\t\tThese animals are still remain in the forest \n\n\t\t");
        
        /*else if(noOfAnimals==0)
        	
        	System.out.println("\n\n\t\t\tUnfortunately..no animal is there......all animals are died......\n\n");*/
        try
        {
        	 if(noOfAnimals==0)

        	 	throw new NoAnimalException();
        }

        catch(NoAnimalException e)
        {
          
          e.showDetails();

          e.printStackTrace();



        }





	}
			

}