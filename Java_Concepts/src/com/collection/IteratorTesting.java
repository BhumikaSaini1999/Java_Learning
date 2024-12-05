package com.collection;

public class IteratorTesting{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OurGenericList<Integer> list = new OurGenericList<>();
		list.add(34);
		list.add(10);
		list.add(61);
		
		//we can't iterate over list here, reason being is we don't have access to array items[] as its private
		//if we make it public it violates encapsulation mechanism
		//also main reason is OurGenericList not Iterable
		
//		Iterator<Integer> iterator = list.iterator();
//		while(iterator.hasNext())
//			System.out.println(iterator.next());
		
		for(Object x : list)//if a class implements Iterable then we can use enhanced for loop
			System.out.println(x);
	}

}
