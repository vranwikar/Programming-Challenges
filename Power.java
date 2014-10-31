import java.io.*;

/**
 * find a^b
 * @author Vallabh
 *
 */
public class Power {

	public static void main(String[] args) {
		int a=3;
		int b=4;
		int sum=1;
		 while(b > 0)
		 {
		 if(1 == b % 2)
		 {
		 if(b > 0)
		 sum *= a;
		 else
		 a /= a;
		 }
		 a = a * a;

		 b /= 2;
		 }
		
		System.out.println("prod is " +sum);
	}
}
