package com.datastructure;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to data structure problems");

		UnorderedList list = new UnorderedList();
		list.work();

		OrderedList orderlist = new OrderedList();
		orderlist.work();

		String expr1 = "(5+9)*(9+8)";
		String expr2 = "((9+3)";
		BalancedParentheses balanced = new BalancedParentheses();
		balanced.isBalanced(expr1);
		balanced.isBalanced(expr2);

		Scanner sc = new Scanner(System.in);
		System.out.println("Palindrome Checker");
		System.out.println("enter the word ");
		String text = sc.nextLine();
		PalindromeChecker checker = new PalindromeChecker();
		checker.checkpalindrome(text);

		BinarySearchTree tree = new BinarySearchTree();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of testcases");
		int testCases = scanner.nextInt();
		System.out.println("Enter no of nodes");
		int noOfNodes[] = new int[testCases];
		for (int i = 0; i < testCases; i++) {
			noOfNodes[i] = scanner.nextInt();
		}
		for (int i = 0; i < testCases; i++) {
			tree.findNoOfBST(noOfNodes[i]);
		}

		PrimeNumber primeno = new PrimeNumber();
		primeno.compute();
		primeno.isAnagram();
		primeno.printAnagrams();
		primeno.printnonAnagram();
		System.out.println("Reversed linked list contents are");
		primeno.reverseStack();
		primeno.printQueue();

	}
}
