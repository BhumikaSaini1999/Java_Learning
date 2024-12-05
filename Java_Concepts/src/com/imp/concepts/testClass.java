package com.imp.concepts;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

@FunctionalInterface
interface Addition{
	int sum(int a, int b);
}

public class testClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Addition obj = (a,b)->{return a+b;};
		//System.out.println(obj.sum(7, 8));
		
		//BiFunction<String,String,Boolean> compStr = (a,b)->a.equals(b);
		//System.out.println(compStr.apply("good", "good"));
		
//		Optional.of(24).filter(v->v%4==0).map(v->{
//			System.out.println(v);
//			return v/2;
//		}).filter(s->s!=0).map(s->s/6).map(s->{
//			System.out.println(s);
//			return s;
//		}).orElseThrow(()-> new Exception("data error"));
		
		IntStream.of(1,1,3,3,7,6,7).distinct().parallel().map(i->i*2).sequential().forEach(System.out::println);
	}

}
