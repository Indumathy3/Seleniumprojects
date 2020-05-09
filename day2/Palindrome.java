package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String s1 = "madam";
		String rev = "";
		int arraylength = s1.length();

		for (int i = arraylength - 1; i >= 0; i--) {

			rev = rev + s1.charAt(i);
		}
		if (s1.equals(rev)) {
			System.out.println("The word " + s1 + " is a palindrome");
		} else
			System.out.println("The word " + s1 + " is not a palindrome");

	}

}
