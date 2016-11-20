package com.bit.Interfaces_Map;

import com.bit.Interfaces_Collection_Framework.NavigableSet;
import com.google.inject.Key;

@SuppressWarnings("rawtypes")
public interface NavigableMap<K,V> extends SortedMap {
	
	Map.Entry<K,V>	ceilingEntry(K key);
	
	K ceilingKey(K key);
	
	@SuppressWarnings("rawtypes")
	
	Map.Entry<K,V> lowerEntry(Key key);
	
	K lowerKey(K key);
	
	Map.Entry<K,V> floorEntry(K key);
	
	K floorKey(K key);
	
	Map.Entry<K,V> higherEntry(K key);
	
	K higherKey(K key);
	
	Map.Entry<K,V> firstEntry();
	
	Map.Entry<K,V> lastEntry();
	
	Map.Entry<K,V> pollFirstEntry();
	
	Map.Entry<K,V> pollLastEntry();
	
	NavigableMap<K,V> descendingMap();
	
	NavigableSet<K> navigableKeySet();
	
	NavigableSet<K> descendingKeySet();
	
	NavigableMap<K,V> subMap(K fromKey,boolean fromInclusive, K toKey,boolean toInclusive);
	
	NavigableMap<K,V> headMap(K toKey, boolean inclusive);
	
	NavigableMap<K,V> tailMap(K fromKey, boolean inclusive);
	
	SortedMap<K,V> subMap(Object fromKey, Object toKey);
	
	SortedMap<K,V> headMap(Object end);
	
	SortedMap<K,V> tailMap(Object fromKey);
}
