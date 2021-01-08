/* Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
*
* @arthur saravana*/
package lab2exercise;

import java.util.Arrays;

public class Exercise3 {

	public static void main(String[] args) {
		int array[] = { 10, 33, 32, 19, 25, 98, 75, 45 };
		getSorted(array);
	}

	public static void getSorted(int array[]) {
		StringBuilder sb;
		int array1[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			String str = String.valueOf(array[i]);
			// array[i].toString();
			sb = new StringBuilder(str);

			// System.out.println(" " + sb.reverse());
			array1[i] = Integer.parseInt(sb.reverse().toString());

			// System.out.println(" "+)
		}
		// rrays.sort(arr, array1.reverseOrder());
		Arrays.sort( array1);
		for (int i = 0; i <array1.length; i++) {
			System.out.println(array1[i]);
		}

	}

}
