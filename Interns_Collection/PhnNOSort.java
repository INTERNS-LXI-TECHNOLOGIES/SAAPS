import java.util.*;

public class PhnNOSort implements Comparator<Intern>
{
	
	public int compare(Intern intern1,Intern intern2)
	{
		return intern1.getPhnNo().compareTo(intern2.getPhnNo());
	}
}