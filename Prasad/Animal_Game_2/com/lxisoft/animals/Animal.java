package com.lxisoft.animals;

import com.lxisoft.forest.*;
import java.util.*;

public abstract class Animal
{
	private String animalName;
	private int strengthLevel,hungerLevel,domain;
	private boolean aLive=true;
    protected Location intialLocation;
  

    public Animal(String animalName,int domain)
    {
     
     	this.animalName=animalName;

     	int hungerLevel=(int)(10*Math.random());

     	intialLocation=new Location((int)(40*Math.random()),(int)(40*Math.random()));

     	this.domain=domain;

    }


    public String toString()
    {
    	return this.animalName;
    }


    public Location roam()

      {

        Location currentLocation=new Location((int)(Math.random()*40),(int)(Math.random()*40)); 

        while(Forest.calculateDistance(currentLocation,intialLocation)>domain)
        {
            currentLocation=new Location((int)(Math.random()*40),(int)(Math.random()*40));
        }

        return currentLocation;


     }



	public int getHungerLevel()

	{
		return hungerLevel;

	}


	public void setStrengthLevel(int strengthLevel)

	{

      this.strengthLevel=strengthLevel;

	}


	public int getStrengthLevel()

	{

      return strengthLevel;
      
	}
    
    



	public void reduceHungerLevel(int changeInhungerLevel)
	{
		if((this.hungerLevel-changeInhungerLevel)<=0)
			this.hungerLevel=0;
		else
			this.hungerLevel=this.hungerLevel-changeInhungerLevel;

	}



	public void increaseHungerLevel(int changeInhungerLevel)
	{

		if((this.hungerLevel+changeInhungerLevel)>=  10)
			{
				/*this.hungerLevelOfAnimal=10;*/
				System.out.println("\n\t unfortunately "+this.animalName +" has died due to starvation\n\n\t");
				makeDie();
				Forest.updateNoOfAnimals();

			}	
		else
			this.hungerLevel=this.hungerLevel+changeInhungerLevel;
	}


	public Location getLocation()
	{
		return intialLocation;

	}
	

    public void makeDie()
	{
		aLive=false;
	}

	public boolean getLivingStatus()
	{
		return aLive;
	}

	public int getDomain()
	{
		return this.domain;
	}

	public void increaseDomainRange()
	{
		this.domain+=2;
	}

	

}