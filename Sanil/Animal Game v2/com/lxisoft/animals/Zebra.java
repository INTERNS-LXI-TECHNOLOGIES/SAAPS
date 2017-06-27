package com.lxisoft.animals;

import com.lxisoft.animalgenre.*;
import com.lxisoft.forest.*;

public class Zebra extends Animal implements Herbivore
{

	private int strength;

	public Zebra(String name)
	{

		super(name,domain);

		int strength=(int)(Math.random()*11);

		while(strength>6)
		{
			strength=(int)(Math.random()*11);
		}

		super.setStrength(strength);

	}
}