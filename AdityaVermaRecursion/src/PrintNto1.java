//Time->O(n)
//Space->O(n)
public class PrintNto1 {
	
	static void print(int n) {
		if(n==1) {
			System.out.print(1+" ");
			return;
		}
		System.out.print(n+" ");
		print(n-1);
	}

	public static void main(String[] args) {
        print(7);
	
	}

}
