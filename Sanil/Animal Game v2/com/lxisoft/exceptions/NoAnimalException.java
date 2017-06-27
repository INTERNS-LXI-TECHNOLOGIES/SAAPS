package com.lxisoft.exceptions;

public class NoAnimalException extends RuntimeException
{

	public void showDetails()
	{

		System.out.println("Unfortunately game ends without a winner..\n\n");
		
	}

}  