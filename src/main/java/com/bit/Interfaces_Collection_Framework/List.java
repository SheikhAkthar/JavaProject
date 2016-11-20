package com.bit.Interfaces_Collection_Framework;

import java.util.ListIterator;

public interface List extends Collection{
	void add(int index, Object obj);
	boolean addAll(int index, Collection c);
	Object get(int index);
	int indexOf(Object obj);
	int lastIndexOf(Object obj);
	ListIterator listIterator( );
	ListIterator listIterator(int index);
	Object remove(int index);
	Object set(int index, Object obj);
	List subList(int start, int end);





}
