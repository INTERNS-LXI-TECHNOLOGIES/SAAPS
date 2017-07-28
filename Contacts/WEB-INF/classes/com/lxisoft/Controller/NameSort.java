package com.lxisoft.Controller;

import com.lxisoft.Model.*;
//import com.lxisoft.View.*;
import java.util.*;
class NameSort implements Comparator<Contact>
{
	public int compare(Contact one,Contact two)
	{
		return one.getName().compareTo(two.getName());
	}
}