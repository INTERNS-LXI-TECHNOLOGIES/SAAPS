package com.lxisoft.animals;

import com.lxisoft.forest.*;
import com.lxisoft.animalgener.*;



public class Deer extends Animal implements Herbivore
{
	

    public Deer(String name)
	{
		 super(name,domain);

        int strengthLevelOfDeer=(int)(11*Math.random());

        while(strengthLevelOfDeer>5)
        {
        	strengthLevelOfDeer=(int)(11*Math.random());

        }

        super.setStrengthLevel(strengthLevelOfDeer);
        
     }

}    