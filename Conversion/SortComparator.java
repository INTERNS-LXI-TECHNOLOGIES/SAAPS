import java.util.*;

class SortComparator implements Comparator<Intern>
{
	public int compare(Intern one,Intern two)
	{
		return one.getPlace().compareTo(two.getPlace());
	}
}