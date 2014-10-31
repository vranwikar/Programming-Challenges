import java.io.*;
import java.util.*;

public class FixedPoint {

	public static void main(String[] args){
		
		int[] inp = {-10, -5, 0, 1, 7};
		int fp = binarySearch(inp,0,inp.length-1);
		if(fp==-1)
			System.out.println("FP doesn't exist");
		else
			System.out.println("FP is " +fp);
		
	}
	
	private static int binarySearch(int[] inp, int low, int high) {
		if(high >= low){
			int mid = (low+high)/2;
			if(inp[mid] == mid)
				return mid;
			else if(mid > inp[mid])
				return binarySearch(inp,mid+1,high);
			else
				return binarySearch(inp,low,mid-1);	
			}
				
			return -1;
			
		}
	
}
