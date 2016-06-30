// Charles Carper
// 03.16.14
// Chapter 8 – Program c
// Using various methods in the String class

public class Chap08c 
{
	/* ************************************************************** *
	 *  creates two string variables, initializing them both to zero. *
	 *  String class methods are then applied to the variables.       *
	 *  uses the strLength method to get the strings length           *
	 * ************************************************************** */
	
	//----------------------------------------------Main--------------------------------------------------------------------//
	// declare variables
	// call strEqual method
	// call strEqualsIgnore method
	// call strLength method
	// display a blank line
	// print message
	
	public static void main(String[] args)
	{
		String strOne = "Mississippi";   
		String strTwo = "miSSiSSiPPi";   
		strEquals(strOne,strTwo);   
		strEqualsIgnore(strOne,strTwo);   
		strLength(strOne);   
		System.out.println();   
		System.out.println("End of Program.");   
	}
	
	//--------------------------------------------strEquals-----------------------------------------------------------------//
	// if statement, run if equivalent  
	// print message
	// else statement, run if not equivalent 
	// print message
	public static void strEquals(String strOne,String strTwo)
	{
		if(strOne.equals(strTwo))    
		{
			System.out.println("Using the equals method - " + strOne + " and " + strTwo + " are equal.");   
		}
		else    
		{
			System.out.println("Using the equals method - " + strOne + " and " + strTwo + " are not equal.");   
		}

	}
	
	//--------------------------------------------strEqualsIgnore----------------------------------------------------------//
	// if statement, run if equivalent
	// print message
	// else statement, run if not equivalent 
	// print message
	public static void strEqualsIgnore(String strOne,String strTwo)
	{
		if(strOne.equalsIgnoreCase(strTwo))  
		{
			System.out.println("Using the equalsIgnoreCase method - " + strOne + " and " + strTwo + " are equal.");  
		}
		else    
		{
			System.out.println("Using the equalsIgnoreCase method - " + strOne + " and " + strTwo + " are not equal.");   
		}

	}
	
	//----------------------------------------------strLength-------------------------------------------------------------//
	// declare variable initialize to 0
	// populate strLength with strOne.length method
	// print message
	public static void strLength(String strOne)
	{
		int strLength = 0;   
		strLength = strOne.length();   
		System.out.println("Using the length method - " + strOne + " contains " + strLength + " characters.");  
	}

	
}
