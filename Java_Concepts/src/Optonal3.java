import java.util.Optional;

public class Optonal3 {

	public static void main(String[] args) {
		//Use Optional.of(array) if you are sure the array is not null.
		//Use Optional.ofNullable(array) if the array might be null.
		
		// Initialize an array
        Integer[] array = {1, 2, 3, 4, 5};

        // Wrap the array in Optional
        Optional<Integer[]> optionalArray = Optional.of(array);

         //Use the Optional
        optionalArray.ifPresent(arr->{
        	for(int element : arr)
        		System.out.print(element+" ");
        });
        
        
        Optional<Integer[]> optionalNullArray = Optional.ofNullable(null);//Initializing null Array
        //optionalNullArray.orElseThrow(NullPointerException::new);
        
        //map() and filter()
        Optional<Integer> age = Optional.ofNullable(56);
        System.out.println("\n"+age.filter(x->x>18).get());
        System.out.println("\n"+age.map(x->x*2).get());
	}
}
