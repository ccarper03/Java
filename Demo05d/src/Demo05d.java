
public class Demo05d 
{

	
	// -------------------------- main Method ---------------------------
			// Declares variables with initial values. Calls internal method 
			// passing it three (3) arguments. Displays calculated result in the
			// Console window. Ends program.   
			public static void main(String[] args)
	   	{
	      	int num1 = 1, num2 = 9, num3 = 20;
	      	System.out.println("The sum is " + getSum(num1, num2, num3) + ".");
	      	System.out.println();
				System.out.println("End of Program.");
	   	}
	   	// -------------------------- getSum Method -------------------------
			// Sums the three parameters within the return statement itself.
	   	public static int getSum(int num1, int num2, int num3)
	   	{
				return num1 + num2 + num3;
		   	}

}
