import java.util.*;

public class SortPhoneNo implements Comparator<Intern> 
{
	
	public int compare(Intern intern1,Intern intern2)
	{

		return intern1.getPhNo().compareTo(intern2.getPhNo());
	}

}