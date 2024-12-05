import java.util.function.Consumer;

public class Lam3ConsumerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> c = x->System.out.println("I am printing "+x);
		c.accept(8);
	}

}
