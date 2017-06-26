package com.lxisoft.forest;
import com.lxisoft.animals.*;
import java.util.*;
import com.lxisoft.animalGenre.*;



public class Forest
{
	List <Animal> animalList=new ArrayList<Animal>();
	
	private static int noOfAnimals=10;


	
	public Forest()
	{
		
		animalList.add(new Lion("Lion"));
		animalList.add(new Tiger("Tiger_1"));
		animalList.add(new Tiger("Tiger_2"));
		animalList.add(new Elephant("Elephant_1"));
		animalList.add(new Elephant("Elephant_2"));
		animalList.add(new Deer("Deer_1"));
		animalList.add(new Deer("Deer_2"));
		animalList.add(new Zebra("Zebra_1"));
		animalList.add(new Zebra("Zebra_2"));
		animalList.add(new Rabbit("Rabbit"));


			/*animals[0]=new Lion("Lion");
			animals[1]=new Tiger("Tiger_1");
			animals[2]=new Tiger("Tiger_2");
			animals[3]=new Rabbit("Rabbit");
			animals[4]=new Deer("Deer_1");
			animals[5]=new Deer("Deer_2");
			animals[6]=new Zebra("Zebra_1");
			animals[7]=new Zebra("Zebra_2");
			animals[8]=new Elephant("Elephant_1");
			animals[9]=new Elephant("Elephant_2");*/

	}

	public void startGame()
	{
		
		System.out.print("\n\n\t\t________________________ANIMAL GAME STARTS_______________________\t\n\n\t"+"Animals in the forest: ");
		
		for (int i=0;i<animalList.size();i++) {

			System.out.print(animalList.get(i));
			if(i!=(animalList.size()-1))
				System.out.print(", ");

		}

		System.out.print("\n\t\t_________________________________________________________________\n");
		while(meetAnimal()==true);

	}


	public boolean meetAnimal()
	{	
		
		
		Animal animalCarnivore=animalList.get((int)(Math.random()*3));
		Animal secondAnimal;

		//Location locationOfCarnivore,locationOfSecondAnimal;
		
		if(animalCarnivore.getLivingStatus()==true)
		{
			secondAnimal=findNearestAnimal(animalCarnivore);
			

			if(animalCarnivore!=secondAnimal)
			{
				
				if(animalCarnivore instanceof Lion && secondAnimal instanceof carnivore)
				{

					((Lion)animalCarnivore).fight(secondAnimal);
				}

				else if(animalCarnivore instanceof Lion && secondAnimal instanceof herbivore)
				{

					((Lion)animalCarnivore).fight(secondAnimal);
				}

				else if(animalCarnivore instanceof Tiger && secondAnimal instanceof carnivore)
				{

					((Tiger)animalCarnivore).fight(secondAnimal);

				}
				else
					((Tiger)animalCarnivore).hunt(secondAnimal);

				//System.out.print(animalCarnivore+" meets "+secondAnimal+"  domain: "+animalCarnivore.getDomain()+", "+secondAnimal.getDomain());

			}
			else
			{
				
				animalCarnivore.increaseHungerLevel(1);
				animalCarnivore.increaseDomain();
			}

			
			

		}


			int count=0;

			for (int i=0;i<3;i++ ) 
			{
				
				if((animalList.get(i)).getLivingStatus()==true)

					count++;
			}

			if(count==0 || noOfAnimals==1)
		 			
				return false;

			else if(count==noOfAnimals)

			{
				for (int i=0;i<3 ;i++ ) 
				{
					
					if((animalList.get(i)).getLivingStatus()==true)

						(animalList.get(i)).increaseHungerLevel(1);

				}

				return true;
			}
			else

				return true;
	}


	public Animal findNearestAnimal(Animal animal1)
	{
		Animal nearestAnimal=null;
		int minimumDistance=0,distance=0;
		Location locationOfanimal1=animal1.roam();

		for (Animal animal2:animalList) {

			if(animal2.getLivingStatus()==true)
			{
				distance=calculateDistance(locationOfanimal1,animal2.roam());
				if(minimumDistance==0)
					minimumDistance=distance;

				if((animal1!=animal2) && (distance<=minimumDistance) && (distance<animal1.getDomain()))
				{	
					
					minimumDistance=distance;
					nearestAnimal=animal2;

				}

			}
		}

		if(nearestAnimal==null)
			return animal1;
		else
			return nearestAnimal;
		
	}


	public static int calculateDistance(Location locationOfCarnivore,Location locationOfSecondAnimal)
    {
  	 
  	  return (int)Math.sqrt(((locationOfCarnivore.getXCoordinate()-locationOfSecondAnimal.getXCoordinate())*(locationOfCarnivore.getXCoordinate()-locationOfSecondAnimal.getXCoordinate()))+((locationOfCarnivore.getYCoordinate()-locationOfSecondAnimal.getYCoordinate())*(locationOfCarnivore.getYCoordinate()-locationOfSecondAnimal.getYCoordinate())));

    }

		/*if(animalCarnivore.getLivingStatus()==true && secondAnimal.getLivingStatus()==true)
        {
			if(animalCarnivore instanceof Tiger && secondAnimal instanceof Tiger)	
			{
                
                locationOfCarnivore=((Tiger)animalCarnivore).roam();

				locationOfSecondAnimal=((Tiger)secondAnimal).roam();
				
				if(calculateDistance(locationOfCarnivore,locationOfSecondAnimal)<=((Tiger)animalCarnivore).getDomain())

					((Tiger)animalCarnivore).fight(secondAnimal);

				
			//System.out.print(calculateDistance(locationOfCarnivore,locationOfSecondAnimal));

				//System.out.print("\n\t"+animalCarnivore.getName()+" n "+secondAnimal.getName()+"\n\n");

			}

			else if(animalCarnivore instanceof Lion && secondAnimal instanceof Tiger)	
			{
                
              locationOfCarnivore=((Lion)animalCarnivore).roam();

				locationOfSecondAnimal=((Tiger)secondAnimal).roam();
				
				if(calculateDistance(locationOfCarnivore,locationOfSecondAnimal)<=((Lion)animalCarnivore).getDomain())

					((Lion)animalCarnivore).fight(secondAnimal);
				//System.out.print("\n\t"+"lion n tiger\n\n");
				//System.out.print("\n\t"+animalCarnivore.getName()+" n "+secondAnimal.getName()+"\n\n");

			}

			else if(animalCarnivore instanceof Tiger && secondAnimal instanceof Lion)	
			{
                
                locationOfCarnivore=((Tiger)animalCarnivore).roam();

				locationOfSecondAnimal=((Lion)secondAnimal).roam();
				
				if(calculateDistance(locationOfCarnivore,locationOfSecondAnimal)<=((Tiger)animalCarnivore).getDomain())

				((Tiger)animalCarnivore).fight(secondAnimal);
				//System.out.print("\n\t"+"Tiger n lion\n\n");
				//System.out.print("\n\t"+animalCarnivore.getName()+" n "+secondAnimal.getName()+"\n\n");

			}


			else if(animalCarnivore instanceof Lion && secondAnimal instanceof herbivore)
			{
              
                locationOfCarnivore=((Lion)animalCarnivore).roam();

				locationOfSecondAnimal=secondAnimal.getLocation();
				
				if(calculateDistance(locationOfCarnivore,locationOfSecondAnimal)<=((Lion)animalCarnivore).getDomain())
					((Lion)animalCarnivore).hunt(secondAnimal);
				else
					animalCarnivore.increaseHungerLevel(1);
				//System.out.print("\n\t"+"Tiger n herbivore\n\n");
				//System.out.print("\n\t"+animalCarnivore.getName()+" n "+secondAnimal.getName()+"\n\n");

            }
            else
            {
                locationOfCarnivore=((Tiger)animalCarnivore).roam();

				locationOfSecondAnimal=secondAnimal.getLocation();
				
				if(calculateDistance(locationOfCarnivore,locationOfSecondAnimal)<=((Tiger)animalCarnivore).getDomain())
					
					((Tiger)animalCarnivore).hunt(secondAnimal);

				else

					animalCarnivore.increaseHungerLevel(1);
				//System.out.print("\n\t"+"Tiger n herbivore\n\n");
				//System.out.print("\n\t"+animalCarnivore.getName()+" n "+secondAnimal.getName()+"\n\n");

            }       
            
           
        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
			int count=0;

			for (int i=0;i<3;i++ ) 
			{
				
				if((animalList.get(i)).getLivingStatus()==true)

					count++;
			}

			if(count==0 || noOfAnimals==1)
		 			
				return false;

			else if(count==noOfAnimals)

			{
				for (int i=0;i<3 ;i++ ) 
				{
					
					if((animalList.get(i)).getLivingStatus()==true)

						(animalList.get(i)).increaseHungerLevel(1);

				}

				return true;
			}
			else

				return true;
			
		
	}

    
    public static int calculateDistance(Location locationOfCarnivore,Location locationOfSecondAnimal)
    {
  	  return (int)Math.sqrt(((locationOfCarnivore.getXCoordinate()-locationOfSecondAnimal.getXCoordinate())*(locationOfCarnivore.getXCoordinate()-locationOfSecondAnimal.getXCoordinate()))+((locationOfCarnivore.getYCoordinate()-locationOfSecondAnimal.getYCoordinate())*(locationOfCarnivore.getYCoordinate()-locationOfSecondAnimal.getYCoordinate())));
    }*/


	public void displayWinner()
	{

		System.out.println("\n\n\n\t\t______________GAME OVER..!_____________\n\n");


		 if (noOfAnimals!=1 && noOfAnimals!=0) 
		
			System.out.print("\n\n\t\t\t Unfortunately..no single winner is there..!\n\n\t\tThe animals still remain in the forest are:  ");
		
		for (int i=0;i<10 ;i++ ) 
		{
			
			if((animalList.get(i)).getLivingStatus()==true && noOfAnimals==1)
			
				System.out.println("\n\n\t\t"+animalList.get(i)+" wins the game....!\n\n");
			
			else if((animalList.get(i)).getLivingStatus()== true)
			
				System.out.print(animalList.get(i)+"  ");
			

			if(i==9)
				System.out.print("\n\n");
		}
        
        if(noOfAnimals==0)

        	 System.out.print("\n\n\t\t\tUnfortunately..no animal is there....all animals are died.......");




	}

	public static void updateNoOfAnimals()
	{
		noOfAnimals--;

		//System.out.print("\n\t\t"+noOfAnimals);
	}


}