/**
 * Check if 2 rectangles overlap
 * @author Vallabh
 *
 */


public class RectangleOverlap {

	public static void main(String[] args)
	{
		Point l1 = new Point(0, 10);
		Point r1 = new Point(10, 0);
		Point l2 = new Point(5, 5);
		Point r2 = new Point(15, 5);
		
		boolean flag = overlap(l1, r1, l2, r2);
		if(flag)
			System.out.println("Rectangles ovrelap");
		else
			System.out.println("Rectangles don't overlap");
		
	}

	private static boolean overlap(Point l1, Point r1, Point l2, Point r2) 
	{
		if(l1.x > r2.x || l2.x > r1.x)
			return false;
		
		if(l1.y < r2.y || l2.y < r1.y)
			return false;
		return true;
	}
	
	
	
}
class Point{
	
	int x;
	int y;
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}