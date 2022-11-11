package week1.day2homeassignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindSecondLargest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data={3,2,11,4,6,7};
		int valueforsort=data.length;
		//System.out.println(valueforsort);
		Arrays.sort(data);// 2,3,4,6,7,11
	   System.out.println(data[valueforsort-2]);
		
		
		
		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
	
		
	}

}
