package FirstAssignment;
//here i used Array  package classes
import java.util.Arrays;

public class Array {

	public static Integer[] y = { 10, 11, 12, 18, 19, 25 };

	public static void main(String[] args) {
		Integer x = new Integer(19);
//asList returns a fixed size list so here i used this method
		//contains here it returns true if the array contains list of values 
		//here we can use this program like by using the for (int i=0; i<arraysize.length,i++)
		boolean b = Arrays.asList(y).contains(x);
		System.out.println(b);
	}
}
