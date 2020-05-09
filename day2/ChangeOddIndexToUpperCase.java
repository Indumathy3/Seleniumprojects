package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] testarray = test.toCharArray();
		 for (int i = 0; i < testarray.length; i++) {
			 
			 if(i%2==1)
			 {
				 testarray[i] =Character.toUpperCase(testarray[i]);
			 }
			
		}
		 System.out.println(testarray);

	}

}
