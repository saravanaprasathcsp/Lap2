/*Create a method which accepts an array of integer elements and return the second smallest element in the array
*
* @arthur saravana*/

package lab2exercise;

import java.util.Arrays;

public class Exercise1 {

	public static void main(String[] args) {
		int[] array;
		array=new int[5];
		array[0]=13;
		array[1]=18;
		array[2]=2;
		array[3]=10;
		array[4]=8;
		System.out.println(getSecoundSmallest(array));
				

	}
	public static int getSecoundSmallest(int[] array)
	{
	     Arrays.sort(array);
	     return array[1];
	}

}
