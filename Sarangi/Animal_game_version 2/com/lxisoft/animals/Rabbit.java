package com.lxisoft.animals;

import com.lxisoft.animalgenre.*;




public class Rabbit extends Animal implements herbiviours
{


	public Rabbit(String name)
	{

		super(name,domain);

		int strengthLevelOfRabbit=(int)(11*Math.random());

		while(strengthLevelOfRabbit>3)
		{
			strengthLevelOfRabbit=(int)(11*Math.random());	
		}

		super.setStrengthLevelOfAnimal(strengthLevelOfRabbit);

	}


	
		
}