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
		
		
	}

}
