package collectionsassign;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNumbers {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		List<Integer> list2 = new ArrayList<>();
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		
		Set<Integer> list3 = new LinkedHashSet<>();
		list3.addAll(list1);
		list3.addAll(list2);
		for (Integer integer : list3) {
			System.out.println(integer);
			
		}
	}

}
