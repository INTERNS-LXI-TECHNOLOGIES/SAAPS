import java.util.*;

public class SortAddress implements Comparator<Intern>
{
  public int compare(Intern intern1,Intern intern2)	
  {
     
     return intern1.getAddress().compareTo(intern2.getAddress());

  }
}