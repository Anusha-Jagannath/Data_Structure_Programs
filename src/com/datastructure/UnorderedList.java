package com.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UnorderedList {
	
    LinkedList ds = new LinkedList();
	public void work() throws IOException {
		File file = new File("/Users/anushajs/eclipse-workspace/Yml-training/Data_Structure_Programs/src/data/data.txt");
		  
		  BufferedReader br = new BufferedReader(new FileReader(file));
		  int i = 0;
		  String st;
		  String array[] = new String[100];
		  int length = 0;
		  while ((st = br.readLine()) != null) {
			  array[i++] = st;
			  length++;
		  }
		  
		  for(int j = 0;j < length;j++) {
			  System.out.println(array[j]);
			  ds.add(array[j]);
			  
		  }
		  ds.print();
		  System.out.println("Enter the word to be searched");
		  Scanner scanner = new Scanner(System.in);
		  String word = scanner.nextLine();
		  System.out.println(word);
		  ds.searchList(word);
		  ds.printToFile();
		  
		
	}
}
