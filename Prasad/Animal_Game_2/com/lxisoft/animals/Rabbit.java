package com.lxisoft.animals;

import com.lxisoft.forest.*;
import com.lxisoft.animalgener.*;

public class Rabbit extends Animal implements Herbivore
{


	public Rabbit(String name)
	{

		super(name,domain);

		int strengthLevelOfRabbit=(int)(11*Math.random());

		while(strengthLevelOfRabbit>3)
		{
			strengthLevelOfRabbit=(int)(11*Math.random());	
		}

		super.setStrengthLevel(strengthLevelOfRabbit);

	}


	
		
}