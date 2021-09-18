package com.hash;

public class HashMap <K,V>{
	MyLinkedList<K> myLinkedList;
	
	public HashMap() {
		myLinkedList = new MyLinkedList();
	}
	
	public V get(K key)
	{
		MyMapNode<K, V> myMapNode=(MyMapNode<K,V>) this.myLinkedList.search(key);
		return (myMapNode==null)?null:myMapNode.getValue();
	}
	
	public void add(K key,V value)
	{
		MyMapNode<K,V> myMapNode=(MyMapNode<K,V>) this.myLinkedList.search(key);
		if(myMapNode == null)
		{
			myMapNode = new MyMapNode<>(key,value);
			this.myLinkedList.append(myMapNode);
		}
		else
		{
			myMapNode.setValue(value);
		}
	}
	/*
	 * method to delete the given word in the sentence
	 * @param key and value
	 * checks whether word is found or not
	 * if found then calls pop method in myLinkedList
	 * else doesnot pop the word
	 */
	public void deleteWord(K key,V value)
	{
		System.out.println(key);
		MyMapNode<K,V> myMapNode=(MyMapNode<K,V>)this.myLinkedList.search(key);
		System.out.println(myMapNode);
		if(myMapNode!=null)
		{
			myMapNode=new MyMapNode<>(key,value);
			this.myLinkedList.pop();
			System.out.println("Deleted successfully");
		}
		else
		{
			System.out.println("Word not found.");
			
		}
	}
	
	
	
	@Override
	public String toString() {
		return "MyHashNodes {" + myLinkedList.printMyNodes() + "}";
	}	
}

