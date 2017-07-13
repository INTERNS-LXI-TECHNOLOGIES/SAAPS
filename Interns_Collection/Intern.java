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

	public void setName(String newName)
	{
		this.internName=newName;
	}

	public void setAddress(String newAddress)
	{
		this.internAddress=newAddress;
	}

	public void setPhnNo(String newPhnNo)
	{
		this.internPhnNo=newPhnNo;
	}



	public int compareTo(Intern intern2)
	{

		return this.internName.compareTo(intern2.getName());
	}

	public void printDetails()
	{
		System.out.print("\n\t\t"+this.internName+"\t\t"+this.internAddress+"\t\t"+this.internPhnNo+"\n\t\t");

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