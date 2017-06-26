package com.lxisoft.animals;

import com.lxisoft.animalGenre.*;
import com.lxisoft.forest.*;



public class Lion extends Animal implements carnivore
{
	
	public Lion(String name)
	{
	

		super(name,20);

		int strength=(int)(Math.random()*11);
		
		while(strength<7)
		{
			strength=(int)(Math.random()*11);
		}

		super.setStrength(strength);

		
	}


	public void hunt(Animal animal)
	{

		System.out.print("\n\n\t"+this+" meets "+animal+"\n");

		if(this.getHungerLevel() > 5)
		{
			if(this.getStrength() >= animal.getStrength())
			{
				if((int)Math.random()*6!=5)
				{

				System.out.println("\t"+this+" kills the other");
				this.reduceHungerLevel(animal.getStrength());
				animal.makeDie();
				Forest.updateNoOfAnimals();
				}
				else
				{

					System.out.println("\n\t"+animal+" is lucky as it escapes from "+this);
					this.increaseHungerLevel(1);

				}

			}


			else
			{

				System.out.println("\t"+animal+" defeats the "+this);
				this.makeDie();
				Forest.updateNoOfAnimals();


			}
			
		}

		else
		{

			System.out.println("\t"+this+" is not so hungry and leaves the other ");
			this.increaseHungerLevel(1);

		}
	} 

	public void fight(Animal animal)
	{
		Animal strongestAnimal;

		System.out.print("\n\n\t"+this+" meets "+animal);

		if(this.getStrength() > animal.getStrength())
			strongestAnimal=this;

		else if(this.getStrength() == animal.getStrength())
		{

			if(this.getHungerLevel() > animal.getHungerLevel())
				strongestAnimal= animal;
			else if((this.getHungerLevel() == animal.getHungerLevel()) && ((int)(Math.random()*2)==0))
				strongestAnimal =	this;
			else if((this.getHungerLevel() == animal.getHungerLevel()) && ((int)(Math.random()*2)==1))
				strongestAnimal =animal;
			else
				strongestAnimal= this;
		}

		else
			strongestAnimal = animal;

		System.out.print(" and starts fighting...\n\t"+strongestAnimal);
		if (this!=strongestAnimal) 
		{
			if((int)Math.random()*6!=5)
			{
				
				System.out.print(" wins...!");
				animal.increaseHungerLevel((int)(this.getStrength()/2));
				this.makeDie();
				Forest.updateNoOfAnimals();

			}
			else
			{

				System.out.print(" does not win..!\n\t"+this+" is lucky and escapes from the stronger animal");
				animal.increaseHungerLevel((int)(this.getStrength()/3));
				this.increaseHungerLevel((int)(animal.getStrength()/3));				


			}

		}
		else
		{
			if((int)Math.random()*6!=5)
			{
				
				System.out.print(" wins...!");
				this.increaseHungerLevel((int)(animal.getStrength()/2));
				animal.makeDie();
				Forest.updateNoOfAnimals();

			}
			else
			{

				System.out.print(" does not win..!\n\t"+this+" is lucky and escapes from the stronger animal");
				animal.increaseHungerLevel((int)(this.getStrength()/3));
				this.increaseHungerLevel((int)(animal.getStrength()/3));

			}

		}



		
	}

}