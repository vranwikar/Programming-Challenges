/**
 * Find k closest elements to a given value
 * @author Vallabh
 *
 */

public class kClosestElement {

	public static void main(String[] args){
		
		int[] arr = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};
		//int s = findCrossOver(arr, 0, arr.length-1, 33);
		//System.out.println("point is " +s);
		printkClosestNumbers(arr, 4, 35);
	}
	
	private static int findCrossOver(int[] arr, int low, int high, int x){
		
		if(arr[high]<=x)
			return high;
		if(x < arr[low])
			return low;
		int mid = (high + low)/2;
		
		if(arr[mid]<=x && arr[mid+1] > x)
			return mid;
		
		if(arr[mid] >= x)
			return findCrossOver(arr, low, mid-1, x);
		else
			return findCrossOver(arr,mid+1, high, x);
		
	}
	
	private static void printkClosestNumbers(int[] arr, int k, int x)
	{
		int cross = findCrossOver(arr, 0, arr.length-1, 35);
		int le = 0;
		int re = 0;
		int count = 0;
		if(arr[cross]==x)
			le = cross-1;
		else
			le = cross;
		re = cross+1;
		
		while(le >= 0 && re < arr.length-1 && count < k) {
			
			if((x - arr[le]) > (arr[re] -x)) 
				System.out.println("Number is " +arr[re++]);
			else
				System.out.println("Number is " +arr[le--]);
			count++;
		}
		
		while(count < k && le >= 0)
			System.out.println("Number is " +arr[le--]);
		
		while(count < k && re < arr.length)
			System.out.println("Number is " +arr[re++]);
	}
}
