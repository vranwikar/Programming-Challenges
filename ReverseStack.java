import java.util.*;
import java.io.*;

public class ReverseStack {

	public static void main(String[] args)
	{
		Stack st =  new Stack();
		st.add(1);
		st.add(2);
		st.add(3);
		
		reverseStack(st);
		
		while(!st.isEmpty()) {
			int x = (int)st.pop();
			System.out.println(" number is " +x);
		}
	}
	
	
	
	private static void reverseStack(Stack st)
	{
		int x = 0;
		if(!st.isEmpty()){
			x = (int)st.pop();
			reverseStack(st);
			insertAtBottom(st, x);
		}
	}
	
	private static void insertAtBottom(Stack st, int x)
	{
		if(st.isEmpty())
			st.push(x);
		else{
			int y = (int)st.pop();
			insertAtBottom(st,x);
			st.push(y);
		}
			 
	}
}
