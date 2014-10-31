/**
 * Maximum size square sub-matrix with all 1s
 * @author Vallabh
 * Input
 * 0  1  1  0  1 
   1  1  0  1  0 
   0  1  1  1  0
   1  1  1  1  0
   1  1  1  1  1
   0  0  0  0  0
   
   Output
    1  1  1
    1  1  1
    1  1  1
 */

public class LargestSubMatrix {

	public static void main(String[] args) {
		
		int[][] input = {
						{0,1,1,0,1},
						{1,1,0,1,0},
						{0,1,1,1,0},
						{1,1,1,1,0},
						{1,1,1,1,1},
						{0,0,0,0,0},
						};
		
		int[][] output = new int[6][5];
		
		for(int i=0;i<input.length;i++){
			output[i][0] = input[i][0];
		}
		
		for(int j=0;j<input[0].length;j++){
			output[0][j] = input[0][j];
		}
		
		for(int i=1;i<input.length;i++)
		{
			for(int j=1;j<input[0].length;j++)
			{
				if(input[i][j] != 0)
					output[i][j] = findMin(output[i][j-1],output[i-1][j],output[i-1][j-1]) + 1;
			}
		}
		
		int max = output[0][0];
		int max_i=0,max_j=0;
		for(int i=0;i < input.length;i++){
			
			for(int j=0;j<input[0].length;j++){
				if(max < output[i][j]){
					max = output[i][j];
					max_i = i;
					max_j = j;
				}
			}
		}
		System.out.println("Length is " +max);
		System.out.println("Co-ordinates are i " +max_i+" and j " +max_j);
	}
	
	public static int findMin(int i, int j, int k){
		int temp;
		temp = Math.min(i, j);
		return Math.min(temp, k);
	}
}
