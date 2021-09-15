package com.datastructure;

import java.util.Scanner;
/*
 * checks whether given string is palindrome or not
 */
public class PalindromeChecker {
	public void checkpalindrome(String text) {
		Stack stack = new Stack();
	
		char arr[] = text.toCharArray();
		for (char ch : arr) {
			stack.push(ch);
		}
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str = str + stack.pop();
		}
		if (text.equals(str)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palidrome");
		}
	}
}
