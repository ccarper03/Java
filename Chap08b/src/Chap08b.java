// Charles Carper	
// 03.12.14
// Chapter 8 – Program b
// Using the Math.PI method in the Math class

import java.util.Scanner;   // import the scanner utility
public class Chap08b    // class Chap08b
{
	/* *********************************************************************************** *
	 * Program has user enter a type double number that represents the radius of a circle. *
	 * program calculates area using the users input                                       *
	 * results are displayed for the user to see                                           *
	 * program continues until user terminates program by hitting zero                     *
	 * *********************************************************************************** */
	
	//----------------------------------------------Main--------------------------------------------------------------------//
	// calls the getInput method
	// displays a blank line
	// displays message 
	public static void main(String[] args) 
	{
		getInput();  
		System.out.println();   
		System.out.println("End of Program.");    

	}
	
	//----------------------------------------------getInput--------------------------------------------------------------------//
	// declare userInput, area type double initialized to 0.0
	// declare the scanner to accept input from the keyboard
	// displays message
	// populates userInput with the double type numbers that the user inserted 
	// while loop till user inserts a digit 0
	// Calls calcareaRoot method passing userInput, area.
	// Calls dspArea method passing userInput, calcArea. 
	// displays message
	// populate the variable userInput with the number that the user entered
	// close keyboard scanner
	public static void getInput() 
	{
		double userInput = 0.0, area = 0.0;  
		Scanner keyBoard = new Scanner(System.in);    
		System.out.println("Enter the radius of a circle  -Or-  Enter a 0 to End Program:");   
		userInput = keyBoard.nextDouble();  
		while(userInput > 0)    
		{
			calcArea(userInput,area);   
			dspArea(userInput, calcArea(userInput,calcArea(userInput,area)));  
			System.out.println("Enter a number to find its Square Root  -Or-  Enter a 0 to End Program:");  
			userInput = keyBoard.nextDouble();  
		}
		keyBoard.close();   
	}
	
	//----------------------------------------------calcArea--------------------------------------------------------------------//
	// populates area with method Math.PI multiplied by UserInput multiplied by userInput 
	// return area
	public static double calcArea(double userInput,double area)
	{
		area = Math.PI * userInput * userInput;    
		return area;
	}
	
	//----------------------------------------------dspArea--------------------------------------------------------------------//
	// display message using the math.round method to round userInput and area to the 2nd decimal place.
	// displays a blank line
	public static void dspArea(double userInput,double area)
	{
		System.out.println("A circle with the radius of " + Math.round(userInput* 100.0) / 100.0 + " is " + Math.round(area* 100.0) / 100.0  + ".");   
		System.out.println();   
	}
}
