package com.hash;

public class MyLinkedList<K> {

	public INode<K> head;
	public INode<K> tail;
	
	public MyLinkedList()
	{
		this.head = null;
		this.tail = null;
	}
	
	/*
	 * This method adds new element to linked list.
	 * @param newNode the value of the element of new node
	 * The 'if..else' condition helps in checking the number of elements in a list and sets the head.	
	 */
	public void add(INode<K> newNode)
	{
		if(this.tail == null)
			this.tail= newNode;
		if(this.head == null)
			this.head = newNode;
		else
			{
			  INode<K> tempNode = this.head;
			  this.head = newNode;
			  this.head.setNext(tempNode);
			}
	}
	
	/*
	 * The method append, appends a new element to the linked list
	 * @param newNode the value of the  of new node
	 */
	public void append(INode<K> newNode) 
	{
		if(this.head == null) 
		{
			this.head = newNode;
		}
		if(this.tail == null) 
		{
			this.tail = newNode;
		} 
		else 
		{
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	/*
	 * The method insert helps to insert a new node after the required node
	 * @param myNode node after which new node should be inserted
	 * @param newNode new node created
	 * @param tempNode is used as a temporary variable to store the next value
	 */
	public void insert(INode<K> myNode,INode<K> newNode) 
	{
		INode<K> tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	/*
	 * pop is a method which deletes the first element in the linked list.
	 * @returns the new head
	 */
	public INode<K> pop()
	{
		INode<K> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	
	/*
	 * popLast is used to delete element from the end of linked list
	 * @param currentNode is pointing to head and previousNode is null
	 * @returns the element deleted
	 */
	public INode<K> popLast() 
	{
		INode<K> currentNode = head;
		INode<K> previousNode = null;
		while(currentNode != null && currentNode.getNext() != null) {
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		previousNode.setNext(null);
		return currentNode;
	}
	
	/*
	 * method to print linkedList
	 * It does not take any parameter
	 * keeps on appending data until temp node link becomes null
	 */
	public void print() {
		StringBuffer buffer = new StringBuffer("LinkedList");
		INode<K> temp = this.head;
		while(temp.getNext() != null) {
			buffer.append(temp.getKey());
			if(!temp.equals(tail)) buffer.append("->");
			temp =temp.getNext();
		}
	}
	
	/*
	 * The method search, searches for an element in the linked list
	 * It takes a @param Key which is the element which has to be searched
	 * @returns the node if element is present
	 * if the element is not present, it returns null 
	 */
	public INode<K> search(K Key) {
		INode<K> tempNode = head;
		while(tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(Key)){
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	
	/*
	 * deleteGivenNode deletes the specified node (40)
	 * first it searches for node then deletes it
	 * Takes the @param Key which element you want to delete
	 * @returns head
	 */
	public INode<K> deleteGivenNode(K Key) 
	{		
		if(head == null || head.getNext() == null) {
			return null;
		}
		INode<K> currentNode = head;
		INode<K> prevNode = null;
		
		while(currentNode != null && currentNode.getKey() != Key)
		{
			prevNode = currentNode;
			currentNode = currentNode.getNext();
		}
		prevNode.setNext(currentNode.getNext());
		return head;
	}
	
	/*
	 * sizeofLinkedList counts the number of elements in the list
	 * @param head takes the head of linked list sent by the user
	 * @returns integer value - number of nodes
	 */
	public int sizeofLinkedList(INode<K> head) {
		INode<K> tempNode = head;
		if(tempNode == null)
			return 0;
		if(tempNode.getNext() == null)
			return 1;
		int count = 0;
		while(tempNode != null && tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
			count++;
		}
		return count+1;	
	}

	/*
	 * The method printMyNodes prints the nodes of linked list.
	 */
	public String printMyNodes()
	{
		return "My nodes: " + head;
	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + ", tail=" + tail + "]";
	}
	
}
