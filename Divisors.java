
public class Divisors 
{
	public static void main (String[] args) 
	{
		
	int chosenNumber = Integer.parseInt(args[0]);
	int count = 1;
	
	while (count <= chosenNumber); 
	{
		if (chosenNumber%count==0)
		{	
			System.out.println(count);
		}
		count = count + 1;	
	}
		
	}
}