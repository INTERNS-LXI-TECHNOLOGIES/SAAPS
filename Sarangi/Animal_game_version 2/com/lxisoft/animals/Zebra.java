package com.lxisoft.animals;
import com.lxisoft.animalgenre.*;



public class Zebra extends Animal implements herbiviours
{
	

	public Zebra(String name)
	{
		
		super(name,domain);

		int strengthLevelOfZebra=(int)(11*Math.random());

		while(strengthLevelOfZebra>6)

		{
			strengthLevelOfZebra=(int)(11*Math.random());	
		}

       super.setStrengthLevelOfAnimal(strengthLevelOfZebra);
	}


	

}