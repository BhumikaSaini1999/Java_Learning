import java.util.Optional;

public class Optional2 {

	public static void main(String[] args) {
		//isPresent()
		Optional<String> op = Optional.ofNullable("Bhumika");
		System.out.println(op.isPresent());
		
		//ifPresent(), ifPresentOrElse()
		Optional<String> op1 = Optional.ofNullable("Bhumika");
		op1.ifPresent(s->System.out.println(s+" Saini")); //if value is Present then it will use the supplied consumer
		
		op1=Optional.empty();
		op1.ifPresentOrElse(x->System.out.println(x+" "+"Saini"), ()->System.out.println("No value is present"));
		
		//or(), orElse(), orElseGet(), orElseThrow()
		System.out.println(op1.or(()->Optional.of("Hello There!!")));
		System.out.println(op1.orElse("I love my India"));
		System.out.println(op1.orElseGet(()->"Yash"));
		System.out.println(op1.orElseThrow(NullPointerException :: new));
	}

}
