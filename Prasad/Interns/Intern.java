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
       return this.name.compareTo(intern1.name);
    }

    public String getName()
    {
        return this.name;
    }


   public String getAddress()
   {
   	return this.address;
   }

   public String getPhNo()
   {
   	return this.ph_no;
   }
	public void printDetails()
	{
	
	System.out.println(" \t\t\t"+this.name+"\t\t"+this.address+"\t\t"+this.ph_no+"  ");
	
		 
	}
} 