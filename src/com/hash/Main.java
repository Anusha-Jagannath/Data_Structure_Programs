package com.hash;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 * Main class reads the numbers from the file
 * creates a key value pair for the numbers
 * finally searches the number efficiently
 * if the number is present then that node is deleted
 * else the number is pushed to the map
 */
public class Main {

	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> hashMap = new HashMap<>();
		File file = new File(
				"/Users/anushajs/eclipse-workspace/Yml-training/Data_Structure_Programs/src/data/number.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		String arr[] = new String[10];
		int length = 0;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
			arr[length++] = st;
		}
		for (int i = 0; i < length; i++) {
			System.out.println(arr[i]);
			Integer value = hashMap.get(arr[i]);
			if (value != null) {
				value += 1;
			} else {
				value = 1;
			}
			hashMap.add(arr[i], value);
		}
		System.out.println(hashMap);
		hashMap.deleteWord("5", 1);
		System.out.println(hashMap);

	}

}
