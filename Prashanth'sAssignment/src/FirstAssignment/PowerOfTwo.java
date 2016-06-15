package FirstAssignment;

public class PowerOfTwo {
	private static boolean pwr(final int n) {
		if (n <= 0) {
			return false;
		}
		return (n & (n - 1)) == 0;
	}

	public static void main(String[] args) {
		int n = 16;
		if (pwr(n)) {
			System.out.println("Is power of 2");
		} else {
			System.out.println("Not power of 2");
		}
	}

}