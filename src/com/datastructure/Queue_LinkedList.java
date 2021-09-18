package com.datastructure;

public class Queue_LinkedList<T extends Comparable<T>> {

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
	public void enQueue(final T data) {
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
	 * method to find size of the Queue if queue has one element this method prints
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
			System.out.println("Size of Queue is " + size);
		}
	}

}
