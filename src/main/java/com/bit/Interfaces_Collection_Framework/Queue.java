package com.bit.Interfaces_Collection_Framework;

public interface Queue<E> extends Collection{
	
	 	E element();
	 	
	    boolean offer(E e);
	    
	    E peek();
	    
	    E poll();
	    
	    E remove();

}
