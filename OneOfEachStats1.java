

public class OneOfEachStats1
{
	public static void main (String[] args) 
    {
    int numberOfExperiments = Integer.parseInt(args[0]); 
    int i=1;
    String toBePrinted = "";
     int numberOfChildren = 0;
             int fourOrMore = 0;
             int twoChildren = 0;
             int threeChildren = 0;
             String mostCommon ="";
             int total = 0;


	while (i<=numberOfExperiments) 
    {    
        numberOfChildren = 0;    
        double randomBoyOrGirl = Math.random(); 
        boolean isGirl = (randomBoyOrGirl>=0.5); 
        
        if (isGirl) 
        {
           
            numberOfChildren = numberOfChildren +1; 

            while (isGirl) 
            {
            randomBoyOrGirl = Math.random(); 
            isGirl=(randomBoyOrGirl>=0.5); 
            numberOfChildren = numberOfChildren +1; 
            }
        
        }
        
        else
        {   
            numberOfChildren = numberOfChildren+1;

            while (!isGirl) 
            {
            randomBoyOrGirl = Math.random(); 
            isGirl=(randomBoyOrGirl>=0.5); 
            numberOfChildren = numberOfChildren + 1;  
            }
        }
        total = total+numberOfChildren;

        if(numberOfChildren>=4) 
            {
            fourOrMore++;
            } 
        else if (numberOfChildren==3) 
            {
            threeChildren++; //3
            }
        else if (numberOfChildren==2) 
            {
            twoChildren++; 
            } 

        i++;
    }			
	     


		if(fourOrMore>threeChildren && fourOrMore>twoChildren)
		{
			 mostCommon= "4 or more" ;
		}
		else if(threeChildren>fourOrMore && threeChildren>twoChildren)
		{
			 mostCommon="3";
		}
		else if(twoChildren>fourOrMore && twoChildren>threeChildren)
		{
			mostCommon="2";
		}
	

	int averageNumber = total/numberOfExperiments;

	System.out.println("Average: " + averageNumber + " children to get at least one of each gender.");
	System.out.println("Number of families with 2 children: " + twoChildren);
	System.out.println("Number of families with 3 children: " + threeChildren );
	System.out.println("Number of families with 4 or more children: "+ fourOrMore );
	System.out.println("The most common number of children is " + mostCommon);
	}
}
