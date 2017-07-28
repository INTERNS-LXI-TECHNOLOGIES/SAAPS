package com.lxisoft.controller;

import java.util.*;
import com.lxisoft.model.*;

public class AddressSorter implements Comparator<Contact>
{
  public int compare(Contact contact1,Contact contact2)	
  {
     
     return contact1.getAddress().compareTo(contact2.getAddress());

  }
}