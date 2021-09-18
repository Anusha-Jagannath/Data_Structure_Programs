package com.datastructure;

import java.util.Arrays;

/*
 * PrimeNumber class prints prime no within 0-1000 
 * checks for anagram prime no
 * prints both anagram and non anagram prime no
 * adds anagram prime number to stack using linked list and reverses the contents and displays
 * adds anagram prime number to queue using linked list and prints the contents of queue
 */
public class PrimeNumber {

	int[][] array = new int[10][100];
	int[][] prime = new int[10][100];
	int anagram[][] = new int[10][100];
	int nonanagram[][] = new int[10][100];
	LinkedList<Integer> list = new LinkedList<Integer>();
	Queue_LinkedList<Integer> queue = new Queue_LinkedList<Integer>();

	/*
	 * method to check whether number is prime or not
	 * 
	 * @param number which needs to be checked whether prime or not
	 * 
	 * @return true if number is prime else return false
	 */
	public boolean findPrime(int number) {

		Boolean isPrime = true;
		for (int j = 2; j < number; j++) {
			if (number % j == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public void compute() {

		// initializing the array with natural numbers
		int temp = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				array[i][j] = temp;
				temp++;
			}
		}
		// initialize prime array
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (findPrime(array[i][j])) {
					prime[i][j] = array[i][j];
				} else
					prime[i][j] = 0;
			}
		}
		// printing prime numbers within the range
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (prime[i][j] != 0) {
					System.out.print(prime[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	/*
	 * method to find 2 strings are anagram or not
	 * 
	 * @param string1 and string2 which needs to be compared
	 * 
	 * @return true if both strings are anagram else returns false
	 */
	public boolean anagram(String string1, String string2) {
		if (string1.length() != string2.length()) {
			return false;
		}
		char[] array1 = string1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = string2.toCharArray();
		Arrays.sort(array2);

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}

	/*
	 * method to check prime no is anagram or not this method calls another method
	 * anagram to find whether prime no are anagram or not
	 */
	public void isAnagram() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (prime[i][j] != 0) {
					for (int k = j + 1; k < 100; k++) {
						if (prime[i][k] != 0 && anagram(String.valueOf(prime[i][j]), String.valueOf(prime[i][k]))) {
							anagram[i][j] = prime[i][j];
							anagram[i][k] = prime[i][k];
						}
					}
				}
			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (prime[i][j] != anagram[i][j]) {
					nonanagram[i][j] = prime[i][j];
				}
			}
		}
	}

	/*
	 * method to print anagrams
	 */
	public void printAnagrams() {
		System.out.println("Anangrams are");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (anagram[i][j] != 0) {
					System.out.print(anagram[i][j] + " ");
					list.add(anagram[i][j]);
					queue.enQueue(anagram[i][j]);
				}
			}
			System.out.println();
		}
	}
	/*
	 * calls linked list method to reverse the list and prints the reversed list
	 */

	public void reverseStack() {
		System.out.println("\nPrinting anagram using stack data structure");
		list.print(); // before reversing
		System.out.println("\nreversing the anagram using stack data structure");
		list.reverse(); // calls reverse method in linked list
		list.print(); // after reversing
		list.size();
		
	}

	/*
	 * method to print anagrams using queue
	 */
	public void printQueue() {
		System.out.println("\nPrinting anagram using queue data structure");
		queue.print();
		queue.size();
	}

	/*
	 * method to print non anagrams
	 */
	public void printnonAnagram() {
		System.out.println("Non Anangrams are");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (nonanagram[i][j] != 0) {
					System.out.print(nonanagram[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
