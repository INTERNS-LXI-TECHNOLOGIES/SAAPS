import java.util.*;

public class SortByName implements Comparable<Intern>
{
public int compareTo(Intern intern1)
{
  return this.name.compareTo(intern1.name);
}
}