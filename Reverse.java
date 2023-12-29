
public class Reverse 
{
	public static void main (String[] args) 
	{

		String chosenWord = (args[0]); //romi
		String reveredWord = "";
		
		for (int i = chosenWord.length()-1; i>=0; i--) //i=1
		{
			reveredWord = reveredWord + chosenWord.charAt(i); //imor
		}		

		System.out.println(reveredWord);

		
		if (((chosenWord.length())%2) == 0 ) //4%2==0
		{
			System.out.println("The middle character is " + (chosenWord.charAt((chosenWord.length()/2)-1))); 
		} 
		else 
		{
			System.out.println("The middle character is " + (chosenWord.charAt((chosenWord.length())/2)));
		 }
	}
}
