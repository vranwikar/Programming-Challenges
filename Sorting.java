import java.io.*;
import java.util.*;

public class Sorting {

	public static void main(String[] args)
	{
		int[] A = {2,4,1,5, 10, 2, 99, 1,3};
		int[] result = mergeSort(A, 0, A.length-1);
		for(int i =0 ;i < A.length; i++)
			System.out.println(A[i]);
	
		quickSort(A);

	}
	
	private static int[] mergeSort(int[] A, int low, int high)
	{
		int[] result = new int[A.length];
		
		if(low < high)
		{
			int middle = low + (high -low)/2;
			mergeSort(A, low, middle);
			mergeSort(A, middle+1, high);
			merge(A, low, middle, high, result);
		}
		
		return result;
		
	}
	
	private static void merge(int[] A, int low, int middle, int high, int[] result)
	{
		int i=low;
		int j=middle+1;
		int k=0;
		
		while( (i <= middle) && (j <= high))
		{
			if(A[i] <= A[j])
			{
				result[k]=A[i];
				i++;
			}
			else
			{
				result[k]=A[j];
				j++;
			}
			k++;
		}
		
		if((i > middle))
		{
			//System.out.println("Copy array B");
			while(j <= high)
			{
				result[k] = A[j];
				k++;
				j++;
			}
		}
		else
		{
			//System.out.println("Copy array A");
			while(i <= middle)
			{
				result[k] = A[i];
				k++;
				i++;
			}
		}
		
		for(k=low;k <= high; k++)
			A[k] = result[k];
	}
	
	private static void quickSort(int[] A)
	{
		
		
	}
}
