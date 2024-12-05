import java.util.Scanner;

public class AlmostPrime {

	public static void main(String[] args) {
		int[] spf = primeSieve(3000);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans=0;
		for(int i=1; i<=n; i++) {
			if(TwoDistinctPrimes(i, spf)) {
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}

	private static boolean TwoDistinctPrimes(int n, int[] spf) {//O(n*log(n))
		int count=0;
		
		while(n>1) {
			int prime = spf[n];
			while(n%prime==0) {
				n/=prime;
			}
			count++;
		}
		return count==2;
	}

	private static int[] primeSieve(int n) {//O(n*log(log(n)))
		int[] spf = new int[n + 1];

		for (int i = 2; i <= n; i++) {
			if (spf[i] > 0)
				continue;

			spf[i] = i;

			if ((long) i * i > (long) n)
				continue;

			for (int j = i * i; j <= n; j+=i) {
				if (spf[j] == 0)
					spf[j] = i;
			}
		}
		return spf;
	}

}
