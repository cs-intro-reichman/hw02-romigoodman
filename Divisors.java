
public class Divisors 
{
	public static void main (String[] args) 
	{
		// #feedback - note the indentation here.
	int chosenNumber = Integer.parseInt(args[0]);
	int count = 1;
	
	while (count <= chosenNumber)
	{
		int modMod = chosenNumber%count;

		if (modMod==0)
		{	
			System.out.println(count);
		}
		count = count + 1;	
	}
		
	}
}
