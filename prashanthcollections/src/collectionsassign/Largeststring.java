package collectionsassign;

import java.util.ArrayList;
import java.util.List;

public class Largeststring {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("Prashanth");
		strings.add("Peddireddy");
		strings.add("Sreedhari");
		strings.add("Vinay");
		strings.add("Missouri");
		for (String string : strings) {
			System.out.println(string);
		}

		int longest = 0;
		String longestString = null;
		for (int i = 0; i < strings.size(); i++) {
			String s1 = strings.get(i);
			int length = s1.length();
			if (longest < length) {
				longestString = s1;
				longest = length;
			}
		}
		System.out.println("The longest string from the above is " +longestString);
	}
	}


