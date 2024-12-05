import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExp6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(7,4,3,2,9);
		list.forEach(i->System.out.print(i+" "));
		
		
		System.out.println("\n----Even numbers----");
		list.forEach(i->{
			if(i%2==0)
				System.out.print(i+" ");
		});
		
		System.out.println("\nUsing Method Refrence");
		list.forEach(System.out :: println); 
	}

}
