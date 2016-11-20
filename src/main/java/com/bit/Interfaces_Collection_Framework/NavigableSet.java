package com.bit.Interfaces_Collection_Framework;

public interface NavigableSet<E> extends SortedSet{
	
	E lower(E e);
	
	E floor(E e);
	
	E ceiling(E e);
	
	E higher(E e);
	
	E pollFirst();
	
	E pollLast();
	
	NavigableSet<E> descendingSet();
	
	java.util.Iterator<E> descendingIterator();
	
	NavigableSet<E> subSet(E fromElement, boolean fromInclusive,E toElement, boolean toInclusive);
	
	NavigableSet<E> headSet(E toElement, boolean inclusive);
	
	NavigableSet<E> tailSet(E fromElement, boolean inclusive);

}
