import java.io.*;
import java.util.*;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique 
 * triplets in the array which gives the sum of zero.
 * @author Vallabh
 *
 */
public class Sum3 {

	public static void main(String[] args)
	{
		int[] inArray = {-1, 0, 1, 2, -1 ,-4};
		findTriple_3(inArray);
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		HashSet<String> result = new HashSet<String>();
		int i =0;
		while(i < inArray.length)
		{
			hMap.put(inArray[i], i);
			i++;
		}

		for(i=0;i<inArray.length;i++)
		{
			for(int j=i+1;j < inArray.length;j++)
			{
				int k = 0 - (inArray[i]+inArray[j]);
				if(hMap.containsKey(k))
				{
					System.out.println("There is a triplet adding to zero and Numbers are " + inArray[i] + " " + inArray[j] + " " + k);
					String st = i + "" + j +""+ hMap.get(k);
					char[] ch = st.toCharArray();
					Arrays.sort(ch);
					String str = new String(ch);
					result.add(str);
				}
			}
		}

		Iterator it = result.iterator();
		while(it.hasNext())
		{
			String st = (String)it.next();
			System.out.println(st);
		}
	}

	private static int[] findTriple_3(int[] A) 
	{
		Map<Integer, int[]> map = new HashMap<Integer, int[]>();
		for (int i = 0, l = A.length; i < l; i++) 
		{
			map.clear();
			for (int j = i + 1; j < l; j++) 
			{
				if (map.containsKey(A[j])) 
				{
					int[] pair = map.get(A[j]);
					return new int[]{pair[0], pair[1], A[j]};
				} 
				else
					map.put(-A[i] - A[j], new int[]{A[i], A[j]});
			}
		}
		return null;
	}
}
