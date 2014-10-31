import java.io.*;
import java.util.*;

public class CountNumber {

	public static void main(String[] args){
		
		char[] inp = {'a', 'a', 'b', 'b', 'b', 'b', 'c'};
		char element = 'b';
		int low = 0;
		int high = inp.length-1;
		int firstIndex = firstOccurrence(inp,low, high, element);
		
		int lastIndex =  lastOccurrence(inp,low, high,element);
	    System.out.println("count is " + (lastIndex-firstIndex + 1));
	
	}
	
	private static int firstOccurrence(char[] inp, int low, int high, int element){
		
		if(low<=high){
			int mid = (high+low)/2;
			if((mid==0 && inp[mid] == element) || (inp[mid-1] < element && inp[mid] == element))
				return mid;
			else if(element > inp[mid])
					return firstOccurrence(inp,mid+1,high,element);
			else
					return firstOccurrence(inp,low,mid-1,element);
		}
		return -1;
	}
	
	private static int lastOccurrence(char[] inp, int low, int high, int element){
		if(low<=high){
			int mid = (high+low)/2;
			if((mid==inp.length-2 && inp[mid] == element) || (inp[mid+1] > element && inp[mid] == element)){
				return mid;
			}
			else if(element <= inp[mid])
					return lastOccurrence(inp,mid+1,high,element);
			else
					return lastOccurrence(inp,low,mid-1,element);
		}
		return -1;
		
	}
}
