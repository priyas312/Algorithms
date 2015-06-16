package com.standardAlgosOfLinkList;

public class DoubleLinkList<T> extends LinkList<T>{

private DLLNode head = null;
	
	public DLLNode getHead() {
		return head;
	}

	@Override
	public void insert(T t) {
		DLLNode node  = head;
		DLLNode newNode = null;
		if (node == null){
			head = createNode(t);
		}else{
			while (node.nextPtr != null)
				node = node.nextPtr;
			newNode = createNode(t);
			node.nextPtr = newNode;
			newNode.prevPtr = node;
		}		
	}

	@Override
	public void remove(T t) {
		DLLNode node = head;
		boolean found = false;
		if (node == null){
			System.out.println("Link List is empty");
		}else if (node.value == t){ // removing from First place
			head = node.nextPtr;
			node = null;
		}else{
			while (node.nextPtr != null){
				if (node.value != t)
					node = node.nextPtr;
				else{
					found = true;
					break;
				}
			}
			if (found){
				node.prevPtr.nextPtr = node.nextPtr; // removing from middle
				node = null;				
			}else {
				if (node.value == t){
					node.prevPtr.nextPtr = null;    // removing from last position
					node = null;
				}
				else
					System.out.println("element not found to delete " + t);
			}
		}
	}

	@Override
	public void printLinkList() {
		DLLNode node  = head;
		while (node.nextPtr != null){
			System.out.print("" + node.value + " ");
			node = node.nextPtr;
		}
		System.out.print("" + node.value + " ");
		System.out.println("");
	}

	private DLLNode createNode(T t) {
		DLLNode node = new DLLNode();
		node.value = t;
		node.nextPtr = null;
		node.prevPtr = null;
		return node;
	}
	
	class DLLNode{
		T value;
		DLLNode nextPtr;
		DLLNode prevPtr;
	}
}
