// Charles Carper	
// 02.24.14
// Chapter 4 Test
// Capturing user input, using while loop, and using an if-else statement
import java.util.Scanner; 
public class Chap04test 
{
	public static void main(String[] args)
	{
		int numOne = 1, numTwo = 0,	addResult = 0,subResult = 0, mulResult = 0;
		double divResult = 0.0;
		Scanner keyBoard = new Scanner(System.in);
		while (true)
	      {
	        System.out.println("Enter Two Numbers -OR- Enter 0 to End Program: ");
	        numOne = keyBoard.nextInt();
	        	if (numOne==0)
	        	{
	        		break;
	        	}
	        	else 
	        	{
	        		numTwo = keyBoard.nextInt();
	        		addResult = numOne + numTwo; 
	        		subResult = numOne - numTwo;
	        		mulResult = numOne * numTwo;
	        		divResult = (double)numOne / numTwo;
	        		System.out.println("Result of addition is " + addResult + ".");
	        		System.out.println("Result of subtraction is " + subResult + ".");
	        		System.out.println("Result of multiplication is " + mulResult + ".");
	        		System.out.println("Result of division is " + divResult + ".");
	        		System.out.println();
	        	}
	        
	      }
		keyBoard.close();
 		System.out.println();
 		System.out.println("End of Program.");
	}
}
