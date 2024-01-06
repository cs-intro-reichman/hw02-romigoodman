
 public class InOrder {
	public static void main (String[] args) {
		// #feedback - please remove unnecessary comments before uploading.
		int random = (int) (Math.random()*10); //6
		int currentBiggest = (int)(Math.random()*10); //7


		String toBePrinted = Integer.toString(random); //6

		// #feedback - the "if" is redundant in this case. You can just have the while loop.
		if (currentBiggest < random) {
			System.out.println(random);

		} else { 
			toBePrinted = toBePrinted + " " + currentBiggest; // 6 7 
			random = (int)(Math.random()*10); //9
			// #feedback - note the indentation here.
			while (random>=currentBiggest){ // 9>=7
			 toBePrinted = toBePrinted + " " + random;//6 7 9 9
			 currentBiggest = random; //9
			 random = (int)(Math.random()*10);//3

		} 	System.out.println(toBePrinted);
		 
			}
	
	}
}
