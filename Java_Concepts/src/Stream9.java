import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Stream9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<Integer> l1 = Arrays.asList(1,2,3,4);
		List<Integer> l2 = Arrays.asList(4,5,6,7,8);
		
		l1.stream().filter(x->!l2.contains(x)).forEach(System.out::println);
		
		
		System.out.println("---------5 Random Numbers using Supplier---------");
		Supplier<Integer> s1 = ()->{
			return new Random().nextInt(100)+1;//between 1 to 100
		};
		
		for(int i=0; i<5; i++)
			System.out.println(s1.get());
		
		System.out.println("------------FindFirst-------");
		System.out.println(Stream.of(12,7,9,10).findFirst().get());
		
		
		List<Integer> values = Arrays.asList(1,4,8,6,7);
		values.stream().forEach(System.out::println);
		
		System.out.println("-------QUESTION------");
		Optional.of(24).filter(v->v%4==0).map(v->{
			System.out.println(v);
			return v/2;
		}).filter(s->s!=0).map(s->s/6).map(s->{
			System.out.println(s);
			return s;
		}).orElseThrow(()-> new Exception("data error"));
		System.out.println("-------QUESTION------");

		
		
		System.out.println("------------------------------");
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=100; i++) {
			list.add(i);
		}
		list.stream().filter(i->{
			System.out.println("Hi "+ i);
			return true;
		});
		
//		list.stream().filter(i->{
//			System.out.println("Hi "+ i);
//			return true;
//		}).findFirst();
	}

}
