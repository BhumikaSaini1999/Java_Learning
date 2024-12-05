import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

//T(C)->n*x(log(log(x))
//S(C)->n*x
public class CountingDivisors2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int n = Integer.parseInt(br.readLine());

		while (n > 0) {
			int x = Integer.parseInt(br.readLine());
			int ans = primeSieve(x);
			pw.println(ans);
			n--;
		}
		br.close();
		pw.close();
	}

	private static int primeSieve(int n) {
		boolean[] prime = new boolean[n + 1];

		int count = 1;
		prime[1] = true;
		for (int i = 2; i <= n; i++) {
			if (prime[i] || n % i != 0)
				continue;

			prime[i] = true;
			count++;

			if ((long) i * i > (long) n)
				continue;

			for (int j = i * i; j <= n; j += i) {
				if (!prime[j] && n % j == 0) {
					prime[j] = true;
					count++;
				}
			}
		}
		return count;
	}

}
