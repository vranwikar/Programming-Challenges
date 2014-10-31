import java.util.Arrays;
import java.util.Collections;

/**
 * Given a number n, find the largest number small than having the same digits as of n. E.g. 231 output will be 132.
 * @author Vallabh 5216 5126
 * 521
 *  
 *
 */
public class MaxNum {
	
	public static void main(String[] args)
	{
		int num=785749;
		String st = Integer.toString(num);
		System.out.println("Max int is " +st);
		char[] narray = st.toCharArray();
		Arrays.sort(narray);
		StringBuilder sb = new StringBuilder();
		for(int i=narray.length-1;i>=0;i--)
		{
			sb.append(narray[i]);
		}
		System.out.println(sb);
		
	}

}
