import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//https://www.spoj.com/problems/NFACTOR/
//T(C)->O(11*10^6) + O(10^6*log(log(10^6)))
public class NFactorful {

	public static final int LIMIT = 1000000;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int prime[] = primeSieve(LIMIT);
		
		//Here we pre calculating 11 prefix arrays having prime count from 0 to 10.
		int prefix[][] = prefixPrimeSieve(prime);

		int T = Integer.parseInt(br.readLine());
		while (T > 0) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int n = Integer.parseInt(input[2]);

			int count = prefix[n][b] - prefix[n][a - 1];
		    pw.println(count);
			T--;
		}
		br.close();
		pw.close();
	}

	private static int[][] prefixPrimeSieve(int[] prime) {
		int[][] prefix = new int[11][LIMIT+1];
		for (int i = 0; i < prefix.length; i++) {
			int n = i;

			int count=0;
			for (int j = 1; j < prefix[i].length; j++) {
				if (prime[j] == n) {
					count++;
					prefix[i][j]=count;
				}else {
					prefix[i][j]=prefix[i][j-1];
				}
				//System.out.print(prefix[i][j]+" ");
			}
			//System.out.println();
		}
		return prefix;
	}

	private static int[] primeSieve(int n) {
		int[] prime = new int[n + 1];

		for (int i = 2; i <= n; i++) {
			if (prime[i] > 0)
				continue;

			prime[i] = 1;

			for (int j = 2 * i; j <= n; j += i) {
				prime[j]++;
			}
		}
		return prime;
	}

}
