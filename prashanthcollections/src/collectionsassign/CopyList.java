package collectionsassign;

import java.util.LinkedList;//imported Java Classes
import java.util.List;//Imported Java classes

public class CopyList {

	public static void main(String[] args) {
		List<Integer> num = new LinkedList<>();
		num.add(5);
		num.add(4);
		num.add(3);
		num.add(2);
		num.add(1);
		num.add(0);
		System.out.println("Original ");
		System.out.println(num);
		List<Integer> num1 = new LinkedList<>(num);
		System.out.println("COPY");
		System.out.println(num1);
	}

}
