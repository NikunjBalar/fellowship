package com.bridgelabs.algorithmPrograms;

import com.bridgelabs.utility.Utility;

/**
 * Purpose: To sort a String using insertion sort
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class InsertionSort {
	public static void main(String[] args) {
		try {
			System.out.println("Enter String Line");
			String line = Utility.stringInput(); 
			String []s=Utility.insertionSort(line); //return sorted String Array
			for (String str : s) // printing array
				System.out.println(str);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
