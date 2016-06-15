package FirstAssignment;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		int temp;
		boolean Primenumber = true;
		System.out.println("Enter a number for check:");
		Scanner prime = new Scanner(System.in);
		int a = prime.nextInt();
			
		for (int i = 2; i <= a / 2; i++) {
			temp = a % i;
			prime.close();
						 if (temp == 0) {
				Primenumber = false;
				break;
			}
						 		}
		if (Primenumber)
			System.out.println(a + " is Prime Number");
		else if (a==1)
			System.out.println(a + " is not a prime number ");
		else
			System.out.println(a + " is not Prime Number");
	}

}
