import java.io.*;

/***
 * Longest Increasing Subsequence
 * @author Vallabh
 *
 */
public class LIS {
	
	public static void main(String[] args)
	{
		int[] inp = {10, 22, 9, 33, 21, 50, 41, 60, 80};
		int len = inp.length;
		int[] LIS = new int[len];
		int max = 1;
		for(int i=0; i < len; i++)
		{
			LIS[i] = 1;
		}
		
		for(int i = 0; i < len; i++)
		{
			for(int j = 0; j < i; j++)
			{
				if((inp[i] > inp[j]) && (LIS[i] < LIS[j]+1))
				{
					LIS[i] = LIS[j] + 1;
				}
				
			}
		}
		
		for(int i =0;i < len; i++)
		{
			if(LIS[i] > max)
				max = LIS[i];
		}
		
		System.out.println("Maximum LIS value is " +max);
	
	}
}
