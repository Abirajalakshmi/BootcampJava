package com.java.algo;

public class BubbleSort {

	public static int[] sortArray(int[] inArray) {

		for (int x = 1; x < inArray.length-1; x++) // a.length = # of indices in
													// the array
		{
			for (int y = 0; y < inArray.length-1; y++) {
				if (inArray[y] > inArray[y+1]) {
					
					int temValue = inArray[y];
					inArray[y] = inArray[y+1];
					inArray[y+1] = temValue;
				}
			}
		}
		return inArray;
	}

	public static void main(String[] args) {

		int[] intArray = { 20, 10, 6, 18, 45 };
		int[] resArray = sortArray(intArray);

		for (int i : resArray)
			System.out.println(i);
	}

}
