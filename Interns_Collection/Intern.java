public class Intern implements Comparable<Intern>
{
	private String internName,internAddress,internPhnNo;

	public Intern(String name,String address,String phn_No)
	{
		this.internName=name;
		this.internAddress=address;
		this.internPhnNo=phn_No;
	}

	public String toString()
	{

		return this.internName+"\t"+this.internAddress+"\t"+this.internPhnNo;
	}

	public int compareTo(Intern intern2)
	{

		return this.internName.compareTo(intern2.getName());
	}

	public void printDetails()
	{
		System.out.print("\t\t\t"+this.internName+"\t\t"+this.internAddress+"\t\t"+this.internPhnNo+"\t\n");

	}

	public String getName()
	{
		return this.internName;
	}

	public String getAddress()
	{
		return internAddress;
	}
	public String getPhnNo()
	{
		return internPhnNo;
	}

}