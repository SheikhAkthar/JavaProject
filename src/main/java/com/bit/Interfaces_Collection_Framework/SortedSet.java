package com.bit.Interfaces_Collection_Framework;

import java.util.Comparator;

public interface SortedSet extends Set{
	
	Comparator comparator( );
	
	Object first( );
	
	SortedSet headSet(Object end);
	
	Object last( );
	
	SortedSet subSet(Object start, Object end);
	
	SortedSet tailSet(Object start);

}
