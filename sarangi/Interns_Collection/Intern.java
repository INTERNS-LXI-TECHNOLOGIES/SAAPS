public class Intern
{
	private String internName,internAddress,internPhnNo;

	public Intern(String name,String address,String phn_No)
	{
		this.internName=name;
		this.internAddress=address;
		this.internPhnNo=phn_No;
	}

	public void printDetails()
	{
		System.out.print("\t\t\t"+this.internName+"\t\t"+this.internAddress+"\t\t"+this.internPhnNo+"\t\n");

	}

}