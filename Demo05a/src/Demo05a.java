
public class Demo05a 
{
			// ----------------------------- main Method ----------------------------------
			// Displays a message in the Console window. Calls an internal method.
			// Displays another message in the Console window. Ends program.

	public static void main(String[] args) 
	{
	      System.out.println("Printed in main – before call.");
	      methodOne();                                
	      System.out.println("Printed in main – after call.");
			  System.out.println();
			  System.out.println("End of Program.");
	    }
	    	//----------------------- methodOne Method -------------------------------
			 // Displays a message in the Console window. 
	   public static void methodOne()
	   {
	      System.out.println("Printed in methodOne.");
	   }


}
