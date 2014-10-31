/**
 * iven two (dictionary) words as Strings, determine if they are isomorphic. Two words are called isomorphic
if the letters in one word can be remapped to get the second word. Remapping a letter means replacing all
occurrences of it with another letter while the ordering of the letters remains unchanged. No two letters
may map to the same letter, but a letter may map to itself.

Example:
given "foo", "app"; returns true
we can map 'f' -> 'a' and 'o' -> 'p'
given "bar", "foo"; returns false
we can't map both 'a' and 'r' to 'o' 
 * @author Vallabh
 *
 */
import java.io.*;
import java.util.*;

public class IsomorphicStrings {

	public static void main(String[] args) {
	
		String st1 = "foo";
		String st2 = "apq";
		String mapping1 = getEncoding(st1);
		String mapping2 = getEncoding(st2);
		if(mapping1.equalsIgnoreCase(mapping2))
			System.out.println("Strings are Isomrphic");
		else
			System.out.println("String are not Isomorphic");
	}
	
	private static String getEncoding(String st){
		
		char[] chArray = st.toCharArray();
		Arrays.sort(chArray);
		LinkedHashMap<Character,Integer> chMap = new LinkedHashMap<Character, Integer>();
		
		for(char ch:chArray){
			int count;
			if(chMap.containsKey(ch)){
				count = chMap.get(ch);
				chMap.put(ch, ++count);
			}
			else{
				chMap.put(ch, 1);
			}
		}
		String str = chMap.values().toString();
		System.out.println();
		return str;
	}
	
}
