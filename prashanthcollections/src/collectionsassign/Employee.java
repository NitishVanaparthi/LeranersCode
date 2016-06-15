package collectionsassign;

public class Employee implements Comparable<Employee>{

	private String FirstName;
	private String LastName;
	private String MiddleName;
	private double Salary;
	
	public Employee(String firstName, String lastName, String middleName, double salary) {
		super();
		FirstName = firstName;
		LastName = lastName;
		MiddleName = middleName;
		Salary = salary;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	
	//@Override
	public int compareTo(Employee o) {
		return (int) (this.getSalary()-o.getSalary());
	}

	@Override
	public String toString() {
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + ", MiddleName=" + MiddleName
				+ ", Salary=" + Salary + "]";
		}
	
	

	}


