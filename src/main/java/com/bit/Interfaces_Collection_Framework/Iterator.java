package com.bit.Interfaces_Collection_Framework;

public interface Iterator {
	 boolean hasNext();
	    Object next();
	    void remove();
	    
	   /* 
	    how to use an Iterator to filter a Collection, 
	    static void filter(Collection c) {
	        for (Iterator i = c.iterator(); i.hasNext(); )
	            if (!cond(i.next()))
	                i.remove();
	    }*/


}
