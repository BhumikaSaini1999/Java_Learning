
//subsets/powerset/subsequences
//Time->O(2^N) , Space->O(N)
public class PrintSubsetsOfString {
	
	public static void main (String args[]) {
		String str = "abc";
		solve(str, "");
	}

	private static void solve(String str, String out) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			System.out.println(out);
			return;
		}
		
		solve(str.substring(1), out);
		solve(str.substring(1), out+str.charAt(0));
	}

}
