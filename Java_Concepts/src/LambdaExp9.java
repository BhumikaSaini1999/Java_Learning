import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int empId;
	String empName;
	int empSalary;
	
	public Employee(int empId, String empName, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
}
public class LambdaExp9 {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(101,"Bhumika",10000), new Employee(102,"Nitish",20000), new Employee(103,"Kashish",8000));
		
		//sort employees according to increasing order of salary
		List<Employee> sortedEmpList = empList.stream().sorted((a,b)->{
			if(a.empSalary<b.empSalary)
				return -1;
			else if(a.empSalary>b.empSalary)
				return 1;
			else
				return 0;
		}).collect(Collectors.toList());
		System.out.println(sortedEmpList);
		
		
		//Using Collections.sort() 
		Collections.sort(empList, (a,b)->a.empName.compareTo(b.empName));
		System.out.println(empList);
	}
}