import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

//Time->O(nlogn)
//Space->O(n)
//https://www.spoj.com/problems/DEFKIN/
public class DEFKIN {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			String[] input = br.readLine().split(" ");
			int cols = Integer.parseInt(input[0]); // width
			int rows = Integer.parseInt(input[1]); // height
			int n = Integer.parseInt(input[2]); // number of towers

			int pos = n;
			if (n == 0) {// Base Case
				pw.println(rows * cols);
				continue;
			}
			int[] towerRows = new int[n];
			int[] towerCols = new int[n];
			while (pos > 0) {
				String[] position = br.readLine().split(" ");
				int col = Integer.parseInt(position[0]); // Tower column
				int row = Integer.parseInt(position[1]); // Tower row
				towerRows[pos - 1] = row;
				towerCols[pos - 1] = col;
				pos--;
			}
			
			Arrays.sort(towerRows);
			Arrays.sort(towerCols);
			int maxRows = Math.max(towerRows[0] - 1, rows - towerRows[n - 1]),
					maxCols = Math.max(towerCols[0] - 1, cols - towerCols[n - 1]);
			for (int i = 1; i < n; i++) {
				maxRows = Math.max(maxRows, towerRows[i] - towerRows[i - 1] - 1);
				maxCols = Math.max(maxCols, towerCols[i] - towerCols[i - 1] - 1);
			}
			pw.println(maxRows * maxCols);
		}
		br.close();
		pw.close();
	}
}
