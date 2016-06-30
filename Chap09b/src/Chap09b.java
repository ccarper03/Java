// Charles Carper
// 03.30.2014
// Chapter 9 – Program b
// Creating a Double array, sorting, reverse order

import java.util.Arrays;
import java.util.Scanner;
public class Chap09b 
{
//---------------------main-------------------------------------------//
/* this program uses arrays of 12 slots, it accepts input from the user.
 * it collects all the data then calculates the sum and the average and displays it to the user.
 * the program also shows the user the numbers in ascending and descending order.*/
	public static void main(String[] args) 
	{
		double [] SalesArray =new double[12];
		Scanner keyBoard = new Scanner(System.in);
		System.out.println("Enter Sales Data:");
		int loopCount = 0;
		while (loopCount <12 )
		{
			SalesArray[loopCount] = keyBoard.nextDouble();
			loopCount++;
		}
		System.out.println();
		System.out.println("You successfully entered 12 sales figures.");
		Arrays.sort(SalesArray);
		dspArray(SalesArray);
		keyBoard.close();   // close keyboard scanner
		System.out.println();
		System.out.println("End of Program.");
	}
	//-----------------------dspArray Method---------------------------------------//
	/*this method calculates the data to display the sum, average, ascending and descending order
	 * and rounds the average figure to the 2nd decimal place.*/
	public static void dspArray(double[] salesArray)
	{
		double sumOfSales = 0.0, avgOfSales = 0.0;
		for (int index = 0; index < salesArray.length; index++) 
		{
			sumOfSales+=salesArray[index];
			avgOfSales=sumOfSales/salesArray.length;
		}
		System.out.println();
		System.out.println("Total Yearly Sales - $"+sumOfSales+" - Average Monthly Sales - $"+ Math.round(avgOfSales * 100.0) / 100.0);
		
		System.out.println();
		System.out.println("Sales in Ascending Order:");
			for (int index = 0; index < salesArray.length; index++) 
			{
				System.out.println(salesArray[index]);
			}
		System.out.println();
		System.out.println("Sales in Descending Order:");
		 	for (int index =  salesArray.length - 1; index >= 0; index--)
		 	{
		 		System.out.println(salesArray[index]);
		 	}	
		
	}

}
