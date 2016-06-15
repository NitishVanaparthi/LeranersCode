package FirstAssignment;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		//String a="Prashanth";
	    //String b="";
		//int temp;
System.out.println("Enter A String");
Scanner scan=new Scanner(System.in);
String a =scan.nextLine();
String b=scan.next();
scan.close();
	    for(int i=a.length()-1;i>=0;i--){
	        b=b+a.charAt(i);
	    }

	    System.out.println("Reverse:"+a);	
	
	}}
	 