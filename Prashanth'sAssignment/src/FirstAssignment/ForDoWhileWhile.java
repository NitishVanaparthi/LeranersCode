package FirstAssignment;

public class ForDoWhileWhile {

	public static void main(String[] args) {
		// here we are using for to print the numbers from 10 to 1

		for (int i = 10; i >= 1; i--) {
			System.out.println("i=" + i);
		}
		System.out.println("-------------------------");
		// here we are using while to print the numbers from 10 to 1

		int j = 10;
		while (j >= 1) {
			System.out.println("j=" + j);
			j--;
		}
		System.out.println("-----------------");
		// here we are using do while to print the numbers from 10 to 1
		int k = 10;
		do {
			System.out.println("k=" + k);
			k--;
		} while (k >= 1);
	}

}
