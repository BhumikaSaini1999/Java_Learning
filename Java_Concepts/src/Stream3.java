import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Case 2: increment each Student marks by 5
		List<Integer> marks = Arrays.asList(4,8,10,15,22,13,8);
		
		System.out.println("---------------Updated Marks----------------");
		List<Integer> updatedMarks = marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updatedMarks);
		
		//Case3: Number of Failed Students
		//count()-Terminal 
		System.out.println("--------------Number of Failed Students--------------");
		System.out.println(marks.stream().filter(i->i<15).count());//passing marks 15
	}

}
