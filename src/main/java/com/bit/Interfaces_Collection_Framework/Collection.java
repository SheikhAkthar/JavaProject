package com.bit.Interfaces_Collection_Framework;

import java.util.Iterator;

public interface Collection extends Iterable{
	
	
	 // Operations are Basic
    int size();
    
    boolean isEmpty();
    
    boolean equals(Object o);
    
    int hashCode();
    
    boolean contains(Object element);
    
    boolean add(Object element);    // Optional
    
    boolean remove(Object element); // Optional
    
    Iterator iterator();

    //Operations are Bulk
    boolean containsAll(Collection c);
    
    boolean addAll(Collection c);    // Optional
    
    boolean removeAll(Collection c); // Optional
    
    boolean retainAll(Collection c); // Optional
    
    void clear();                    // Optional        

    //  Operations are Arrays
    Object[] toArray();
    
    Object[] toArray(Object a[]);

}
