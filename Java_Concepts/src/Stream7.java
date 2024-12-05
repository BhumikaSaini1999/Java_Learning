import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Stream7 {

	public static void main(String[] args) {
		// reduce()
		// returns sum of 4 to 10
		//Example1
		System.out.println(IntStream.range(4, 11).reduce((a, b) -> a + b).getAsInt());

		//Example2
		String[] array = { "Geeks", "for", "Geeks" };
		System.out.println(Arrays.stream(array).reduce((a, b) -> a + "-" + b).get());
		
		//Example3
		 List<String> words = Arrays.asList("GFG", "Geeks", "for", 
                 "GeeksQuiz", "GeeksforGeeks"); 
		 System.out.println(words.stream().reduce((a,b)->a.length()>b.length()?a:b).get());
		 System.out.println(words.stream().sorted((a,b)->{
			 int l1=a.length();
			 int l2=b.length();
			 
			 return (l1>=l2) ? -1:1;
		 }).findFirst().get());
	}

}
