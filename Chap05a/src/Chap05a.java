// Charles Carper	
// 03.05.2014
// Chapter 5 – Program a
// Calling methods, passing arguments, parameters, and math calculations

import java.util.Scanner; 
public class Chap05a 
{

				
		public static void main(String[] args) 
		{
			Scanner keyBoard = new Scanner(System.in);
		      	while(true)
		      	{
		      		int numOne = 0;
		      		int numTwo = 0;
		      		System.out.println("Enter Two Numbers -OR- Enter 0 to End Program:");
		      		numOne = keyBoard.nextInt();
		      		if(numOne==0)
		      		{
		      			break;
		      		}
		      		else
		      		{
		      			numTwo = keyBoard.nextInt();
		      			calcAddition(numOne, numTwo);
		      			calcSubtraction(numOne, numTwo);
		      			calcMultiplication(numOne, numTwo);
		      			calcDivision (numOne, numTwo);
		      		}
		      	}
		      	keyBoard.close();
		 		System.out.println();
		 		System.out.println("End of Program.");
		}
		    	
		//-----------------------  calcAddition Method -------------------------------//
		public static void calcAddition(int numOne, int numTwo)
		{
			    int addResult = 0;
				addResult = numOne + numTwo;
				System.out.println("Result of addition is " + addResult + ".");
		}
		   		
		//-----------------------  calcSubtraction Method -------------------------------//
		public static void calcSubtraction(int numOne, int numTwo)
		   {
			    int subResult = 0;
				subResult = numOne-numTwo;
				System.out.println("Result of Subtraction is " + subResult + ".");
		   }
		   		
		//-----------------------  calcMultiplication Method -------------------------------//
		public static void calcMultiplication(int numOne, int numTwo)
		   {
			    int mulResult = 0;
				mulResult = numOne * numTwo;
				System.out.println("Result of Multiplication is " + mulResult + ".");
		   }
		   		
		//-----------------------  calcDivision Method -------------------------------//
		public static void calcDivision(int numOne, int numTwo)
		   {
				double divResult = 0;
				divResult = (double)numOne / numTwo;
				System.out.println("Result of Division is " + divResult + ".");
		   }

}
