package week1.day1;

public class SumofDigits {

public static void main(String[] args) {
		int sum=0;
		int number=123;
		while(number>0)
			{
			int remainder =number%10;
			//System.out.println(remainder);
            sum = remainder + sum;
            //System.out.println(sum);
             number = number / 10;
            //System.out.println(number);
            }
		System.out.println(sum);
            
	}

}
	
