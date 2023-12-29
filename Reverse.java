
public class Reverse {
	public static void main (String[] args) {

		String chosenWord = (args[0]);
		String reveredWord = " ";
		
		for (int i = chosenWord.length()-1; i>=0; i--)
		
		reveredWord = reveredWord + chosenWord.charAt(i);

		System.out.println(reveredWord);
		System.out.println("The middle character is " + (chosenWord.charAt((chosenWord.length()/2)-1);
		//int wordIsEven = chosenWord.length()%2;
		 
		// if (wordIsEven == 0) {
		// 	 System.out.println("The middle character is " + (chosenWord.charAt((chosenWord.length())/2)-1));
		// } else {
		// 	 System.out.println("The middle character is " + (chosenWord.charAt((chosenWord.length())/2);
		 }
	}

