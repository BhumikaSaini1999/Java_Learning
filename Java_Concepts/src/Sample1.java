public class Sample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Bhumika Saini";
		String ans = reverse(s, 0, s.length()-1, "");
		System.out.println(ans);
	}

	private static String reverse(String s, int start, int end, String ans) {
		if(end<start)
			return ans;
		ans+=s.charAt(end);
		return reverse(s,start,end-1,ans);
	}

}
