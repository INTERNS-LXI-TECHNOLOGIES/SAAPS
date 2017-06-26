package com.lxisoft.forest;


public class Location
{
	
	private int xCoordinate,yCoordinate;

	public Location(int xCoordinate,int yCoordinate)
	{
		this.xCoordinate=xCoordinate;
		
		this.yCoordinate=yCoordinate;
	}

	public int getXCoordinate()
	{
		return xCoordinate;
	}

	public int getYCoordinate()
	{
		return yCoordinate;
	}
}