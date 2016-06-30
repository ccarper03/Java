public class Demo05f2 
{
// “Global” variable declarations
static int numOne = 4, answer = 0;

// -------------------------- add Method -------------------------
// Declares variable with initial value. Adds variable values.
// Calls internal method.
public static void add()
{
	int numTwo = 6;                			
	answer = numOne + numTwo;                			
	display();                			
}

//---------------------- display Method --------------------------
// Displays calculated result in Console window.
private static void display()
{
	System.out.println("answer = " + answer + " (printed within display of ClassTwo)."); 	
    }
}
