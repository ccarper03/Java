// Charles Carper
// 03.30.2014
// Chapter 9 Test
// Creating and processing a Double array

import java.util.Scanner;
public class Chap09test 
{

	public static void main(String[] args) 
	{
		double[] [] scoresArray =new double[5][3];
		double [] averageArray =new double[5];
		Scanner keyBoard = new Scanner(System.in);
		double sum = 0.0,average = 0.0;
		for (int row = 0; row < scoresArray.length; row++) 
		{
			sum = 0;
			for (int column = 0; column < scoresArray[row].length; column++) 
				{
					System.out.println("Enter Test Score:");
					scoresArray[row][column]= keyBoard.nextInt();
					sum = sum + scoresArray[row][column];
				}
			average= sum/3;
			averageArray[row]=average;
		}
		System.out.println();
		System.out.println("Calculated Results:");
		for (int row = 0; row < scoresArray.length; row++) 
			{
				System.out.println("Student " + (row+1) +" has a "+ Math.round(averageArray[row])+ " average.");
			}
		System.out.println();	
		System.out.println("End of Program.");
	}

}
