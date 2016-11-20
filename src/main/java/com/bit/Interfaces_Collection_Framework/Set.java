package com.bit.Interfaces_Collection_Framework;

import java.util.Iterator;

public interface Set extends Collection{
	
	 boolean add( );
	 
	 void clear(); 
	 
	 Iterator iterator();
	 
	 boolean remove(Object element);
	 
	 boolean contains(Object element);
	  
	 int size();
	    
	 boolean isEmpty();

}
