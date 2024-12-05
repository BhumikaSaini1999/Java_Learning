import java.util.Scanner;

//● The frog begins at position 0 in the river.
//Its goal is to get to position n.
//● There are lilypads at various positions.
//There is always a lilypad at position 0
//and position n.
//● The frog can jump at most k units at a
//time.

//Time->O(n)
//Space->O(1)

//Intuition->Make a jump as far as we can
public class FrogJump {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Lilypads: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the number of jumps frog can make in 1 hop: ");
		int k = sc.nextInt(); //Frog can jump upto k units in 1 hop
		
		System.out.println("Enter distance array between ith and (i+1)th lilypad:");
		int d[] = new int[n];
		for(int i=0; i<n; i++) {
			d[i] = sc.nextInt();
		}
		
		System.out.println(minJumps(d,k));
		sc.close();
	}

	//[5,3,1,2,8] k=9
	private static int minJumps(int[] d, int k) {

		int curId = 0, minJumps = 0;

		while (curId < d.length) {
			int nextId = curId, curDist = 0;
			while (nextId + 1 <= d.length && d[nextId] + curDist <= k) {
				curDist += d[nextId];
				nextId++;
			}

			if (nextId == curId) { //[5,3,10,2,8] k=9
				System.out.println("Frog can't make a jump");
				return -1;
			}

			curId = nextId;
			minJumps++;
		}
		return minJumps;
	}

}
