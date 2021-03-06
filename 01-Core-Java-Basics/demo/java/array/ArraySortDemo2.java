package demo.java.array;

import java.util.Arrays;

public class ArraySortDemo2 {

	public static void main(String[] args) {

		byte[] byteArray = { 5, 2, 7, 3, 9 };

		/*
		 * Sorts the specified range of the array into ascending order. The range to be
		 * sorted extends from the index fromIndex, inclusive, to the index toIndex,
		 * exclusive. If fromIndex == toIndex, the range to be sorted is empty.
		 * 
		 * Parameters:
		 * 
		 * a - the array to be sorted
		 * 
		 * fromIndex - the index of the first element, inclusive, to be sorted
		 * 
		 * toIndex - the index of the last element, exclusive, to be sorted
		 * 
		 */
		Arrays.sort(byteArray, 2, 5);

		System.out.println("The sorted int array is:");
		int i = 0;
		for (byte number : byteArray) {
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}

	}

}
