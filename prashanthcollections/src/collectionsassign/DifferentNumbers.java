package collectionsassign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class DifferentNumbers {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		List<Integer> list2 = new ArrayList<>();
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		
		list1.addAll(list2);
		Iterator<Integer> it = list1.iterator();
		while(it.hasNext()){
			int n = it.next();
			if(Collections.frequency(list1, n)== 1)
				System.out.println(n);
		}
	}

}
