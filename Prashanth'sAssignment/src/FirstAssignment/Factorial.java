package FirstAssignment;

import java.util.Scanner;

public class Factorial {
	static int fact(int n) {
		int result;
		if (n == 1) {
			return 1;
		}
		result = fact(n - 1) * n;
		return result;
	}

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = a.nextInt();
		int factorial = fact(num);
		System.out.println("Factorial of entered number is: " + factorial);
		a.close();
	}

}
