
public class Demo05c 
{

	//-------------------------- main Method ---------------------------
			// Declares variables with initial values. Calls internal method 
			// passing it three (3) arguments. Displays calculated result in the
			// Console window. Ends program.   
			public static void main(String[] args)
	    {
	      	int num1 = 1, num2 = 9, num3 = 20, sumOfNum = 0;
	      	sumOfNum = getSum(num1, num2, num3); 
	      	System.out.println("sumOfNum contains a " + sumOfNum + ".");
	      	System.out.println();
				System.out.println("End of Program.");
	    }
	    	//-------------------------- getSum Method -------------------------
			// Declares result variable. Sums the parameters. Returns the
			// calculated result to the main method.
	    public static int getSum(int num1, int num2, int num3)
	    {
	       int sumOfNum = 0;
	       sumOfNum = num1 + num2 + num3;
	       return sumOfNum;
	    }


}
