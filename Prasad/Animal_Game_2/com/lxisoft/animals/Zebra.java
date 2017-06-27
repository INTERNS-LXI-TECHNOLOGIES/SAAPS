package com.lxisoft.animals;

import com.lxisoft.forest.*;
import com.lxisoft.animalgener.*;

public class Zebra extends Animal implements Herbivore
{
	

	public Zebra(String name)
	{
		
		super(name,domain);

		int strengthLevelOfZebra=(int)(11*Math.random());

		while(strengthLevelOfZebra>6)

		{
			strengthLevelOfZebra=(int)(11*Math.random());	
		}

       super.setStrengthLevel(strengthLevelOfZebra);
	}


	

}