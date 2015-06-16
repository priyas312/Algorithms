package com.standardAlgosOfLinkList;


public class SingleLinkList<T> extends LinkList<T>{

	private SLLNode head = null;
	
	public SLLNode getHead() {
		return head;
	}

	@Override
	public void insert(T t) {
		SLLNode node  = head;
		if (node == null){
			head = createNode(t);
		}else{
			while (node.nextPtr != null)
				node = node.nextPtr;
			node.nextPtr = createNode(t);
		}		
	}

	@Override
	public void remove(T t) {
		SLLNode node = head;
		SLLNode prevNode = null; boolean found = false;
		if (node == null){
			System.out.println("Link List is empty");
		}else if (node.value == t){ // removing from First place
			head = node.nextPtr;
			node = null;
		}else{
			while (node != null){
				if (node.value != t){
					prevNode = node;
					node = node.nextPtr;
				}else{
					found = true;
					break;
				}
			}
			if (found){
				if (node == null){
					node = prevNode.nextPtr;
					prevNode.nextPtr = null; // removing from last position
					node = null;
				}else{
					prevNode.nextPtr = node.nextPtr; // removing from middle
					node = null;
				}
			}else
				System.out.println("element not found to delete " + t);
		}
	}

	@Override
	public void printLinkList() {
		SLLNode node  = head;
		while (node.nextPtr != null){
			System.out.print("" + node.value + " ");
			node = node.nextPtr;
		}
		System.out.print("" + node.value + " ");
		System.out.println("");
	}

	private SLLNode createNode(T t) {
		SLLNode node = new SLLNode();
		node.value = t;
		node.nextPtr = null;
		return node;
	}	
	
	public class SLLNode{
		private T value;
		
		private SLLNode nextPtr;
		public SLLNode getNextPtr() {
			return nextPtr;
		}
		public T getValue() {
			return value;
		}
	}
}


