

//Time->O(2^N) Space->O(N) where N is length of string
public class PermutationWithCaseChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="abc";
        solve(str, "");
	}

	private static void solve(String str, String out) {
		if(str.length()==0) {
			System.out.print(out+" ");
			return;
		}
		
		solve(str.substring(1), out+str.charAt(0));
		solve(str.substring(1), out+(char)(str.charAt(0)-32));
		
	}

}
