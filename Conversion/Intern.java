import java.util.*;
public class Intern implements Comparable<Intern>
{
	private String name,place;
	private int phoneNum;
	public Intern(String name,String place,int phoneNum)
	{
		this.name=name;
		this.place=place;
		this.phoneNum=phoneNum;
	}

	public String toString()
	{
		return name;
	}

	public int compareTo(Intern secondIntern)
	{
		return name.compareTo(secondIntern.getName());
	}

	public String getName()
	{
		return name;
	}
	public String getPlace()
	{
		return place;
	}
	public void printDetails()
	{
		System.out.print("Name : "+name+"\tPlace : "+place+"\tPhoneNum : "+phoneNum+"\n");
	}
	
}