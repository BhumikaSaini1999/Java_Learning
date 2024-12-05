//interface I1{
//	default boolean equals(Object o) { //can't override methods from Object class, this will give error
//		return true;
//	}
//	
//	//boolean equals(Object o);
//	
//}

@FunctionalInterface
interface I{
	boolean equals(Object o);
	
	void test();
}

public class DefaultMethods4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
