import java.util.function.Predicate;

public class Lam2PredicateInterface {

	public static void main(String[] args) {
		Predicate<Integer> p = x -> x%2==0;
		System.out.println(p.test(9));
	}
}
