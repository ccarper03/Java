// Charles Carper
// 02.19.14
// Chapter 4 � Program e
// Capturing user input, using a while loop, and using an if-else statement

import java.util.Scanner; 
public class Chap04e 
{

	public static void main(String[] args) 
	{
		int userNumber = 0, remainder = 0;
		double midPoint = 0.0;
		Scanner keyBoard = new Scanner(System.in);
		System.out.println("Enter a number greater than 1:");
		userNumber = keyBoard.nextInt();
		int sum = 0, counter = 1;
		while(counter <= userNumber)
		{
			sum = (sum+counter);
			counter++;
		}	
			System.out.println();
		    System.out.println("The sum of the numbers 1 through " + userNumber + " is "+ sum + ".");
			midPoint = (double)sum / 2;
			remainder = sum % 2;
		
		if(remainder == 0)
		{
			System.out.println(sum + " divided by 2 " + midPoint + ".");
			System.out.println("The sum variable was evenly divisable by 2.");
		}
		else
		{
			System.out.println(sum + " divided by 2 is " + midPoint+".");
			System.out.println("sum variable was not evenly divisable by 2.");
		}
		keyBoard.close();	
		System.out.println();
		System.out.println("End of Program.");
	}

}
