package com.bit.Classes_Collection_FrameWork;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedSet;

import org.apache.tools.ant.types.selectors.modifiedselector.ModifiedSelector.ComparatorName;

import com.bit.Interfaces_Collection_Framework.List;
import com.bit.Interfaces_Collection_Framework.Queue;
import com.bit.Interfaces_Collection_Framework.Set;

public class MyCollectionsClass extends Collections implements Comparable,SortedSet,NavigableSet,Map {
	
	public void m(){
		
	ArrayList al = new ArrayList();
	Collections.sort(al);
	
	}
	
	public int compareTo(Object o) {

		return 0;
	}

	public int size() {

		return 0;
	}

	public boolean isEmpty() {

		return false;
	}

	public boolean contains(Object o) {

		return false;
	}

	public Iterator iterator() {

		return null;
	}

	public Object[] toArray() {

		return null;
	}

	public Object[] toArray(Object[] a) {

		return null;
	}

	public boolean add(Object e) {

		return false;
	}

	public boolean remove(Object o) {

		return false;
	}

	public boolean containsAll(Collection c) {

		return false;
	}

	public boolean addAll(Collection c) {

		return false;
	}

	public boolean retainAll(Collection c) {

		return false;
	}

	public boolean removeAll(Collection c) {

		return false;
	}

	public void clear() {

		
	}

	public Comparator comparator() {

		return null;
	}

	public SortedSet subSet(Object fromElement, Object toElement) {

		return null;
	}

	public SortedSet headSet(Object toElement) {

		return null;
	}

	public SortedSet tailSet(Object fromElement) {

		return null;
	}

	public Object first() {

		return null;
	}

	public Object last() {

		return null;
	}

	public Object lower(Object e) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object floor(Object e) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object ceiling(Object e) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object higher(Object e) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object pollFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object pollLast() {
		// TODO Auto-generated method stub
		return null;
	}

	public NavigableSet descendingSet() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterator descendingIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public NavigableSet subSet(Object fromElement, boolean fromInclusive, Object toElement, boolean toInclusive) {
		// TODO Auto-generated method stub
		return null;
	}

	public NavigableSet headSet(Object toElement, boolean inclusive) {
		// TODO Auto-generated method stub
		return null;
	}

	public NavigableSet tailSet(Object fromElement, boolean inclusive) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object remove1(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	public void putAll(Map m) {
		// TODO Auto-generated method stub
		
	}

	public java.util.Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

	public java.util.Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
