package com.bit.Interfaces_Map;

import com.bit.Interfaces_Collection_Framework.Collection;
import com.bit.Interfaces_Collection_Framework.Set;

public interface Map<K,V> {
	
	public class Entry<K, V> {

	}

	void clear( );
	
	boolean containsKey(Object k);
	
	boolean containsValue(Object v);
	
	Set entrySet( );
	
	boolean equals(Object obj);

	Object get(Object k);

	int hashCode( );

	boolean isEmpty( );

	Set keySet( );

	Object put(Object k, Object v);

	void putAll(Map m);

	Object remove(Object k);

	int size( );

	Collection values( );

}
