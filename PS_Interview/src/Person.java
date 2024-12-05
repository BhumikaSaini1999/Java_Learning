
abstract class Person {
	String name;
	int age;
	String dob;
	Address address;
	
	public Person(String name, int age, String dob, Address address) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.address = address;
	}
	
	public abstract void doEat();
	public abstract void doSleep();
	public abstract void doWork();
}
