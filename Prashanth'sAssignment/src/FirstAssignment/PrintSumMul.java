package FirstAssignment;

import java.util.Scanner;

public class PrintSumMul {

	public static void main(String[] args) {
		
			System.out.println("Enter Two Numbers to Add:");
			Scanner Add = new Scanner(System.in);
			int a = Add.nextInt();
			int b = Add.nextInt();
			System.out.println(a + b);
					
		System.out.println("------------------------");
		
			System.out.println("Enter Two Numbers to Multiply:");
			Scanner Mul = new Scanner(System.in);
			int i = Mul.nextInt();
			int j = Mul.nextInt();
			System.out.println(i * j);
			Mul.close();
			Add.close();
			
		
		/*
		 * System.out.println(a+b); System.out.println(a*b); Add.close();
		 */

	}

}
