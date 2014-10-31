/**
 * Given a list of N coins, their values (V1, V2, ... , VN), and the total sum S. Find the minimum number of coins 
 * the sum of which is S (we can use as many coins of one type as we want), or report that it's not possible to select 
 * coins in such a way that they sum up to S.
 * @author Vallabh
 *
 */
public class CoinChange {
	
	public static void main(String[] args)
	{
		int S = 11;
		int[] coins = {1, 3, 5};
		int[] Min = new int[S+1];
		for(int i=0;i<=S;i++) Min[i]=999;
		Min[0]=0;
		
		for(int i=1;i<=S;i++)
		{
			
			for(int j=0; j <coins.length;j++)
			{
				if((coins[j] <= i) && (Min[i-coins[j]]+1 < Min[i]))
				{
					Min[i] = Min[i-coins[j]]+1;
				}
			}
		}
		for(int i = 0; i<=S; i++)
			System.out.println("Output is " +Min[i]);
	}

}
