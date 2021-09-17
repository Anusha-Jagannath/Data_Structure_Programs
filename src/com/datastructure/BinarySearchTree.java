package com.datastructure;

public class BinarySearchTree {
/*
 * method to find no of possible binary search trees
 * @param noOfNodes in a binary search tree
 */
	public void findNoOfBST(int noOfNodes) {

		int array[] = new int[noOfNodes+1];
		array[0] = 1;
		array[1] = 1;
		for(int i = 2;i<=noOfNodes;i++) {
			int left = 0;
			int right = i-1;
			while(left <= i-1) {
				array[i] += array[left]*array[right];
				left++;
				right--;
			}
		}
		System.out.println("No of possible binary search trees "+array[noOfNodes]);
	}
}
