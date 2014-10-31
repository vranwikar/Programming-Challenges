import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Given a collection of intervals, merge all overlapping intervals.

For example,
Given [1,3],[2,6],[8,10],[15,18],
return [1,6],[8,10],[15,18].
 * @author Vallabh
 *
 */
class Interval {
	
	int start;
	int end;
	public Interval(int s, int e)
	{
		start = s;
		end = e;
	}
	
	public String toString()
	{
		String st = String.format("Start is %d End is %d", this.start, this.end);		
		return st;
		
	}
}

public class IntervalMerge
{
	
	public static ArrayList<Interval> merge(ArrayList<Interval> intervals)
	{
		ArrayList<Interval> results = new ArrayList<Interval>();
		if(intervals==null || intervals.size()<=1)
			return intervals;
		Collections.sort(intervals, new IntervalComparator());
		Interval prev = intervals.get(0);
		for(int i=1; i < intervals.size(); i++)
		{
			Interval curr = intervals.get(i);
			if(prev.end >= curr.start)
			{
				Interval merged = new Interval(prev.start, Math.max(prev.end,curr.end));
				prev = merged;
			}
			else
			{
				results.add(prev);
				prev = curr;
			}
			
		}
		results.add(prev);
		return results;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Interval> list = new ArrayList<Interval>();
		//[1,3],[2,6],[8,10],[15,18]
		Interval i1 = new Interval(1, 3);
		Interval i2 = new Interval(2, 6);
		Interval i3 = new Interval(8, 10);
		Interval i4 = new Interval(15, 18);
		
		list.add(i1);list.add(i2);list.add(i3);list.add(i4);
		ArrayList
		<Interval> l1 = merge(list);
		for(Interval i: l1)
		{
			System.out.println(i);
		}
		
	}
}

class IntervalComparator implements Comparator<Interval>
{

	@Override
	public int compare(Interval v1, Interval v2) {
		return v1.start - v2.start;
	}
	

}