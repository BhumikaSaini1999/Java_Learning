import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(3, 6, 5, 7, 8, 1, 9);

		// flatMap()
		List<List<Integer>> listOfList = List.of(List.of(3, 6, 5, 7, 8, 1, 9), List.of(5, 2, 3, 10, 17, 24));
		List<Integer> ans = listOfList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(ans);

		// reduce() - Terminal 
		List<Integer> list2 = Arrays.asList(5, 2, 3, 10, 17, 24);
		int sum = list2.stream().filter(x -> x % 2 == 0).reduce(0, (temp, i) -> i + temp);
		System.out.println(sum);
		System.out.println( list2.stream().filter(x -> x % 2 == 0).reduce(0, (temp, i) -> i + temp));

		Emplyee emp1 = new Emplyee(101, "Ram", 10000, "IT");
		Emplyee emp2 = new Emplyee(102, "Shyam", 30000, "Sales");
		Emplyee emp3 = new Emplyee(103, "Kanika", 45000, "CSE");
		Emplyee emp4 = new Emplyee(104, "Nitin", 5000, "CSE");
		Emplyee emp5 = new Emplyee(105, "Komal", 87000, "IT");
		Emplyee emp6 = new Emplyee(106, "Mehak", 57000, "Sales");
		Emplyee emp7 = new Emplyee(107, "Bhumika", 32000, "CSE");
		Emplyee emp8 = new Emplyee(108, "Mehak", 95000, "Sales");

		// groupingBy()
		List<Emplyee> employees = List.of(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8);
		employees.stream().filter(emp -> emp.getSalary() > 30000).collect(Collectors.groupingBy(emp -> emp.dpt))
				.entrySet().forEach(emp -> System.out.println(emp));

		employees.stream().filter(emp -> emp.getSalary() > 30000)
				.collect(Collectors.groupingBy(emp -> emp.dpt, Collectors.groupingBy(emp -> emp.getName()))).entrySet()
				.forEach(emp -> System.out.println(emp));

		// chars()
		String s = "neeraj saini";
		s.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(ch -> ch, Collectors.counting())).entrySet()
				.forEach(System.out::println);
		// System.out.println(s.chars().map(x->(char)x).count());

		// [11.3,45.6,77,10.1,3]
		double[] doubleArr = { 11.3, 45.6, 77, 10.1, 3 };
		// System.out.println(Arrays.stream(doubleArr).sum());
		System.out.println(Arrays.stream(doubleArr).mapToInt(x -> (int) x).sum());// 146
		System.out.println(Arrays.stream(doubleArr).filter(x -> x % 1 == 0).sum());// 80

		// give third maximum from the list
		//skip()
		List<Integer> list = List.of(3, 1, 6, 2, 10, 8, 13);
		System.out.println(list.stream().sorted((a, b) -> -a.compareTo(b)).skip(2).findFirst().get());

		// distinct()
		List<Integer> l = List.of(5, 2, 3, 1, 2, 3, 4, 5, 5, 6, 7, 8);
		l.stream().distinct().collect(Collectors.toList()).forEach(a -> System.out.print(a + " "));

		// peek() for debugging
		Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
				.peek(e -> System.out.println("\nFiltered value: " + e)).map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());

		// peek()->if we want to change the inner state of an element
		Stream.of(new Emplyee(101, "Ram", 10000, "IT"), new Emplyee(102, "Bhumika", 40000, "IT"))
				.peek(emp -> emp.setName(emp.getName().toUpperCase())).collect(Collectors.toList())
				.forEach(x -> System.out.println(x));

		// map()
		Stream.of(new Emplyee(101, "Ram", 10000, "IT"), new Emplyee(102, "Bhumika", 40000, "IT")).map(emp -> {
			emp.setName(emp.getName().toUpperCase());
			return emp;
		}).collect(Collectors.toList()).forEach(x -> System.out.println(x));
		
		
		//limit()
		Stream.of("one", "two", "three", "four").limit(3).forEach(System.out::println);
		
		//anyMatch(), allMatch() - Terminal
		System.out.println(Stream.of(2,1,3,4,8,9,6).anyMatch(n->n>3));
		System.out.println(Stream.of(2,1,3,4,8,9,6).allMatch(n->n>0));
		
		//min() max() - Terminal
		System.out.println(Stream.of(12,10,3,4,8,9,6).min((a,b)->Integer.compare(a, b)).get());
		System.out.println(Stream.of(12,10,3,4,8,9,6).max((a,b)->Integer.compare(a, b)).get());
	}

}
