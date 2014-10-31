import java.io.*;
import java.util.*;

public class EditDistance {

	private static String SEGMENT_NAME="";
	public static void main(String[] args)
	{
		String s1 = "POLYNOMIAL";
		String s2 = "EXPONENT";
		int[][] editDist = new int[s1.length()+1][s2.length()+1];
		if(SEGMENT_NAME.isEmpty())
			System.out.println("HI");
		else
			SEGMENT_NAME="MLB";
		test();
		
	}
	
	private static void test()
	{
		System.out.println("ji" +SEGMENT_NAME);
	}
}
