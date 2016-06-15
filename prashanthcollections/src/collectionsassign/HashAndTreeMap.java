package collectionsassign;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashAndTreeMap {

	public static void main(String[] args) {

		Map<Student, Integer> students = new HashMap<Student, Integer>();

		Student student1 = new Student("Prashanth", 111, "Lewisville");
		Student student2 = new Student("Reddy", 222, "Missouri");
		Student student3 = new Student("Peddireddy", 333, "Kansas");

		students.put(student1, 44);
		students.put(student2, 55);
		students.put(student3, 66);

		for (Map.Entry<Student, Integer> entry : students.entrySet()) {
			System.out.println(entry.getKey() + " is " + entry.getValue());
		}

		System.out.println("----------------");

		students.put(student1, 88);// duplicate key added

		for (Map.Entry<Student, Integer> entry : students.entrySet()) {
			System.out.println(entry.getKey() + " is " + entry.getValue());
		}
		System.out.println("-------------------------");
		// Tree Map
		Map<Student, Integer> treemapdemo = new TreeMap<>();
		Student student4 = new Student("Prashanth", 111, "Lewisville");
		Student student5 = new Student("Reddy", 222, "Missouri");
		Student student6 = new Student("Peddireddy", 333, "Kansas");

		treemapdemo.put(student4, 87);
		treemapdemo.put(student5, 86);
		treemapdemo.put(student6, 85);

		System.out.println("Sorted Treemap:");
		for (Map.Entry<Student, Integer> entry : treemapdemo.entrySet()) {
			System.out.println(entry.getKey() + " is " + entry.getValue());

		}

	}
}
