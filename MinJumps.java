/**s
 * 
Minimum number of jumps to reach end

Given an array of integers where each element represents the max number of steps that can be made forward from that element. 
Write a function to return the minimum number of jumps to reach the end of the array (starting from the first element). If an 
element is 0, then cannot move through that element.
 * @author Vallabh
 *
 */
public class MinJumps {
	
	public static void main(String[] args){
		
		int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int x = minJumps(arr, 0, arr.length-1);
		System.out.println();
	}

	private static int minJumps(int[] arr, int start, int dest){
		
		if(start == dest)
			return 0;
		
		if(arr[start] == 0)
			return Integer.MAX_VALUE;
		
		int min = Integer.MAX_VALUE;
		
		for(int i = start+1; (i <= dest) && (i <= start + arr[start]);i++){
			int jumps = minJumps(arr,i,dest);
			if(jumps != Integer.MAX_VALUE && (jumps+1) < min)
				min = jumps + 1;
		}
		
		return min;
	}
}
