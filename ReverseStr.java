import java.io.*;
import java.util.*;

public class ReverseStr {

	public static void main(String[] args)
	{
		String str = "abcdf";
		char[] ch_Array = str.toCharArray();
		int i = 0;
		int j = ch_Array.length-1;
		
		while(i < j)
		{
			swap(i, j,ch_Array);
			i++;
			j--;
		}
		String st = new String(ch_Array);
		System.out.println(st);
	}
	
	private static void swap(int i, int j, char[] ch_Array)
	{
		char ch = ch_Array[i];
		ch_Array[i] = ch_Array[j];
		ch_Array[j] = ch;
	}
}
