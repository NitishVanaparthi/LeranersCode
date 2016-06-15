package collectionsassign;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<>();
		Employee e1 = new Employee("Prashanth", "A", "B", 11111);
		Employee e2 = new Employee("Reddy", "B", "C", 22222);
		Employee e3 = new Employee("Peddireddy", "D", "E", 33333);
		Employee e4 = new Employee("Sreeeee", "E", "F", 444444);
		Employee e5 = new Employee("Dhariiiii", "G", "H", 555555);
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
		employee.add(e5);
		//Sort by Salary
		Collections.sort(employee);
		for (Employee employee2 : employee) {
			System.out.println(employee2);		
			
		}
		System.out.println("------------------------------------------------------");
		//Sort by First Name
		Collections.sort(employee, new FirstNameComparator());
		for (Employee employee2 : employee) {
			System.out.println(employee2);
			
		}
		System.out.println("-------------------------------------------------------");
		//Sort by salary in reverse order
		Collections.sort(employee, new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return (int) (o2.getSalary() - o1.getSalary());
			}
		});
		for (Employee employee2 : employee) {
			System.out.println(employee2);
			
		}
	}

}
