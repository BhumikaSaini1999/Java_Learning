import java.util.Arrays;
import java.util.List;

//ForEach using Lambda Expression
public class LambdaExp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("7","4","3","2","9");
		list.forEach(i->System.out.println("Hello "+i));//Internally using Consumer Functional Interface
	}

}
