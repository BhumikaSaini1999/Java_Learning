import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(4,8,10,6,24);
		//Constructor refrence
		Integer[] arr = values.stream().toArray(Integer[] :: new); //converting stream of values to Integer[]
		
		System.out.println("----Using Enhanced for loop----");
		for(Integer item : arr)
			System.out.print(item+" ");
		
		System.out.println("\n----Using Stream----");
		Stream.of(arr).forEach(System.out :: println); //converting array to stream
		Stream.of(values).forEach(System.out :: println);//converting ArrayList to stream
		
		Stream<Integer> s = Stream.of(9,7,3,4,5);
		s.forEach(System.out :: println);
	}

}
