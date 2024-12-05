class Emplyee{
	int id;
	String name;
	int salary;
	String dpt;

	public Emplyee(int id, String name, int salary, String dpt) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dpt = dpt;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setDpt(String dpt) {
		this.dpt = dpt;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public String getDpt() {
		return dpt;
	}

	@Override
	public String toString() {
		return "Emplyee [id=" + id + ", name=" + name + ", salary=" + salary + ", dpt=" + dpt + "]";
	}
	
}