import java.util.*;

public class Intern implements Comparable<Intern>
{
	
	String name,address,phNo;

	public Intern(String name,String address,String phNo)
	{

		this.name=name;
		this.address=address;
		this.phNo=phNo;

	}

	public void showInternDetails()
	{

		System.out.print("\t"+name+"\t  "+address+"\t  "+phNo+"\n\n");

	}

	public int compareTo(Intern secondIntern)
	{
     return this.name.compareTo(secondIntern.getname());
	}

	public String getname()
	{
      return this.name;

	}

    public String getAddress()
	{
      return this.address;

	}

	public String getPhNo()
	{
		return this.phNo;
	}

	public String toString()
	{

		return ("\n\t"+this.name+"\t   "+this.address+"     "+this.phNo+"\n");
	}


}