/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		
		int boardSize = Integer.parseInt(args[0]); //10
		for (int i=1; i<=boardSize; i++) //1<10
		{
			for(int j=1; j<=boardSize; j++) //j<10
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
