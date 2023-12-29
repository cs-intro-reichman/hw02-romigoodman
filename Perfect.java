
public class Perfect 
{
	public static void main (String[] args) 
	{
		
		int isPerfect = Integer.parseInt(args[0]); //6
		int sumOfDevisions = 0; 
		String toBePrinted = "";
		String finelPrint = "";
		
		for (int i = 1; i<isPerfect; i++) //1<6
		{
		if (isPerfect%i==0)
		{
			sumOfDevisions = sumOfDevisions + i; //1
			toBePrinted = toBePrinted + (i) + " + "; //1 
		}
		}
		int length = toBePrinted.length();
		if (toBePrinted.charAt(length-2) == 43){
			finelPrint = toBePrinted.substring(0,length-2);
		}

			if (isPerfect==sumOfDevisions) 
			{
			System.out.println( isPerfect + " is a perfect number since " + isPerfect + " = " + finelPrint );
			}
				else 
				{
				System.out.println( isPerfect + " is not a perfect number");
				}
	} 	
}

