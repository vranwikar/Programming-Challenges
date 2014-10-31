import java.io.*;
import java.util.*;

public class RemoveAlternateString {

	public static void main(String[] args){
		String inpStr = "how how how how how";
		String st=" ";
		HashSet<String> seenWord = new HashSet<String>();
		String[] strArray = inpStr.split(" ");
		
		for(int i=0;i<strArray.length;i++)
		{
			int count = 0;
			for(int j = i+1; j < strArray.length;j++){
				
				if(strArray[i].equalsIgnoreCase(strArray[j])){
					count++;
					if(count%2 != 0 && !seenWord.contains(strArray[i]))
						strArray[j]="";
				}
			}
			seenWord.add(strArray[i]);
		}
		
		for(int i=0;i<strArray.length;i++)
		{
			if(!strArray[i].isEmpty())
			st = st + " "+ strArray[i];
		}
	
		System.out.println(st);
	}
}
