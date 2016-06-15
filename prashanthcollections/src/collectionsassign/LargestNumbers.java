package collectionsassign;

import java.util.ArrayList;
import java.util.List;

public class LargestNumbers {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(80);
		list.add(5);
		list.add(2);
		int largestNum = 0;
		for(int i =0; i < list.size();i++){
			int n = list.get(i);
			
			if(n > largestNum)
				largestNum = n;
		}
		System.out.println(largestNum);
	}

}
