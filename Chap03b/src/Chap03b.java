// Charles Carper
// 02.08.14
// Chapter 3 – Program b
// Math calculations using variables and casting from one type to another

public class Chap03b 
{

	public static void main(String[] args) 
	{
		int numOne = 13, numTwo = 25, numThree = 39, numFour = 25, numFive = 9, sum = numOne+numTwo+numThree+numFour+numFive, divInteger = sum / 5, divRemainder = sum % 5;
		double avgOfNumbers = (double)sum/5;
		sum = numOne + numTwo + numThree + numFour + numFive;
		System.out.println("The sum of the numbers (" + (numOne) + " " + (numTwo) + " " + (numThree) + " " + (numFour) + " " + (numFive) + ") is " + sum + ".");
		System.out.println("The integer part of dividing sum by 5 is " + (divInteger) + ".");
		System.out.println("The remainder part of dividing sum by 5 is " + (divRemainder) + ".");
		System.out.println("The average of the numbers (" + (numOne) + " " + (numTwo) + " " + (numThree) + " " + (numFour) + " " + (numFive) + ") is " + (avgOfNumbers) + ".");
		System.out.println();
		System.out.println("End of Program.");
		
	}

}
