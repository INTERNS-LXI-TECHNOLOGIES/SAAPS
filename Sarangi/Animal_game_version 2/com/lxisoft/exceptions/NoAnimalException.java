
package com.lxisoft.exceptions;

public class NoAnimalException extends RuntimeException
{
	public void showDetails()
	{
		System.out.println("\n\n\t\t\tunfortunately... no animal is there......game ends without a winner.....\n\n\t");
	}

}
