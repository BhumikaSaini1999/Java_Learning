import java.util.Scanner;

//https://www.geeksforgeeks.org/problems/coin-change2448/1
//Time->O(2^n)//at every stage we have two options forming G.P. series->2+4+8+...
//Space->O(n)//height of tree
public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		
		int coins[] = new int[n];
		for(int i=0; i<n; i++) {
			coins[i]=sc.nextInt();
		}
		System.out.println(count(coins,n,sum));
		sc.close();
	}

	private static long  count(int[] coins, int n, int sum) {
		// TODO Auto-generated method stub
		return countHelper(coins, n, sum, 0);
	}

	private static long countHelper(int[] coins, int N, int sum, int i) {
		// TODO Auto-generated method stub
		if (i >= N)
			return 0;
		if (sum == 0)
			return 1;
		if (sum < 0)
			return 0;

		// pick coin
		long op1 = countHelper(coins, N, sum - coins[i], i);

		// discard coin
		long op2 = countHelper(coins, N, sum, i + 1);
		return op1 + op2;
	}

}
