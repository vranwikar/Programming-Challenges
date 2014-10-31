import java.io.*;
import java.util.*;

public class MatrixSearch {

	public static void main(String[] args){
		
		int[][] inp = {
						{15,20,40,85},
						{20,35,80,95},
						{30,55,95,105},
						{40,80,100,120}
					};
		int element = 155;
		int row=0,col=inp[0].length-1;
		boolean flag = true;
		while(row < inp.length && col>=0){
			
			if(inp[row][col] == element){
				System.out.println("Element found at " +row+" " +col);
				flag = false;
				break;
			}
			else if(inp[row][col] > element)
				col--;
			else
				row++;
		}
		
		if(flag)
			System.out.println("No Element found");
	}
}
