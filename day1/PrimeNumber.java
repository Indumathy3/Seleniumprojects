package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		for (int i = 2; i <= input / 2;) {
			if (input % 2 == 0) {
				flag = true;
			} else
				flag = false;
			break;

		}
		if (flag == false) {
			System.out.println("The given number is a prime number");
		} else {
			System.out.println("The given number is not a prime number");
		}

	}
}