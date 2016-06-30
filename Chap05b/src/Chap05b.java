// Charles Carper
// 03.05.14
// Chapter 5 – Program b
// Calling methods, passing arguments, parameters, and returning values
import java.util.Scanner; 
public class Chap05b 
{
	public static void main(String[] args) 
	{
		int addResult = 0, subResult = 0, mulResult = 0;
		double divResult = 0.0;
		Scanner keyBoard = new Scanner(System.in);
		while(true)
		{
			int numOne = 0, numTwo = 0;
			System.out.println("Enter Two Numbers -OR- Enter 0 to End Program:");
			numOne = keyBoard.nextInt();
			if(numOne==0)
      		{
      			break;
      		}
      		else
      		{
      			numTwo = keyBoard.nextInt();
      			
      			addResult = calcAddition(numOne, numTwo);
      			System.out.println("Result of addition is " + addResult + ".");
      			
      			subResult = calcSubtraction(numOne, numTwo);
      			System.out.println("Result of Subtraction is " + subResult + ".");
      			
      			mulResult = calcMultiplication(numOne, numTwo);
      			System.out.println("Result of Multiplication is " + mulResult + ".");
      			
      			divResult = calcDivision (numOne, numTwo);
      			System.out.println("Result of Division is " + divResult + ".");
      			System.out.println();
      		}
			
		}
	
		keyBoard.close();
 		System.out.println();
 		System.out.println("End of Program.");
	}
	
			//-----------------------  calcAddition Method -------------------------------//
			public static int calcAddition(int numOne, int numTwo)
		    {
		       return numOne + numTwo;
		    }
			//-----------------------  calcSubtraction Method -------------------------------//
			public static int calcSubtraction(int numOne,int numTwo)
			{
				return numOne - numTwo;
			}
			//-----------------------  calcMultiplication Method -------------------------------//
			public static int calcMultiplication(int numOne,int numTwo)
			{
				return numOne * numTwo;
			}
			//-----------------------  calcDivision Method -------------------------------//
			public static double calcDivision(double numOne,double numTwo)
			{
				return (double) numOne / numTwo;
			}
		
		
}



