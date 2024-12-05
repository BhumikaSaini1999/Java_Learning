import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Test1{
	
public int value;

public int hashcode() {
	return 42;
}

}

class Test2{
	
public int value;

public int hashcode() {
	return (int)(value^5);
}

}


public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = new String[10];
		Optional strOpt = Optional.ofNullable(str[9]);
		System.out.println(strOpt.isPresent());
		
		List ints = Arrays.asList(1,2);
		List nums = ints;
		//nums.add(3.18);
		
	}

}
