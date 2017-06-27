package com.lxisoft.animals;

import com.lxisoft.animalgenre.*;




public class Elephant extends Animal implements herbiviours
{


	public Elephant(String name)
	{
		super(name,domain);

		int strengthLevelOfElephant=(int)(11*Math.random());

		while(strengthLevelOfElephant<7)
		{

			strengthLevelOfElephant=(int)(11*Math.random());

		}

		super.setStrengthLevelOfAnimal(strengthLevelOfElephant);


	}
	
	
}