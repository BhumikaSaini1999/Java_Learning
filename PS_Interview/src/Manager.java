
public class Manager extends Person{

	public Manager(String name, int age, String dob, Address address) {
		super(name, age, dob, address);
	}

	@Override
	public void doEat() {
		// TODO Auto-generated method stub
		System.out.println("Manager eating");
	}

	@Override
	public void doSleep() {
		// TODO Auto-generated method stub
		System.out.println("Manager sleeping");
	}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Manager working");
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", age=" + age + ", dob=" + dob + ", address=" + address + "]";
	}

}
