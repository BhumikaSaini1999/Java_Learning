import java.util.ArrayList;

//Time-> O(2^(N-1)) combinations and  Space->O(N) where N is length of String
public class permutationWithSpaces {

	public static void main(String[] args) {
		ArrayList<String> ans = new ArrayList<String>();
		String S = "ABC";
		ans = solve(S.substring(1), String.valueOf(S.charAt(0)), ans);
		System.out.println(ans);
	}

	static ArrayList<String> solve(String in, String out, ArrayList<String> ans) {
		if (in.length() == 0) {
			ans.add(out);
			return ans;
		}

		ans = solve(in.substring(1), out + " " + in.charAt(0), ans);
		ans = solve(in.substring(1), out + in.charAt(0), ans);
		return ans;
	}

}
