import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(5,8,2,3,4,9,13);
		
		System.out.println("--------------------------Normal Processing--------------------------");
		values.stream().forEach(i->System.out.print(i+" "));
		
		System.out.println("\n--------------------------Using Method Refrence--------------------------");
		values.stream().forEach(System.out::println);
		
		System.out.println("\n--------------------------Using Parallel Stream--------------------------");
		values.parallelStream().forEach(System.out::println); //order will be random in this case
		
		System.out.println("\n--------------------------Even values--------------------------");
		List<Integer> even = values.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		System.out.println("\n--------------------------Square of the values--------------------------");
		List<Integer> square = values.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(square);
		
		//Terminal operation in java
		System.out.println("\n------------------------Count of Even values in ArrayList---------------------");
		System.out.println(values.stream().filter(x->x%2==0).count());
		
		System.out.println("\n------------------------sort ArrayList---------------------");
		System.out.println(values.stream().sorted().collect(Collectors.toList()));//default natural sorting order
		
		System.out.println("\n------------------------sort ArrayList in descending order---------------------");
		List<Integer> descendingOrder = values.stream().sorted((a,b)->(a<b) ? 1 : (a>b) ? -1 : 0).collect(Collectors.toList());
		List<Integer> descendingOrder1 = values.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(descendingOrder);
		System.out.println(descendingOrder1);
		
		System.out.println("\n------------------------sort ArrayList in asc using Comparable interface compareTo()---------------------");
		List<Integer> ascOrder = values.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
		System.out.println(ascOrder);
		
		System.out.println("\n------------------------sort ArrayList in desc using Comparable interface compareTo()---------------------");
		List<Integer> descOrder = values.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		System.out.println(descOrder);
		
		System.out.println("\n------------------------sort ArrayList in  using Comparable interface compareTo()---------------------");
		List<Integer> descendOrder = values.stream().sorted((a,b)->-a.compareTo(b)).collect(Collectors.toList());
		System.out.println(descendOrder);
		
		//Terminal operations- min() max()
		System.out.println("\n------------------------min element in ArrayList------------------------------");
		System.out.println(values.stream().min((a,b)->a.compareTo(b)).get());
		
		System.out.println("\n------------------------max element in ArrayList------------------------------");
		System.out.println(values.stream().max((a,b)->a.compareTo(b)).get());
	}

}
