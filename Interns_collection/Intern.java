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


}