import java.util.Scanner;

//Moves = 2^N -1 where N is number of discs
//Time-> O(2^N) Space->O(N)
public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of discs: ");
        int n = sc.nextInt();
        
        int count = 0;
        System.out.println(toh(n, 1, 3, 2, count));
	}

	private static int toh(int n, int s, int d, int h, int count) {
		// TODO Auto-generated method stub
		if(n==1) {
			count++;
			System.out.println("move disc "+n+" from rod "+s+" to rod "+d);
			return count;
		}
		
		count = toh(n-1, s, h, d, count);
		count++;
		System.out.println("move disc "+n+" from rod "+s+" to rod "+d);
		count = toh(n-1, h, d, s, count);
		return count;
	}

}
