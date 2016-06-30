// Charles Carper
// 05.04.2014
// Introduction to Programming Final
// Processing menu options

import java.util.Scanner;
public class FinalExam 
{
	static Scanner keyBoard = new Scanner(System.in);
	static int firstNumber = 0;
	static int SecondNumber = 0;

	//---------------------------------------------------------------Main Method()-----------------------------------------------------------------------------------------//
	/*This is a menu program, the user will enter a number between 1-6. A 0 WILL END THE PROGRAM AND ANY OTHER NUMBER BELOW OR ABOVE 0-6 WILL GET A PROMPT ON WHAT TO DO NEXT.*/
	public static void main(String[] args) 
	{
		int menuOptionNumber = 0;
		String endProgram = "End of Program.";
		String finalComplete = "Java Final Exam Complete.";
		
		System.out.println("Enter a Menu Option     -OR-     Enter 0 to End Program:");
		System.out.println("1. Square a Number");
		System.out.println("2. Cube a Number");
		System.out.println("3. Add Two Numbers");
		System.out.println("4. Subtract Two Numbers");
		System.out.println("5. Multiply Two Numbers");
		System.out.println("6. Divide Two Numbers");

		menuOptionNumber = keyBoard.nextInt(); 
		System.out.println();
		while(menuOptionNumber!= 0)
		{
			if(menuOptionNumber == 1)
			{
				optionOne(firstNumber);
				System.out.println();
			}
			
			if(menuOptionNumber == 2)
			{
				optionTwo(firstNumber);
			}
			
			if(menuOptionNumber == 3)
			{
				optionThree(firstNumber,SecondNumber);
			}
			
			if(menuOptionNumber == 4)
			{
				optionFour(firstNumber,SecondNumber);
			}
			
			if(menuOptionNumber == 5)
			{
				optionFive(firstNumber,SecondNumber);
			}
			
			if(menuOptionNumber == 6)
			{
				optionSix(firstNumber,SecondNumber);
			}
			
			if(menuOptionNumber < 0 || menuOptionNumber > 6)
			{
				System.out.println("INVALID OPTION - PLEASE TRY AGAIN.");
			}
			System.out.println();
			System.out.println("Enter a Menu Option     -OR-     Enter 0 to End Program:");
			System.out.println("1. Square a Number");
			System.out.println("2. Cube a Number");
			System.out.println("3. Add Two Numbers");
			System.out.println("4. Subtract Two Numbers");
			System.out.println("5. Multiply Two Numbers");
			System.out.println("6. Divide Two Numbers");
			
			menuOptionNumber = keyBoard.nextInt(); 
			System.out.println();
		}
		EndOfProgram.endProgram(endProgram,finalComplete);
		
	}
	//---------------------------------------------------------------optionOne Method()-----------------------------------------------------------------------------------------//
    /* THIS METHOD SQUARES THE USERS NUMBER THEY ENTER AND DISPLAYS THE RESULTS*/
	public static void optionOne(int firstNumber)
	{
		System.out.println("Enter the number you would like Squared:");
		firstNumber = keyBoard.nextInt();
		int squaredResult = 0;
		squaredResult = firstNumber * firstNumber;
		System.out.println(firstNumber + " squared is " + squaredResult + ".");
	}
	//---------------------------------------------------------------optionTwo Method()-----------------------------------------------------------------------------------------//
	/* THIS METHOD CUBES THE USER'S NUMBER THEY ENTERED AND DISPLAYS THE RESULTS*/
	public static void optionTwo(int firstNumber)
	{
		System.out.println("Enter the number you would like cubed:");
		firstNumber = keyBoard.nextInt();
		int cubedResult = 0;
		cubedResult = firstNumber * firstNumber * firstNumber;
		System.out.println(firstNumber + " cubed is " + cubedResult + ".");
	}
	//---------------------------------------------------------------optionThree Method()-----------------------------------------------------------------------------------------//
	/* THIS METHOD ADDS THE USER'S NUMBERS THEY ENTERED AND DISPLAYS THE RESULTS*/
	public static void optionThree(int firstNumber,int SecondNumber )
	{
		System.out.println("Enter the two numbers you would like to add:");
		firstNumber = keyBoard.nextInt();
		SecondNumber = keyBoard.nextInt();
		int additionResult = 0;
		additionResult = firstNumber + SecondNumber;
		System.out.println("Addition ---> " + firstNumber + " + " + SecondNumber + " = " +  additionResult + ".");
	}	
	//---------------------------------------------------------------optionFour Method()-----------------------------------------------------------------------------------------//
	/* THIS METHOD SUBTRACTS THE USER'S NUMBERS THEY ENTERED AND DISPLAYS THE RESULTS*/
	public static void optionFour(int firstNumber,int SecondNumber)
	{
		System.out.println("Enter the two numbers you would like to subtract:");
		firstNumber = keyBoard.nextInt();
		SecondNumber = keyBoard.nextInt();
		int subtractionResult = 0;
		subtractionResult = firstNumber - SecondNumber;
		System.out.println("Subtraction ---> " + firstNumber + " - " + SecondNumber + " = " +  subtractionResult + ".");
	}
	//---------------------------------------------------------------optionFive Method()-----------------------------------------------------------------------------------------//
	/* THIS METHOD MULTIPLIES THE USER'S NUMBERS THEY ENTERED AND DISPLAYS THE RESULTS*/
	public static void optionFive(int firstNumber,int SecondNumber)
	{
		System.out.println("Enter the two numbers you would like to multiply:");
		firstNumber = keyBoard.nextInt();
		SecondNumber = keyBoard.nextInt();
		int multiplicationResult = 0;
		multiplicationResult = firstNumber * SecondNumber;
		System.out.println("Multiplication ---> " + firstNumber + " * " + SecondNumber + " = " +  multiplicationResult + ".");
	}
	//---------------------------------------------------------------optionSix Method()-----------------------------------------------------------------------------------------//
	/* THIS METHOD DIVIDES THE USER'S NUMBERS THEY ENTERED AND DISPLAYS THE RESULTS*/
	public static void optionSix(int firstNumber,int SecondNumber)
	{

		System.out.println("Enter the two numbers you would like to divide:");
		firstNumber = keyBoard.nextInt();
		SecondNumber = keyBoard.nextInt();
		double divisionResult = 0.0;
		try
		{
			if(SecondNumber == 0)
			{
				divisionResult = firstNumber / SecondNumber;
			}
			else
			{
				divisionResult = (double)firstNumber /SecondNumber;
				System.out.println("Division ---> " + firstNumber + " * " + SecondNumber + " = " + Math.round(divisionResult * 100.0) / 100.0 + ".");
			}
		}
		catch(ArithmeticException errorMsg)
		{
			System.out.println("ERROR - cannot "+ errorMsg.getMessage() + ".");
		}
	}
}
