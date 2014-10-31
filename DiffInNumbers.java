
/**
 * 
 You have two arrays of integers, where the integers do not repeat and the two arrays have no common integers.
Let x be any integer in the first array, y any integer in the second. Find min(Abs(x-y)). That is, 
find the smallest difference between any of the integers in the two arrays.
Assumptions: Assume both arrays are sorted in ascending order.
 */

import java.io.*;
import java.util.*;

public class DiffInNumbers {

	public static void main(String[] args) {
		int[] A = { -4,-3,-2,-1 };
		int[] B = { -9,-8,-7,-3,-2};
		int minDiff = 999999;
		int x = 0;
		int y = 0;
		int i = 0;
		int j = 0;

		while((i < A.length) && (j < B.length)){
			
			int diff = Math.abs(A[i] - B[j]);
			
			if(diff <=minDiff){
				x = i;
				y = j;
				minDiff = diff;
			}
			
			if(A[i] >= B[j]){
				j++;
			}
			else
				i++;
		}
		
		System.out.println("Min diff is " +minDiff+" indexes are i and " +x +" "+y);
	}
}
