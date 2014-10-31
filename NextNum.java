import java.io.*;
import java.util.*;

public class NextNum {

	public static void main(String[] args){
		int n=218715;
		String num = Integer.toString(n);
		char[] numArray = num.toCharArray();
		int i,j;
		for(i=numArray.length;i>=0;i--){
			
			if(numArray[i-1] > numArray[i])
				break;
		}
		
		if(i==0) {
			System.out.println("All elements in descending order..Not Possible");
			return;
		}
			
		for(j=i-1;j<numArray.length;j++){
			
		}
		
	}
}
