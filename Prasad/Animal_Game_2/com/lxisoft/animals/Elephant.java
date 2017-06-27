package com.lxisoft.animals;

import com.lxisoft.forest.*;
import com.lxisoft.animalgener.*;

public class Elephant extends Animal implements Herbivore
{


	public Elephant(String name)
	{
		super(name,domain);

		int strengthLevelOfElephant=(int)(11*Math.random());

		while(strengthLevelOfElephant<7)
		{

			strengthLevelOfElephant=(int)(11*Math.random());

		}

		super.setStrengthLevel(strengthLevelOfElephant);


	}
	
	
}