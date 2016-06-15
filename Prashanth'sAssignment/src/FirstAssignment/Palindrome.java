package FirstAssignment;

import java.util.Scanner;

public class Palindrome 
{
	   public static void main(String args[])
	   {
	      String a, b = "";
	      Scanner palin = new Scanner(System.in);
	 
	      System.out.println("Enter a string ");
	      a = palin.nextLine();
	 
	      int length = a.length();
	      palin.close();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         b = b + a.charAt(i);
	 
	      if (a.equals(a))
	         System.out.println("It is a palindrome.");
	      else
	         System.out.println("It is not a palindrome.");
	 
	   }
	}	
