package com.bit.Interfaces_Collection_Framework;

import java.util.Spliterator;
import java.util.function.Consumer;

public interface Iterable<T> {
	
	java.util.Iterator<T>  iterator();
	
	Spliterator spliterator();
	
	void forEach(Consumer<? super T> action); // i don't understand this method.i will be talk later about this.
	

}
