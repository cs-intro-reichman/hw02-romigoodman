

public class OneOfEach 
{
	public static void main (String[] args) 
	{
		
		String toBePrinted = "";
		double randomBoyOrGirl = Math.random();
		boolean isGirl = (randomBoyOrGirl>=0.5);
		int numberOfChildren = 0;

		// #feedback - using 2 while loops is not needed here. You can just run on a single while loop until you get at least one boy and at least one girl.
		// This will reduce the complexity of the code.
		if (isGirl)
		{
			toBePrinted = (toBePrinted + "g ");
			numberOfChildren = numberOfChildren +1;

			while (isGirl)
			{
			randomBoyOrGirl = Math.random();
			isGirl=(randomBoyOrGirl>=0.5);
			numberOfChildren = numberOfChildren +1;	
			if (isGirl)
			{
			toBePrinted = (toBePrinted + "g ");
			}
			else
			{
			toBePrinted = (toBePrinted + "b ");
			}
			}
		}
		
		else
		{	
			toBePrinted = (toBePrinted + "b ");
			numberOfChildren = numberOfChildren+1;
			while (!isGirl)
			{
			randomBoyOrGirl = Math.random();
			isGirl=(randomBoyOrGirl>=0.5);
			numberOfChildren = numberOfChildren + 1;	
			if (!isGirl)
			{
				toBePrinted = (toBePrinted + "b ");
			}
			else
			{
				toBePrinted = (toBePrinted + "g ");
			}
			}
		}
		System.out.println(toBePrinted);
		System.out.println("You made it... and you now have "+ numberOfChildren +" children.");
	}
}
