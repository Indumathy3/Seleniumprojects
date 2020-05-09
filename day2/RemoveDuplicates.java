package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] textSplit = text.split(" ");
		for (int i = 0; i < textSplit.length; i++) {
			for (int j = 0; j < textSplit.length; j++) {
				if (textSplit[i] == textSplit[j]) {
					count = count + 1;

				}

			}
		}
		if (count > 0) {
			String text1 = text.replaceAll("java", " ");
			System.out.println(text1);
		}
	}

}
