package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNum = 0;
		int secNum = 0;
		for (int i = 0; i < 8; i++) {
			System.out.println(firstNum);
			int sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			firstNum++;
		}

	}

}
