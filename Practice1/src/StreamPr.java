import java.util.Arrays;
import java.util.List;

public class StreamPr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(8,6,10,12,4);
	    //list.stream().sorted((a,b)->Integer.compare(b, a)).skip(1).findFirst();
		System.out.println(list.stream().sorted((a,b)->Integer.compare(b, a)).skip(1).findFirst().get());
	}

}