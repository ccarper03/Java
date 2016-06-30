// Charles Carper
// 02.02.14
// Chapter 2 – Program e
// Assigning initial values to variables, math calculations, and concatenation

public class Chap02e
{

	public static void main(String[] args)
	{
		int numOne=121,numTwo=93,numThree=265,sumOfIntegers=numOne+numTwo+numThree,avgOfIntegers=sumOfIntegers/3;
		
		System.out.println("The sum of the integer numbers (121 93  265) is " + sumOfIntegers + "." );
		System.out.println("The average of the integer numbers (121 93  265) is " + avgOfIntegers + "." );
		System.out.println();
		
		double numFour=101.313,numFive=88.808,numSix=144.14,sumOfDoubles=numFour+numFive+numSix,avgOfDoubles=sumOfDoubles/3;
		
		System.out.println("The sum of the double numbers (101.313  88.808  144.14) is " + sumOfDoubles + "." );
		System.out.println("The average of the double numbers (101.313  88.808  144.14) is " + avgOfDoubles + "." );
		
		System.out.println();
		System.out.println("End Of Program");

	}

}
