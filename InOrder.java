
 public class InOrder {
	public static void main (String[] args) {

		int random = (int) (Math.random()*10); //6
		int currentBiggest = (int)(Math.random()*10); //7


		String toBePrinted = Integer.toString(random); //6

		if (currentBiggest < random) {
			System.out.println(random);

		} else { 
			toBePrinted = toBePrinted + " " + currentBiggest; // 6 7 
			random = (int)(Math.random()*10); //9
			while (random>=currentBiggest){ // 9>=7
			 toBePrinted = toBePrinted + " " + random;//6 7 9 9
			 currentBiggest = random; //9
			 random = (int)(Math.random()*10);//3

		} 	System.out.println(toBePrinted);
		 
			}
	
	}
}