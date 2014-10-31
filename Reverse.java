import java.io.*;

public class Reverse {

	public static void main(String[] args)
	{
		int x = -234;
		boolean flag = false;
		if(x < 0)
		{
			x = 0 - x;
			flag = true;
		}
		
		int p = x;
		int rev = 0;
		while(p > 0)
		{
			int rem = p % 10;
			p = p / 10;
			rev = rev * 10 + rem;
		}
		
		if(flag)
			rev = 0 - rev;
		
		System.out.println("Reverse :" +rev);
		
	}
}
