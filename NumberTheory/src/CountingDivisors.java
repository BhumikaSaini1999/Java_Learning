import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//T(C)->O(n*log(x)) + O(10^6*log(log(10^6))) ~ O(n*log(x))
//https://cses.fi/problemset/task/1713/
public class CountingDivisors {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int n=Integer.parseInt(br.readLine());
		int[] spf = primeSieve(1000000);

		while (n > 0) {//O(n*log(x))
			int x = Integer.parseInt(br.readLine());
			int ans = 1;
			while (x > 1) {//O(log(x))
				int prime = spf[x];
				int cnt = 0;
				while (x % prime == 0) {
					x = x / prime;
					cnt++;
				}
				ans = ans * (cnt + 1);
			}
			pw.println(ans);
			n--;
		}
		br.close();
		pw.close();
	}

	private static int[] primeSieve(int n) {//O(n*log(log(n)))
		int[] prime = new int[n + 1];

		for (int i = 2; i <= n; i++) {
			if (prime[i] > 0)
				continue;
			
			prime[i] = i;

			if ((long) i * i > (long) n)
				continue;

			for (int j = i * i; j <= n; j += i) {
				if (prime[j]==0) {
					prime[j] = i;
				}
			}
		}
		return prime;
	}

}
