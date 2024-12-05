
//subsets/powerset/subsequences
//Time->O(2^N) , Space->O(N)
public class CountSubsetsOfString {

	public static void main(String[] args) {
		String str = "abcd";
		int count=0;
		System.out.println(solve(str, "", count));
	}

	private static int solve(String str, String out, int count) {
		if(str.length()==0) {
			count++;
			return count;
		}
		
		count = solve(str.substring(1), out, count);
		count = solve(str.substring(1), out+str.charAt(0), count);
        return count;
	}

}
