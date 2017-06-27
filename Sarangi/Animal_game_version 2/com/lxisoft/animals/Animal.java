package com.lxisoft.animals;

import com.lxisoft.forest.*;

public abstract class Animal
{
	private String animalName;
	private int strengthLevelOfAnimal,hungerLevelOfAnimal,domain;
	private boolean aLive=true;
    protected Location intialLocation;
  

    public Animal(String animalName,int domain)
    {
     
     	this.animalName=animalName;

     	int hungerLevelOfAnimal=(int)(10*Math.random());

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



	public int getHungerLevelOfAnimal()

	{
		return hungerLevelOfAnimal;

	}


	public void setStrengthLevelOfAnimal(int strengthLevelOfAnimal)

	{

      this.strengthLevelOfAnimal=strengthLevelOfAnimal;

	}


	public int getStrengthLevelOfAnimal()

	{

      return strengthLevelOfAnimal;
      
	}
    
    



	public void reduceHungerLevelOfAnimal(int changeInhungerLevelOfAnimal)
	{
		if((this.hungerLevelOfAnimal-changeInhungerLevelOfAnimal)<=0)
			this.hungerLevelOfAnimal=0;
		else
			this.hungerLevelOfAnimal=this.hungerLevelOfAnimal-changeInhungerLevelOfAnimal;

	}



	public void increaseHungerLevelOfAnimal(int changeInhungerLevelOfAnimal)
	{

		if((this.hungerLevelOfAnimal+changeInhungerLevelOfAnimal)>=  10)
			{
				/*this.hungerLevelOfAnimal=10;*/
				System.out.println("\n\n\t\t\t\tunfortunately\t"+this.animalName+"\thas died due to starvation\n\n\t");
				makeDie();
				Forest.updateNumOfAnimals();

			}	
		else
			this.hungerLevelOfAnimal=this.hungerLevelOfAnimal+changeInhungerLevelOfAnimal;
	}

	public boolean equals(Animal secondAnimal)
	{
       if((this.getStrengthLevelOfAnimal()==secondAnimal.getStrengthLevelOfAnimal()) && (this.getHungerLevelOfAnimal()==secondAnimal.getHungerLevelOfAnimal()) && (this.getDomain()==secondAnimal.getDomain()))
           return true;
        else
            return false;
	}


	public Location getLocation()
	{
		return intialLocation;

	}
	

    public void makeDie()
	{
		aLive=false;
	}

	public boolean getALive()
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