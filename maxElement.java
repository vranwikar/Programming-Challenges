/**
 * Find the maximum element in an array which is first increasing and then decreasing
 *
 */
import java.io.*;
import java.util.*;

public class maxElement {

	public static void main(String[] args)
	{
		int[] arrays = {1, 3, 50, 10, 9, 7, 6};
		int res = findMax(arrays, 0, arrays.length-1);
		System.out.println("Highest element is " +res);
	}

	private static int findMax(int[] array, int low, int high)
	{
		if(high==low)
			System.out.println(array[low]);

		int mid = low + (high - low)/2;
		
		if((high == low +1) && array[low] >= array[high])
			return array[low];
		
		if((high == low +1) && array[high] > array[low])
			return array[high];
		
		if(array[mid] > array[mid+1] && array[mid] > array[mid-1])
		{
			return array[mid];
		}
		
		if(array[mid] > array[mid+1] && array[mid] < array[mid-1])
			return findMax(array,low, mid-1);
		else
			return findMax(array,mid+1,high);
					
		
	}
}
