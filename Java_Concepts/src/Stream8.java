import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream8 {

	public static void main(String[] args) {
		// reduce()
		int[] arr = {2,1,3,5,4,6,8};
		System.out.println("------------IST QUESTION----------");
		System.out.println(Arrays.stream(arr).map(x->x/2).reduce((a,b)->a+b).getAsInt());
		
		String str="Bhumika Saini";
		System.out.println("------------2ND QUESTION----------");
		str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(ch->ch, Collectors.counting())).
		entrySet().forEach(System.out::println);
		
		int[] arr1 = {2,1,3,5,4,6,8};
		System.out.println("------------THIRD QUESTION----------");
		System.out.println(Arrays.stream(arr1).average().getAsDouble());
		
	}

}
