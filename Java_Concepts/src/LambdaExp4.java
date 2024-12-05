import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumerImpl implements Consumer<Integer>{ //boilerplate code, Here Consumer is FunctionalInterface having accept() method
	@Override
	public void accept(Integer t) {//takes input returns nothing
		System.out.print("Hello "+t+" \n");
	}
}

public class LambdaExp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(7,4,3,2,9);
		ConsumerImpl consumer = new ConsumerImpl();
		consumer.accept(8);
		list.forEach(consumer);
	}

}
