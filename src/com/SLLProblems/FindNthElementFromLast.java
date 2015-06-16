package com.SLLProblems;


import java.util.Scanner;

import com.standardAlgosOfLinkList.SingleLinkList;
import com.standardAlgosOfLinkList.SingleLinkList.SLLNode;

public class FindNthElementFromLast {

	static SingleLinkList<Integer> list ;
	
	public static void main(String[] args) {
		createList();
		int n = readInput();
		System.out.println(""  + n + " element value is " + getNthElement(n));
		
	}

	/*
	 * Create two pointers and set it to head 
	 * First move only first pointer and when first pointer moves n node 
	 * then start moving second pointer 
	 * when first pointer will finish then second pointer will be at the nth node from last
	 */
	@SuppressWarnings("rawtypes")
	private static Object getNthElement(int n) {
		SLLNode firstPointer = list.getHead();
		SLLNode secondPointer = firstPointer;
		int nodeCount = 0 ;
		boolean flag = false;
		while (firstPointer.getNextPtr() != null){
			nodeCount++;
			if (nodeCount == n)
				flag = true;
			if(flag)
				secondPointer = secondPointer.getNextPtr();
			firstPointer = firstPointer.getNextPtr();
		}
		return secondPointer.getValue();
	}

	private static int readInput() {
		System.out.print ("enter value of n : " );
		Scanner scanIn = new Scanner(System.in);
	    int n = scanIn.nextInt();
	    scanIn.close();
	    return n;
	}

	private static void createList() {
		list = new SingleLinkList<>();
		Integer[] values ={3,3,1,7,8,9,12}; 
		list.insert(values);
		list.printLinkList();
	}
}
