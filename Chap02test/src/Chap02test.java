// Charles Carper
// 02.03.14
// Chapter 2 Test
// Assigning initial values to variables, math calculations, and concatenation

public class Chap02test 
{

	public static void main(String[] args) 
	{
		int numOne= 18, numTwo= 43, numThree= 67, numFour= 9, numFive= 27 , firstSum= numOne + numFive, secondSum= numTwo + numThree + numFour;
		
		
		System.out.println("The value in the firstSum variable is " + firstSum + ".");
		System.out.println("The value in the secondSum variable is " + secondSum + ".");
		System.out.println("The values "+ firstSum +" and "+ secondSum +" added together equals "+(firstSum+secondSum)+".");
		
		int multiResult= numOne * numTwo * numThree * numFour * numFive, divResult= 100000 / (firstSum + secondSum), remResult= 100000 % (firstSum + secondSum);
		
		System.out.println("All variable values multiplied together equals "+ multiResult + ".");
		System.out.println("One hundred thousand divided by the sum of all variables equals "+ divResult +".");
		System.out.println("One hundred thousand divided by the sum of all variables has a remainder of "+ remResult +".");
		System.out.println();
		System.out.println("End Of Program");

	}

}
