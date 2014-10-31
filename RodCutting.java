/**
 * 
 * Suppose you get different prices for steel rods of different lengths. Your supplier provides long rods; 
 * you want to know how to cut the rods into pieces in order to maximize revenue. Each cut is free. 
 * Rod lengths are always an integral number of length units (let's say they are centimeters).
   Input: A length n and a table of prices pi for i = 1, 2, ..., n. 
   Output: The maximum revenue obtainable for rods whose lengths sum to n, computed as the sum of the 
   prices for the individual rods.
 * @author Vallabh
 *
 */
public class RodCutting {
	
	public static void main(String[] args){
		
		int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
		int[] val = new int[price.length+1];
		for(int i=0;i<val.length;i++)
			val[i] = 0;
		
		for(int i=1;i<=price.length;i++)
		{
			int max = Integer.MIN_VALUE;
			for(int j=0;j<i;j++){
				max = Math.max(max, price[j]+val[i-j-1]);
			val[i] = max;
			}
		}
		System.out.println();
		/*int revenue = cutRod(price,price.length);
		System.out.println("Revenue is " +revenue);*/
	}

	private static int cutRod(int[] price, int n){
		int q = Integer.MIN_VALUE;
		if(n == 0)
			return 0;
		
		for(int i =0;i<n;i++)
			q = Math.max(q, price[i]+ cutRod(price,n-i-1));
		
		return q;
	}
	
	
}
