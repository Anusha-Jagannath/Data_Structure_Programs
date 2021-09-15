package com.datastructure;
/*
 * queue implementation using array
 */
public class Queue {

	int queue[] = new int[100];
	int front;
	int rear = -1;
	int size;

	/*
	 * inserting element to rear
	 */
	public void enqueue(int data) {
		queue[++rear] = data;
		size++;
	}

	/*
	 * removing element from front
	 */
	public int dequeue() {
		int a = queue[front];
		front++;
		size--;
		return a;

	}

	public int getFront() {
		return queue[front];
	}
}
