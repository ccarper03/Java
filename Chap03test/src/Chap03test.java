// Charles Carper
// 02.12.14
// Chapter 3 Test
// Math Calculations using variables,casting, and concatenation
public class Chap03test 
{

	
	public static void main(String[] args) 
	{
		int numOne = 26, numTwo = 13, numThree = 34, numFour = 20, numFive = 8, numSix = 53, numSeven = 15 , numEight = 29, numNine = 6, numTen = 30, firstSum = 0, secondSum = 0, allSum = 0;
		double avgFirst = 0.0, avgSecond = 0.0, avgAll = 0.0;
		
		firstSum = numOne + numTwo + numThree + numFour + numFive;
		secondSum = numSix + numSeven + numEight + numNine + numTen;
		allSum = firstSum + secondSum;
		
		System.out.println("The sum of the numbers (" + numOne + " " + numTwo + " " + numThree + " " +numFour + " " + numFive + ") is " + firstSum + ".");
		System.out.println("The sum of the numbers (" + numSix + " " + numSeven + " " + numEight + " " +numNine + " " + numTen + ") is " + secondSum + ".");
		System.out.println("The sum of " + firstSum + " and " + secondSum + " is " + allSum + ".");
		System.out.println();
		
		avgFirst = (double)firstSum / 5;
		avgSecond = (double)secondSum / 5;
		avgAll = (double)allSum / 10;
		
		System.out.println("The average of the numbers (26 13 34 20 8) is " + avgFirst + ".");
		System.out.println("The average of the numbers (53 15 29 6 30) is " + avgSecond + ".");
		System.out.println("The average of all numbers is " + avgAll + ".");
		System.out.println();
		System.out.println("End of Program.");
		
		
		
		
		
	}

}
