public class Tdd
{
	public static void main(String[] args)
	{
		Intern[] interns=new Intern[10];


		interns[0] = new Intern("aaa","tcr","123456789");
		interns[1] = new Intern("bbb","wky","135792468");
		interns[2] = new Intern("ccc","knr","987654321");
		interns[3] = new Intern("ddd","kzkd","975318642");
		interns[4] = new Intern("eee","kkr","112233445");
		interns[5] = new Intern("fff","rr","556677889");
		interns[6] = new Intern("ggg","plkd","990011223");
		interns[7] = new Intern("hhh","ktr","123453124");
		interns[8] = new Intern("iii","knr","996688554");
		interns[9] = new Intern("jjj","ttr","999897965");

		System.out.println("\n\t..........................Details of interns are.........................................");

		System.out.println("\n\n\t Name \t Address\tPhone\n\n");

		for(int i=0;i<interns.length;i++)
		{
           interns[i].printDetails();
		}
	}
}