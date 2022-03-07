package com;

import java.util.*;

import java.io.*;
import java.util.LinkedList;

//an Ordered Linked List having Numbers in ascending order. 
public class OrderedList {
	@SuppressWarnings({ "static-access", "resource" })
	public static void main(String[] args) throws IOException {
		java.util.LinkedList<Integer> l = new LinkedList<Integer>();
		FileReader fr = new FileReader("N:/Git/RFPTrainingDay16-17/DataStructurePrograms/abc3.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		String s = "";
		while ((str = br.readLine()) != null) {
			s += str;
		}
		System.out.println(s);
		br.close();

		String[] arr = s.split("");// to split the string array
		int[] arr2 = new int[arr.length];

		// for converting any String type in file to integer type
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}

		System.out.println(Arrays.toString(arr2));// string representation of array
		l.bubbleSort(arr2);// to arrange the data in ascending order

		for (int i : arr2) // for adding the element to the linkedList
		{
			l.insert(i);
		}
		System.out.println();
//		l.display();
		System.out.println();
		Scanner newn = new Scanner(System.in);
		System.out.println("Provide a number ");
		int num = newn.nextInt();
		boolean bool = l.search(num);
		// l.display();
		if (bool) {
			l.remove(num);
		} else {
			l.serially(num);
		}
		l.display();
	}
}
