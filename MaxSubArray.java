import java.io.*;

public class MaxSubArray {

	public static void main(String[] args)
	{
		int[] inp = {-2, -3, 4, -1, -2, 1, 5, -3};
		int tempMax = 0;   
		int overallMax = 0;
		int start = 0;
		int end = 0;
		boolean flag = false;
		for(int i=0; i <inp.length; i++)
		{
			tempMax = tempMax + inp[i];
		
			if(tempMax < 0) 
			{					
				tempMax = 0;
				flag = false;
			}
			
			if((!flag) && (tempMax > 0))
			{
				start = i;
				flag = true;
			}
			
			if(tempMax > overallMax)
			{
				overallMax = tempMax;
				end = i;
			}
		}
		
		System.out.println("Maximum contigious sum is " +overallMax);
		System.out.println("Start index is " +start + " End index is " +end);
	}
}
