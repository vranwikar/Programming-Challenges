import java.io.*;
import java.util.*;

public class MinElementInArray {

	public static void main(String[] args)
	{
		int[] inp = {2, 3, 4, 5, 6, 7, 8, 1};
		int left = 0;
		int right = inp.length-1;
		int mid = (left + right)/2;

		while(left <= right){

			if(mid == 0 && inp[mid] < inp[mid+1]){
				System.out.println("Min element is " +inp[mid]);
				break;
			}
			else if(mid == 0 && inp[mid] > inp[mid+1])
			{
				System.out.println("Min element is " +inp[mid+1]);
				break;
			}
			
			
			int n = inp[mid];
			if(inp[mid+1] >= n && inp[mid-1] >= n)
			{
				System.out.println("Min element is " +n);
				break;
			}
			
			if(inp[right] < inp[mid])
			{
				left = mid+1;
			}
			else
				right = mid -1;
			
			mid = (left + right)/2;
		}
		
	}
}
