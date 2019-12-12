package miniProject.JDBCversion;

public class Employee{
	private int employeeId;
	private int salary;
	private int tollBoothId;
	
	public Employee() {
		super();
	}

	public Employee(int employeeId, int salary, int tollBoothId) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
		this.tollBoothId = tollBoothId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getTollBoothId() {
		return tollBoothId;
	}

	public void setTollBoothId(int tollBoothId) {
		this.tollBoothId = tollBoothId;
	}
	
	
}
