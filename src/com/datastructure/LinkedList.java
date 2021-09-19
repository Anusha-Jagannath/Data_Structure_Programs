package com.datastructure;

import java.io.IOException;

import com.datastructure.Queue_LinkedList.Node;

public class LinkedList<T extends Comparable<T>> {

	private Node head;

	public class Node {
		T data;
		Node next;

		public Node(T data) {
			this.data = data;
		}
	}

	/*
	 * method to insert data at end of the list
	 * 
	 * @param data to be inserted at end of the list
	 */
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

	/*
	 * method to display linked list contents
	 */
	public void print() {
		Node temp = head;
		System.out.println("\nLinkedList:");
		while (temp.next != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);
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

	/*
	 * method to reverse the linked list this method maintains 3 nodes i.e prevNode,
	 * curNode, nextNode to reverse the links while traversing the linked list
	 */
	public void reverse() {
		Node prevNode = null;
		Node curNode;
		Node nextNode;
		nextNode = head;
		curNode = head;
		while (nextNode != null) {
			nextNode = nextNode.next;
			curNode.next = prevNode;
			prevNode = curNode;
			curNode = nextNode;
		}
		head = prevNode;
	}

	/*
	 * method to print the linked list
	 */
	public void printToFile() {
		Node temp = head;
		System.out.println("LinkedList:");
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;

		}
	}

	/*
	 * method to find size of the Stack if stack has one element this method prints
	 * size as 1 else traverses till list is empty and increments size
	 */
	public void size() {
		int size = 0;
		Node temp = head;
		if (head.next == null) {
			size = 1;
		} else {
			while (temp != null) {
				temp = temp.next;
				size++;
			}
			System.out.println("Size of Stack is " + size);
		}
	}

	/*
	 * method to insert data to queue
	 * 
	 * @param data, here data is inserted at rear end
	 */
	public boolean enQueue(final T data) {
		boolean isAdded = false;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			isAdded = true;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			isAdded = true;
		}
		return isAdded;
	}

	/*
	 * method to delete data from the beginning in queue here data is deleted from
	 * front end
	 */

	public void deQueue() {
		Node temp = head;
		if (head == null) {
			System.out.println("Queue is empty");
			return;
		} else if (head.next == null) {
			temp = null;

		} else {
			head = head.next;
			temp = null;
		}
	}

	/*
	 * method to display queue contents
	 */
	public void printQueue() {
		Node temp = head;
		System.out.println("\nQueue elements are");
		while (temp.next != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	/*
	 * method to check whether stack is empty or not
	 */
	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	/*
	 * method to return top element from the stack
	 */
	public Object peek() {
		Node temp = head;
		if (head == null)
			return head;
		else {
			while (temp.next != null) {
				temp = temp.next;
			}
		}
		return temp.data;
	}

	/*
	 * method to pop top element in the stack
	 */
	public void pop() {
		Node temp = head;
		Node cur = temp;
		if (head == null) {
			System.out.println("Stack is empty");
			return;
		} else if (head.next == null) {
			temp = null;
			System.out.println("Deleted " + head.data);

		} else {
			while (temp.next != null) {
				cur = temp;
				temp = temp.next;
			}
			System.out.println("Deleted " + temp.data);
			cur.next = null;
		}
	}

	public void push(Object object) {

	}

	public void showStackWithoutSpace() {

	}

	public String get() {
		return null;
	}

}
