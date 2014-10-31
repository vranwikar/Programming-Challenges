import java.io.*;

/***
 * On a positive integer, you can perform any one of the following 3 steps. 1.) Subtract 1 from it. ( n = n - 1 ), 2.) 
 * If its divisible by 2, divide by 2. ( if n % 2 == 0 , then n = n / 2  )  , 3.) If its divisible by 3, 
 * divide by 3. ( if n % 3 == 0 , then n = n / 3  ). Now the question is, given a positive integer n, find the 
 * minimum number of steps that takes n to 1
 * 
 *
 */
public class MinStepsTo1 {
	
	public static void main(String[] args)
	{
		int n = 7;
		int result = getNumberofSteps(n);
		System.out.println("Number of Steps required are " +result);
	}
	private static int getNumberofSteps(int n)
	{
		int [] result = new int[n+1];
		
		for(int i=0; i <= n ; i++)
			result[i]=-1;
		
		if(n==1)
		{
			return 0;
		}
		
		if(result[n] != -1)
			return result[n];
		
		int r = 1 + getNumberofSteps(n-1);
		
		if(n%2 == 0)
			r = Math.min(r, 1+getNumberofSteps(n/2));
		
		if(n%3 == 0)
			r = Math.min(r, 1+getNumberofSteps(n/3));
		
		result[n] = r;
		return r;
	}
	
}
