import java.util.*;

public class Intern implements Comparable<Intern>
{
	private String name;
	private String address;
	private String ph_no;

	public Intern(String name,String address,String ph_no)
	{
		this.name=name;
		this.address=address;
		this.ph_no=ph_no;

	
	}

	public String toString()
	{
		return this.name + "\t\t" + this.address + "\t\t" + this.ph_no ;
 	}

    public int compareTo(Intern intern1)
    {
       return this.name.compareTo(intern1.getName());
    }

    public String getName()
    {
        return this.name;
    }


   public String getAddress()
   {
   	return this.address;
   }

	public void printDetails()
	{
	
	System.out.println(" \t"+this.name+"\t\t"+this.address+"\t\t"+this.ph_no+"  ");
	
		 
	}
/*
	public void sortByName()
	{
		for(int i=0;i<10;i++)
		{
			Arrays.sort(this.name);
		}
		
	} */
} 