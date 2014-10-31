import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

public class LLProblems {

	public static void main(String[] args)
	{
		LinkedList l1 = new LinkedList();
		l1.add(1);
		l1.add(5);
		l1.add(7);
		l1.add(9);
		l1.add(10);
		
		LinkedList l2 = new LinkedList();
		l2.add(5);
		l2.add(7);
		l2.add(9);
		LinkedList.intersectionofLL(l1, l2);
	}

	
}
