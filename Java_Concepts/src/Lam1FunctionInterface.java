import java.util.function.Function;

public class Lam1FunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> f = x->x*x;
		System.out.println(f.apply(6));
	}

}
