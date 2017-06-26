
package com.lxisoft.animals;

import com.lxisoft.animalGenre.*;
import com.lxisoft.forest.*;


public class Deer extends Animal implements herbivore
{

	public Deer(String name)
	{
		
		super(name,domain);

		int	strength=(int)(Math.random()*11);
		while(strength>5)
		{
			strength=(int)(Math.random()*11);
		}

		super.setStrength(strength);
	}
}