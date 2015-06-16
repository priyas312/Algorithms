package com.main;

import com.standardAlgosOfLinkList.DoubleLinkList;
import com.standardAlgosOfLinkList.LinkList;
import com.standardAlgosOfLinkList.SingleLinkList;

public class StandardAlgoMain {
	
	public static void main(String[] args) {
		System.out.println("single link list test");
		testSLL();
		System.out.println("double link list test");
		testDLL();
	}

	public static void testSLL(){
		LinkList<Integer> list = new SingleLinkList<>();
		Integer [] listOfValues = {5,7,89,5,4,6,12};
		list.insert(listOfValues);
		list.printLinkList();
		list.remove(5);
		list.remove(10);
		list.remove(1);
		list.remove(8);
		list.printLinkList();
	}
	
	public static void testDLL(){
		LinkList<Integer> list = new DoubleLinkList<>();
		Integer [] listOfValues = {5,4,1,11,10,40};
		list.insert(listOfValues);
		list.printLinkList();
		list.remove(5);
		list.remove(10);
		list.remove(1);
		list.remove(8);
		list.printLinkList();
	}
}
