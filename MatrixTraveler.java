/**
 * A table composed of N x M cells, each having a certain quantity of apples, is given. You start from the upper-left corner. 
 * At each step you can go down or right one cell. Find the maximum number of apples you can collect. 
 * @author Vallabh
 *
 */
public class MatrixTraveler {
	
	public static void main(String[] args)
	{
		int[][] matrix = {
						  {1,7,3},
						  {5,8,5},
						  {3,2,9}
						 };
		int[][] solution = new int[3][3];
		solution[0][0] = matrix[0][0];
		int p=0, q=0;
		for(int i=0;i<3;i++)
		{
			p=0;
			q=0;
			for(int j=0;j<3;j++)
			{
				if(i>0)
					p = solution[i-1][j];
				if(j>0)
					q = solution[i][j-1];
				solution[i][j] = matrix[i][j] + Math.max(p, q);
			}
		}
		
		System.out.println("Max sum is " +solution[2][2]);
	}

}
