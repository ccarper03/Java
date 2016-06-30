
public class Demo05e 
{

	
	// --------------------------------- myMethod Method ------------------------------------
			// Calls internal methods – each with the same name. Ends program
			public static void main(String[] args)
	    {
	      	myMethod();        		// Calls myMethod passing it 0 parameters
	      	myMethod(1);       		// Calls myMethod passing it 1 parameter
	      	myMethod(1, 2);     		// Calls myMethod passing it 2 parameters      
	      	myMethod(1, 2, 3);  		// Calls myMethod passing it 3 parameters
	      	myMethod(1, 2, 3, 4);  	// Calls myMethod passing it 4 parameters   	   
				System.out.println();
		   		System.out.println("End of Program.");
			}
	   	// --------------------------------- myMethod Method ------------------------------------
	    // Displays message in Console window.
		         	public static void myMethod()
	   	{
	      	System.out.println("No arguments passed.");
	   	}
	   //--------------------------------- myMethod Method ------------------------------------
	   // Displays message in Console window.
	   public static void myMethod(int parm1)
	   {
	      System.out.println( parm1 + " passed.");
	   }
	   //--------------------------------- myMethod Method ------------------------------------
       // Displays message in Console window.
	public static void myMethod(int parm1, int parm2)
{
System.out.println(parm1 + " " + parm2 + " " + " passed.");
}
//--------------------------------- myMethod Method ------------------------------------
     // Displays message in Console window.
public static void myMethod(int parm1, int parm2, int parm3)
{
System.out.println(parm1 + " " + parm2 + " " + parm3 + " " + " passed.");
}
	//--------------------------------- myMethod Method ------------------------------------
     // Displays message in Console window.
public static void myMethod(int parm1, int parm2, int parm3, int parm4)
{
System.out.println(parm1 + " " + parm2 + " " + parm3 + " " + parm4 + " passed.");
}
}
