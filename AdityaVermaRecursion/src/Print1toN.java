//Time->O(n)
//Space->O(n)
public class Print1toN {
	
	static void print(int n) {
		if(n==1) {
			System.out.print(1+" ");
			return;
		}
		print(n-1);
		System.out.print(n+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        print(7);
	}

}
