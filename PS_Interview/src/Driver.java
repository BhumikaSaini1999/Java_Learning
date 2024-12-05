
public class Driver extends Person{

	public Driver(String name, int age, String dob, Address address) {
		super(name, age, dob, address);
	}

	@Override
	public void doEat() {
		// TODO Auto-generated method stub
		System.out.println("Driver eating");
	}

	@Override
	public void doSleep() {
		// TODO Auto-generated method stub
		System.out.println("Driver sleeping");
	}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Driver working");
	}

	@Override
	public String toString() {
		return "Driver [name=" + name + ", age=" + age + ", dob=" + dob + ", address=" + address + "]";
	}

}
