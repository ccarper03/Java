// Charles Carper
// 04.14.2014
// Chapter 12 – Program a
// Catching an Input Mismatch exception


import java.util.InputMismatchException;
import java.util.Scanner;   // import the scanner utility
public class Chap12a 
{
//-----------------------------------------------MAIN------------------------------------------------------------//
	//gets positive double type input from the user to be "squared". when the user types anything other then the correct positive number  they will get a error message. 
	public static void main(String[] args) 
	{
		Scanner keyBoard = new Scanner(System.in);
		double userInput = 0.0;
		double squared  = 0.0;
		System.out.println("Enter a positive number:");
		try 
		{
			userInput = keyBoard.nextDouble();
		}
		catch(InputMismatchException errorMsg)
		{
			System.out.println("The value you entered is not a number - it is evaluated as " + errorMsg.getMessage() +".");
			System.out.println();
			System.out.println("End of Program.");
			System.exit(1);
		}
		if (userInput>0)
		{
			squared = calcSquared(userInput);
			System.out.println(userInput + " squared is " + Math.round(squared * 100.0) / 100.0 + ".");
		}
		if (userInput<0)
		{
			System.out.println("The value you entered is a negative number. ");
		}
		if (userInput==0)
		{
		
			System.out.println("The value you entered is a zero (neither positive nor negative). ");
		}
		keyBoard.close();   
		System.out.println();
		System.out.println("End of Program.");
		
	}
//-----------------------------------------------calcSquared------------------------------------------------------------//
	public static Double calcSquared(double userInput)
	{
		return userInput * userInput;	
	}
}