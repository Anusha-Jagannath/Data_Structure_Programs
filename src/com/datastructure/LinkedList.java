package com.datastructure;

import java.io.IOException;

public class LinkedList<T extends Comparable<T>> {

	private Node head;

	public class Node {
		T data;
		Node next;

		public Node(T data) {
			this.data = data;
		}
	}

	public void add(final T data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void print() {
		Node temp = head;
		System.out.println("LinkedList:");
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}

	/*
	 * method to search key in Linked list
	 * 
	 * @param key
	 */
	public void searchList(T key) {
		if (head == null) {
			System.out.println("Search not possible..list is empty");
		} else {
			Node temp = head;
			Node prev = temp;
			int pos = 1;
			while (temp != null) {
				if (temp.data.equals(key)) {
					System.out.println("Key found at position " + pos);
					prev.next = temp.next;
					return;
				}
				prev = temp;
				temp = temp.next;
				pos = pos + 1;
			}
			System.out.println("key not found");
			add(key);

		}
	}

	public void printToFile() {
		Node temp = head;
		System.out.println("LinkedList:");
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;

		}
	}

}
