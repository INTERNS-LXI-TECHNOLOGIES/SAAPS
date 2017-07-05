public class Intern
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
}