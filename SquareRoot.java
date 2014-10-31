import java.io.*;
import java.util.*;

public class SquareRoot {

	public static void main(String[] args)
	{
		double num = 32.0;
		
		int sq1 = (int)Math.sqrt(num);
		int sq2 = sq1+1;
		
		int diff1 = (int)Math.abs(num-sq1*sq1);
		int diff2 = (int)Math.abs(num-sq2*sq2);
		//System.out.println("diff is " +diff1+ " "+diff2);
		if(diff1 < diff2)
			System.out.println("sq root is " +sq1);
		else
			System.out.println("sq root is " +sq2);
	}
}
