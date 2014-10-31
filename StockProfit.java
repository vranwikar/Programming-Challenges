
public class StockProfit {

	public static void main(String[] args) {
		
		int[] a = {1,3,5,1,2,4};
		int exp=0;
		int profit = 0;
		int share = 0;
		int net = 0;
		int j;
		for(int i = 0; i < a.length;i = j+1)
		{
			for(j = 0; j < i;j++)
			{
				if(a[j] >= a[i]){
					exp = exp + a[j];
					share =share+1;
				}
				if(a[j] < a[i] && share > 1){
					net = a[i] * share;
					profit = profit + net - exp;
					net =0;
					exp = 0;
					share = 0;
				}
			}
		}
	}
}
