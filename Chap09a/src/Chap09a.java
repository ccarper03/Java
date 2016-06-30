// Charles Carper
// 03.24.2014
// Chapter 9 – Program a
// Creating a String array, sorting, reverse order

import java.util.Arrays;
import java.util.Scanner;   // import the scanner utility
public class Chap09a 
{

	public static void main(String[] args) 
	{
		String[] NamesArray = new String[10];
		Scanner keyBoard = new Scanner(System.in);
		System.out.println("Enter Ten First Names in Random Order:");
		int loopCount = 0;
		
			while (loopCount < 10)
			{
				NamesArray[loopCount]= keyBoard.nextLine();
				loopCount++;
			}
		System.out.println();
		System.out.println("You successfully entered 10 names.");
		Arrays.sort(NamesArray);
		dspArray(NamesArray);
		keyBoard.close();   // close keyboard scanner
		System.out.println();
		System.out.println("End of Program.");
		
	}
	//----------------dspArray method ---------------------------//
	public static void dspArray(String[] namesArray)
	{
		System.out.println();
		System.out.println("Names in Alphabetic Order:");
			for (int index = 0; index < namesArray.length; index++) 
			{
				System.out.println(namesArray[index]);
			}
		System.out.println();
		System.out.println("Names in Reverse Order:");
		 	for (int index = namesArray.length - 1; index >= 0; index--)
		 	{
		 		System.out.println(namesArray[index]);
		 	}
	
	}
	

}