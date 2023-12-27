
public class Divisors 
{
	public static void main (String[] args) 
	{
		
	int chosenNumber = Integer.parseInt(args[0]);
	int count = 1;
	int modulus = 0;
	
	while (count <= chosenNumber); 
	{
		modulus = chosenNumber%count;
		if (modulus==0)
		{	
			System.out.println(modulus);
		}
		count = count + 1;	
	}
		
	}
}