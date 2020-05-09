package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test="I am a software tester";
		String[] testSplit=test.split(" ");
		for(int i=0;i<testSplit.length;i++)
		{
			if(i%2==1)
			{
				 char[] testChar=testSplit[i].toCharArray();
				 String rev="";
				 for(int j=testChar.length-1;j>=0;j--)
				 
					 rev=rev+testChar[j];
					 //System.out.println(rev);
					 testSplit[i]=rev;
				 
			}
			System.out.print(testSplit[i]+" ");
		}
		

	}

}
