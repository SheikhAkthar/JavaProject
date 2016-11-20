package com.bit.Interfaces_Map;

import java.util.Comparator;

public interface SortedMap<K,V> extends Map {
	
	@SuppressWarnings("rawtypes")
	
	Comparator comparator( );
	
	Object firstKey( );
	
	@SuppressWarnings("rawtypes")
	
	SortedMap headMap(Object end);
	
	Object lastKey( );
	
	@SuppressWarnings("rawtypes")
	
	SortedMap subMap(Object start, Object end);
	
	@SuppressWarnings("rawtypes")
	
	SortedMap tailMap(Object start);



}
