package com.lxisoft.Controller;

//import com.lxisoft.View.*;
import com.lxisoft.Model.*;
import java.util.*;

class AddressSort implements Comparator<Contact>
{
	public int compare(Contact one,Contact two)
	{
		return one.getPlace().compareTo(two.getPlace());
	}
}