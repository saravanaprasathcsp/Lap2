/* Create a method which accepts an integer array and removes all the duplicates in the array. Return the resulting array in descending order
*
* @arthur saravana*/

package lab2exercise;

import java.util.Scanner;
import java.util.TreeSet;

public class Exericse4 {

	public static void main(String[] args) {
		TreeSet<Integer> array=new TreeSet<Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//Treeset<Integer> array1=new Treeset<Integer>();
		for(int i=0;i<n;i++)
		{
		 array.add(sc.nextInt());  
		}   
	        System.out.println(array.descendingSet());
	        
			
		
	}

}