// Charles Carper
// 03.19.14
// Chapter 8 Test
// Using the Math.pow and Math.round methods

import java.util.Scanner;   // import the scanner utility
public class Chap08test 
{

	/* ***********************************************************************************************************
 	 * the User will enter two type double numbers								                                 *
     * the numbers will be the base number and raised number.						                             *
 	 * this program will take the base number and will raise it to the power of "n" using the input from the user*
 	 * the results will be calculated and presented to the user						                             *
	 *************************************************************************************************************/

	//----------------------------------------------Main--------------------------------------------------------------------//
	// calls getInput and prompts message
	public static void main(String[] args) 
	{
		getInput(); // call method
		System.out.println(); // Prompt message
		System.out.println("End of Program."); // Prompt message
		
	}
	//----------------------------------------------getInput--------------------------------------------------------------------//
	// gets input from the user
	public static void getInput() 
	{
		double baseNumber = 0.0, raisedNumber = 0.0 , raisedResult = 0.0;
		Scanner keyBoard = new Scanner(System.in);// scanner utility
		System.out.println("Enter a Base Number:"); //Prompt message
		baseNumber = keyBoard.nextDouble();
		System.out.println("Enter a Raised Number:"); //Prompt message
		raisedNumber = keyBoard.nextDouble();
		raisedResult = calcPower(baseNumber,raisedNumber);
		dspRaisedNumber(baseNumber,raisedNumber,raisedResult);
		keyBoard.close();   // close keyboard scanner
	}
	
	//----------------------------------------------calcPower--------------------------------------------------------------------//
	// takes the base number and powers the second number
	// returns a powered number in raisedResult 
	public static double calcPower(double baseNumber,double raisedNumber) 
	{
		  
		return Math.pow (baseNumber,raisedNumber);
	}

	//----------------------------------------------dspRaisedNumber--------------------------------------------------------------------//
	// displays results to the user
	public static void dspRaisedNumber(double baseNumber,double raisedNumber, double raisedResult)
	{
		System.out.println(baseNumber + " raised " + raisedNumber + " times equals " + raisedResult + "."); // Prompt message
		System.out.println(raisedResult + " rounded equals " + Math.round(raisedResult * 1.0 / 1.0)); // Prompt message

	}
	

}

