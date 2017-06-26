package com.lxisoft.animals;

import com.lxisoft.animalGenre.*;
import com.lxisoft.forest.*;


public class Rabbit extends Animal implements herbivore
{


	public Rabbit(String name)
	{

		super(name,domain);

		int strength=(int)(Math.random()*11);

		while(strength>3)
		{
			strength=(int)(Math.random()*11);
		}

		super.setStrength(strength);


	}

}