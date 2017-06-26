package com.lxisoft.animals;

import com.lxisoft.forest.*;


public abstract class Animal
{

	private String name;
	private int strength,hungerLevel,domain;
	private boolean alive=true;
	protected Location initialLocation;
	
	public Animal(String name,int domain)
	{

		this.name=name;
		hungerLevel=(int)(Math.random()*10);
		initialLocation=new Location((int)(50*Math.random()),(int)(50*Math.random()));
		this.domain=domain;

	}	

	public Location roam()
	{
		Location currentLocation=new Location((int)(Math.random()*50),(int)(Math.random()*50));

		while(Forest.calculateDistance(currentLocation,initialLocation)>this.domain)
		{
			currentLocation=new Location((int)(Math.random()*50),(int)(Math.random()*50));
		}
		return currentLocation;

	}

	public String toString()
	{

		return this.name;

	}

	public boolean equals(Animal animal2)
	{

		if((this.getStrength()==animal2.getStrength()) && (this.getHungerLevel()==animal2.getHungerLevel()) && (this.getDomain()==animal2.getDomain()))
			return true;
		else
			return false;

	}

	public void increaseDomain()
	{
		this.domain+=2;
	}

	public int getDomain()
	{
		return domain;
	}



	public void setStrength(int strength)
	{
		this.strength=strength;
	}

	public int getStrength()
	{

		return strength;
	
	}


	public int getHungerLevel()
	{

		return hungerLevel;
	}


	public void reduceHungerLevel(int changeInHungerLevel)
	{
		if((this.hungerLevel-changeInHungerLevel)<=0)
		{
			this.hungerLevel=0;
		}
		else
			this.hungerLevel=this.hungerLevel-changeInHungerLevel;

	}

	public void increaseHungerLevel(int changeInHungerLevel)
	{

		if((this.hungerLevel+changeInHungerLevel)>10)
		{
			System.out.println("\n\n\tUnfortunately "+this.name+" has died due to starvation\n\n");																													
			makeDie();
			Forest.updateNoOfAnimals();
			
		}
		else
			this.hungerLevel=this.hungerLevel+changeInHungerLevel;
	}

	public void makeDie()
	{
		alive=false;
	}

	public boolean getLivingStatus()
	{
		return alive;
	}

	public Location getLocation()
	{
		return initialLocation;
	}

}