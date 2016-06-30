
public class Demo05b 
{

	
	public static void main(String[] args)
    {
    	int num1 = 1, num2 = 9, num3 = 20;
      	displaySum(num1, num2, num3);
      	System.out.println();
		   	System.out.println("End of Program.");
    }
    //---------------------------- displaySum Method ----------------------------
		// Declare result variable. Adds the three parameters. Displays calculated 
 	// result in Console window.
    public static void displaySum(int num1, int num2, int num3)
    {
      int sumOfNum = 0;
      sumOfNum = num1 + num2 + num3;
      System.out.println("sumOfNum contains a " + sumOfNum);
    }


}
