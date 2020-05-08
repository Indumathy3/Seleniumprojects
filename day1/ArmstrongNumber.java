package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153;
		int calculated = 0;
		int remainder;
		int original;
		original = num;
		while (num > 0) {
			remainder = num % 10;
			int quotient = num / 10;
			num = quotient;
			calculated = calculated + (remainder * remainder * remainder);

		}
		if (original == calculated) {
			System.out.println("The given number is Armstrong");
		} else {
			System.out.println("The given number is not Armstrong");
		}

	}

}
