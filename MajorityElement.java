import java.util.*;
import java.io.*;

public class MajorityElement {

	public static void main(String[] args){
		int[] inp = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		int majIndex=0;
		int count =1;

		for(int i=1;i<inp.length;i++){
			if(inp[majIndex]==inp[i])
				count++;
			else{
				count--;
			}
			if(count==0)
			{
				majIndex = i;
				count = 1;
			}
				
		}
		
		System.out.println("Majority element is "+inp[majIndex]);
	}
}
