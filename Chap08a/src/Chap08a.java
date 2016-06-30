// Charles Carper	
// 03.12.14
// Chapter 8 – Program a
// Using the Math.sqrt method in the Math class

import java.util.Scanner;   // import the scanner utility
public class Chap08a    // class Chap08a
{

	/* ****************************************************************************************************** *
	 * program will prompts the user to type a double number                                                  * 
	 * The program will take the number and find the square root of it and will display back to the user      *
	 * the result rounded to the 2nd decimal place. when the user if complete they can type the 0 key to exit *
	 * ****************************************************************************************************** */
	
	//----------------------------------------------Main--------------------------------------------------------------------//
	// calls the getInput method
    // displays a  blank line
	// displays End of Program.
	public static void main(String[] args) 
	{
		getInput();  
		System.out.println();  
		System.out.println("End of Program.");    

	}
	
	//---------------------------------------------getInput------------------------------------------------------------------//
	// declare variables type double number and initialized them to 0.0
	// declare the scanner to accept input from the keyboard
	// displays message
	// populates userInput with the type double numbers that the user inserted 
	// while loop until user inserts a digit 0  
	// Calls calcSquareRoot method passing userInput + squareRoot. 
	// Calls dspSquareRoot method passing userInput + calcSquareRoot. 
	// displays message
	// populate the variable userInput with the number that the user entered
	// close keyboard scanner
	public static void getInput()
	{
		double userInput = 0.0, squareRoot = 0.0;   
		Scanner keyBoard = new Scanner(System.in);  
		System.out.println("Enter a number to find its Square Root  -Or-  Enter a 0 to End Program:");   
		userInput = keyBoard.nextDouble();   
		while(userInput > 0)   
		{
			calcSquareRoot(userInput,squareRoot);   
			dspSquareRoot(userInput, calcSquareRoot(userInput,squareRoot));
			System.out.println("Enter a number to find its Square Root  -Or-  Enter a 0 to End Program:");  
			userInput = keyBoard.nextDouble();   
		}
		keyBoard.close();   
	}
	
	
	//--------------------------------------calcSquareRoot------------------------------------------------------//
	// populate squareRoot with Math.sqrt(userInput) method
    // returns squareRoot
	public static double calcSquareRoot(double userInput,double squareRoot)
	{
		squareRoot = Math.sqrt (userInput);  
		return squareRoot;   
	}
	
	//--------------------------------------dspSquareRoot------------------------------------------------------//
	// displays message and rounds the calcSquareRoot 2 decimal places.
	// displays a blank line 
	public static void dspSquareRoot(double squareRoot,double calcSquareRoot)
	{
		System.out.println("The Square root of " + Math.round(squareRoot) + " is " + Math.round(calcSquareRoot * 100.0) / 100.0  + ".");   
		System.out.println();  
	}
	
	
}

