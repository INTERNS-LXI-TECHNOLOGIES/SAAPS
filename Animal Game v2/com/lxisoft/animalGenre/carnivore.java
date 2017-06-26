package com.lxisoft.animalGenre;

import com.lxisoft.forest.*;
import com.lxisoft.animals.*;

public interface carnivore
{
	//int domain=15;
	//public abstract Location roam();
	public abstract void fight(Animal animal);
	public abstract void hunt(Animal animal);
	//public abstract int getDomain();
}