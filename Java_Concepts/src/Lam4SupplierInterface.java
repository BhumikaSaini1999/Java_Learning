import java.util.Date;
import java.util.function.Supplier;

public class Lam4SupplierInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Integer> s = ()->9;
		System.out.println(s.get());
		
		Supplier<Date> s1 = ()->new Date();
		System.out.println(s1.get());
	}

}
