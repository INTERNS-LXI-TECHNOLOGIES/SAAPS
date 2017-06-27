package com.lxisoft.forest;

import com.lxisoft.animals.*;
import com.lxisoft.animalgener.*;
import java.util.*;

public class Forest
{
	List <Animal> animalList=new ArrayList<Animal>();

	public static int noOfAnimals=10;
	
public Forest()
{

animalList.add(new Lion("Lion"));
animalList.add(new Tiger("Tiger1"));
animalList.add(new Tiger("Tiger1"));
animalList.add(new Elephant("Elephant"));
animalList.add(new Zebra("Zebra1"));
animalList.add(new Zebra("Zebra1"));
animalList.add(new Deer("Deer"));
animalList.add(new Deer("Deer1"));
animalList.add(new Rabbit("Rabbit"));
animalList.add(new Rabbit("Rabbit1"));


}
public void startGame()
{
System.out.println("\n...........................Welcome to Animal_Game.............................");
System.out.println("\n\t............................Animals in the Forest......................\n");

for(int i=0;i<10;i++)
{
	System.out.print(animalList.get(i)+" "+"\n");

}
while(meetAnimal()==true);
}

public boolean meetAnimal()
{
  
   Animal firstAnimalToMeet=animalList.get((int)(Math.random()*3));
   Animal secondAnimal;

   if(firstAnimalToMeet.getLivingStatus()==true)
   {
    System.out.print(firstAnimalToMeet);
   	secondAnimal=findNearestAnimal(firstAnimalToMeet);

   	if(firstAnimalToMeet!=secondAnimal)
   	{
   		if(firstAnimalToMeet instanceof Lion && secondAnimal instanceof Carnivore)
   		{
   			((Lion)firstAnimalToMeet).fight(secondAnimal);
   		}

   		else if(firstAnimalToMeet instanceof Lion && secondAnimal instanceof Herbivore)
   		{
   			((Lion)firstAnimalToMeet).hunt(secondAnimal);
   		}

   		else if(firstAnimalToMeet instanceof Tiger && secondAnimal instanceof Carnivore)
   		{
   			((Tiger)firstAnimalToMeet).fight(secondAnimal);
   		}

   		else
   		{
   			((Tiger)firstAnimalToMeet).hunt(secondAnimal);
   		}
   	}
   	else
   	{
   		firstAnimalToMeet.increaseHungerLevel(1);

   		firstAnimalToMeet.increaseDomainRange();
   	}
   }

   int count=0;

   for(int i=0;i<3;i++)
   {

   	 if((animalList.get(i)).getLivingStatus()==true)
   	 {
   		count++;
   	 }
   }

if(count==0 || noOfAnimals==1)

	return false;
else if(count==noOfAnimals)
{

	for(int i=0;i<3;i++)
	{
		if((animalList.get(i)).getLivingStatus()==true)

			(animalList.get(i)).increaseHungerLevel(1);
	}
	return true;
}
return true;

}

public Animal findNearestAnimal(Animal firstAnimalToMeet)
{
	Animal nearestAnimal=null;

	int minimumDistance=0,distance=0;

	Location carnivoreLocation=firstAnimalToMeet.roam();

	for(Animal secondAnimal:animalList)
	{
		if(secondAnimal.getLivingStatus()==true)
		{
			distance=calculateDistance(carnivoreLocation,secondAnimal.roam());
		

				if(minimumDistance==0)
         		 minimumDistance=distance;
      		if((distance<=firstAnimalToMeet.getDomain()) && (minimumDistance>=distance) && (firstAnimalToMeet!=secondAnimal) )
      		{
      		minimumDistance=distance;
      		nearestAnimal=secondAnimal;
      		}
		}
	}

  if(nearestAnimal==null)

  	return firstAnimalToMeet;
  else

  	return nearestAnimal;

}

public static int calculateDistance(Location carnivoreLocation,Location secondAnimalLocation)
{
	return (int)Math.sqrt(((carnivoreLocation.getXCordinate()-secondAnimalLocation.getXCordinate())*(carnivoreLocation.getXCordinate()-secondAnimalLocation.getXCordinate()))+((carnivoreLocation.getYCordinate()-secondAnimalLocation.getYCordinate())*(carnivoreLocation.getYCordinate()-secondAnimalLocation.getYCordinate())));
}

public static void updateNoOfAnimals()
{
	noOfAnimals--;
}

public void displayWinner()
{

	System.out.println("\n\n\n\t\t______________GAME OVER..!_____________\n\n");
		 
			
		
		for (int i=0;i<animalList.size() ;i++ ) 
		{
			
			if((animalList.get(i)).getLivingStatus()==true && noOfAnimals==1 )
			{
				System.out.println("\n\n\t\t"+(animalList.get(i))+" wins the game....!\n\n");
			}

      /*else if((animalList.get(i)).getLivingStatus()==true && noOfAnimals==1 && (animalList.get(i)) instanceof Herbivore)
      {
        System.out.println("\n\n\t\t"+"only "+(animalList.get(i))+" remains in the forest..!!\n\n");
      }
*/

			else if((animalList.get(i)).getLivingStatus()==true)
			{
				System.out.print("\n\n\t\t"+(animalList.get(i))+"  ");
			}

			else if(i==9)
				System.out.print("\n\n");
		}

        if (noOfAnimals!=1 && noOfAnimals!=0)

        	System.out.print("\n\n\t\t\t Unfortunately..no single winner is there..!\n\n\t\tThese animals are still remain in the forest \n\n\t\t");
        
        else if(noOfAnimals==0)
        	
        	System.out.println("\n\n\t\t\t......there is no animals left in the forest......");
	}
			

}


