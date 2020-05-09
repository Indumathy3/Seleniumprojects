package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		String s1 = "feeling good";
		char[] chararray = s1.toCharArray();

		int arraylength = s1.length();

		for (int i = arraylength - 1; i >= 0; i--) {

			System.out.print(chararray[i]);
		}

	}

}
