// Charles Carper
// 04.15.2014
// Chapter 12 – Program c
// Catching an Arithmetic exception


import java.util.Scanner;
public class Chap12c 
{
//-----------------------------------------------MAIN------------------------------------------------------------//
	/* this program asks the user to enter two numbers and the program divides the numbers to get the quotient. the program checks to make sure 
	 * program still runs even after a zero gets entered. when it does happen and error message will display and program will continue to run
	 */
	public static void main(String[] args) 
	{
		Scanner keyBoard = new Scanner(System.in);
		int numerator, denominator, quotient, remainder = 0;
		System.out.println("TO DETERMINE THE QUOTIENT OF TWO NUMBERS...");
		System.out.println("Enter the numerator: ");
		numerator = keyBoard.nextInt();                                     //populate  numerator
		System.out.println("Enter the Denominator:");
		denominator = keyBoard.nextInt();                                   //populate  denominator
		quotient = calcQuotient(numerator,denominator);
		remainder = calcRemainder(numerator,denominator);
		dspQuotient(numerator,denominator,quotient,remainder);
		keyBoard.close();
		System.out.println();
		System.out.println("End of Program.");
	}
	//--------------------------------------------------calcQuotient--------------------------------------------------------//
	// test out what user enters and return quotient
	public static int calcQuotient(int numerator,int denominator)
	{
		int quotient = 0;
		try
		{
			quotient = numerator / denominator;
		}
		catch(ArithmeticException errorMsg)
		{
			System.out.println("You are attempting to divide " + numerator + " by 0 ---> " + errorMsg.getMessage() + " is an illegal operation.");
			System.out.println("End of Program.");
			System.exit(1);
		}
		
		return quotient;
	}
	//------------------------------------------------calcRemainder---------------------------------------------------------//
	//return the remainder of numerator / denominator
	public static int calcRemainder(int numerator,int denominator)
	{
		
		return numerator % denominator;
	}
	//------------------------------------------------dspQuotient---------------------------------------------------------//
	// display results
	public static void dspQuotient(int numerator,int denominator,int quotient,int remainder)
	{
		System.out.println(numerator + " divided by " + denominator + " equals " + quotient + " with a remainder of " + remainder + ".");
	}
	
}

