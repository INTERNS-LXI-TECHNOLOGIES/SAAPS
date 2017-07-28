package com.lxisoft.controller;

import com.lxisoft.model.*;


import java.util.*;

public class PhnNoSorter implements Comparator<Contact>
{
	
	public int compare(Contact contact1,Contact contact2)
	{
		return contact1.getPhnNo().compareTo(contact1.getPhnNo());
	}
}