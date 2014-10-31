import java.io.*;

public class Merge {

	public static void main(String args[])
	{
		int[] b = {1,2,3};
		int[] a = {4,5,6,7,8};
		int len = a.length + b.length;
		int[] c = new int[len];
		
		int i=0;
		int j=0;
		int k =0;
		
		while( (i < a.length) && (j < b.length))
		{
			
			if(a[i] <= b [j])
			{
				c[k]=a[i];
				i++;
				k++;
			}
			else
			{
				c[k]=b[j];
				j++;
				k++;
			}
		}
		
		if((i == a.length))
		{
			System.out.println("Copy array B");
			while(j < b.length)
			{
				c[k] = b[j];
				k++;
				j++;
			}
		}
		else
		{
			System.out.println("Copy array A");
			while(i < a.length)
			{
				c[k] = a[i];
				k++;
				i++;
			}
		}
		
		for(k=0;k < c.length; k++)
		{
			System.out.println(c[k]);
		}
		
	}
}
