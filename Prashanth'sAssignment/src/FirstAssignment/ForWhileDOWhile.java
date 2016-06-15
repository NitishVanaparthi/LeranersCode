package FirstAssignment;

public class ForWhileDOWhile {

	public static void main(String[] args) {
		// here we are using for to print the numbers from 1 to 10

		for (int i = 1; i <= 10; i++) {
			System.out.println("i=" + i);
		}
		System.out.println("-------------------------");
		// here we are using while to print the numbers from 1 to 10

		int j = 1;
		while (j <= 10) {
			System.out.println("j=" + j);
			j++;
		}
		System.out.println("-----------------");
		// here we are using do while to print the numbers from 1 to 10
		int k = 1;
		do {
			System.out.println("k=" + k);
			k++;
		} while (k <= 10);
	}
}
