package com.standardAlgosOfLinkList;


public abstract class LinkList<T> {
	
	abstract public void printLinkList();
	
	abstract public void insert(T t);
	
	public void insert(T[] list) {
		for (T t : list)
			insert(t);
	}
	
	abstract public void remove (T t);
	
}
