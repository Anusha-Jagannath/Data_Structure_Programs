package com.hash;

import java.util.ArrayList;

public class LinkedHashMap<K, V> {

	private final int numBuckets;
	ArrayList<MyLinkedList<K>> arrayList;

	public LinkedHashMap() {
		this.numBuckets = 10;
		this.arrayList = new ArrayList<>();
		for (int i = 0; i < numBuckets; i++) {
			this.arrayList.add(null);
		}
	}

	/*
	 * method which takes key and returns value
	 * 
	 * @param Key
	 * 
	 * @return value
	 */
	public V get(K key) {
		int index = this.getBucketNumber(key);
		MyLinkedList<K> mylinkedlist = this.arrayList.get(index);
		if (mylinkedlist == null)
			return null;
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) mylinkedlist.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	/*
	 * method to implement hash function to find index value
	 * 
	 * @param key makes sure hashcode is positive integer
	 */
	private int getBucketNumber(K key) {

		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % 11;
		return index;
	}

	public void add(K key, V value) {
		int index = this.getBucketNumber(key);
		MyLinkedList<K> mylinkedlist = this.arrayList.get(index);
		if (mylinkedlist == null) {
			mylinkedlist = new MyLinkedList<>();
			this.arrayList.set(index, mylinkedlist);
		}

		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) mylinkedlist.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			mylinkedlist.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}
    
	@Override
	public String toString() {
		return "LinkedHashMap List{" +arrayList+'}';
	}
}
