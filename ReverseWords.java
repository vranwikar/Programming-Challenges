import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Given an input string, reverse the string word by word.

For example, given s = "the sky is blue", return "blue is sky the".
 * @author Vallabh
 *
 */
public class ReverseWords {
	
	public static void main(String[] args)
	{
		String inpString = "the sky is blue";
		StringBuilder sb = new StringBuilder();
		
		String[] arr = inpString.split(" ");
		
		for(int i = arr.length-1; i>=0;i--)
		{
			sb.append(arr[i]);
			sb.append(" ");
		}
		
		System.out.println("Reverse " +sb);
	}

}
