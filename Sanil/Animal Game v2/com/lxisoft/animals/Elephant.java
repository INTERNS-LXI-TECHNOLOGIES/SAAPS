package com.lxisoft.animals;

import com.lxisoft.animalgenre.*;
import com.lxisoft.forest.*;


public class Elephant extends Animal implements Herbivore
{


	public Elephant(String name)
	{
		
		super(name,domain);

		int strength=(int)(Math.random()*11);
		while(strength<7)
		{
			strength=(int)(Math.random()*11);
		}

		super.setStrength(strength);

	}
}