import java.util.Date;
import java.util.Optional;

public class Optional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialization 1: Empty Optional
		Optional<Integer> op1 = Optional.empty();
		System.out.println(op1);
		System.out.println(op1.orElseGet(()->5)); //if value is not present in Optional this method will take the supplier and returns the value in orElseGet() 
		
		Optional<Date> op2 = Optional.empty();
		System.out.println(op2.orElseGet(()-> new Date()));
		
		
		Optional<Integer> op3 = Optional.empty();
		//The Optional.or() method in Java is used to provide an alternative Optional if the current Optional is empty. 
		//This method takes a supplier that returns an Optional
		System.out.println(op3.or(()->Optional.of(8)));
		//System.out.println(op3.orElseThrow(NullPointerException :: new)); //it will throw the specified exception if value not present
		
		//Initialization 2: use when you sure value is not null. otherwise it will throw NPE
		Optional<String> op4 = Optional.of("Bhumika");
	    System.out.println(op4.get()); //return the value
	    
	    //op4=Optional.of(null); //throwing NPE
	    //System.out.println(op4);
	    
	    //Initialization 3: use when value may be null or not. its to avoid NPE
	    op4=Optional.ofNullable(null);
	    System.out.println(op4);
	}

}