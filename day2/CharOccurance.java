package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		char[] charArray = str.toCharArray();
		int charlength = str.length();
		for (int i = 0; i < charlength; i++) {
			if (charArray[i] == 'e') {
				count++;
			}
		}
		System.out.println("The occurence of character e is " + count);
	}

}
