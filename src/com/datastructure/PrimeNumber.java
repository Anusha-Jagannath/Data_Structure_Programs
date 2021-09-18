package com.datastructure;

public class PrimeNumber {
/*
 * method to check whether number is prime or not
 * @param number which needs to be checked whether prime or not
 * @return true if number is prime
 * else return false
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
		int[][] array = new int[10][100];
		int[][] prime = new int[10][100];
		// initializing the array with natural numbers
		int temp = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				array[i][j] = temp;
				temp++;
			}
		}
		//initialize prime array
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (findPrime(array[i][j])) {
					prime[i][j] = array[i][j];
				} else
					prime[i][j] = 0;
			}
		}
		//printing prime numbers within the range
		for(int i=0;i<10;i++) {
			for(int j=0;j<100;j++) {
				if(prime[i][j]!=0) {
					System.out.print(prime[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
