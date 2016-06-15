package collectionsassign;

import java.util.Set;
import java.util.TreeSet;

public class StudentMain {

	public static void main(String[] args) {
		Set<Student> s = new TreeSet<>();
		Student e1 = new Student("prashanth", 1 ,"Misoouri" );
		Student e2 = new Student("reddy", 2, "Kansas");
		Student e3 = new Student("peddireddy", 3, "Irving");
		Student e4 = new Student("abhinav", 4, "Dallas");
		Student e5 = new Student("vinay", 5, "Houston");
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		s.add(e5);
		//comparable
		for (Student s1 : s) {
			System.out.println(s1);
		}
		System.out.println("----------------------------------");
		Set<Student> studentcity = new TreeSet<>(new CityComparator());
		studentcity.add(e1);
		studentcity.add(e2);
		studentcity.add(e3);
		studentcity.add(e4);
		studentcity.add(e5);
		//comparator
		for (Student i : studentcity) {
			System.out.println(i);
		

}

	}

}
