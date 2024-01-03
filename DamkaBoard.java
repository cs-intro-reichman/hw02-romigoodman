
public class DamkaBoard 
{
	public static void main(String[] args) 
	{
		
		int boardSize = Integer.parseInt(args[0]); 
		for (int i=1; i<=boardSize; i++) 
		{
			for(int j=1; j<=boardSize; j++) 
			{
				if (i%2==0)
				{
					System.out.print(" *");	
				}
				else 
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
