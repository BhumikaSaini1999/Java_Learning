import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Soldier_And_NumberGame {

	public static final int LIMIT = 5000000;
	
	//Overall T(C)-> //O(n*log(log(n))) where n is LIMIT
	//https://codeforces.com/problemset/problem/546/D

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int[] spf = primeSieve(LIMIT);
		int[] prefix = new int[LIMIT + 1];

		for (int i = 2; i <= LIMIT; i++) {
			int primeCount = getPrimeCount(i, spf); // 5*10^6 * log(i)
			prefix[i] = prefix[i - 1] + primeCount; // 5*10^6
		}

		int T = Integer.parseInt(br.readLine());
		while (T > 0) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int ans = prefix[a] - prefix[b];
			pw.println(ans);
			T--;
		}
		br.close();
		pw.close();
	}

	private static int getPrimeCount(int num, int[] spf) {
		int count = 0;
		while (num > 1) {
			int primeFactor = spf[num];
			while (num % primeFactor == 0) {
				num = num / primeFactor;
				count++;
			}
		}
		return count;
	}

	private static int[] primeSieve(int n) {// O(5*10^6*log(log(5*10^6)))
		int[] prime = new int[n + 1];

		for (int i = 2; i <= n; i++) {
			if (prime[i] > 0)
				continue;

			prime[i] = i;

			if ((long) i * i > (long) n)
				continue;

			for (int j = i * i; j <= n; j += i) {
				if (prime[j] == 0) {
					prime[j] = i;
				}
			}
		}
		return prime;
	}

}
