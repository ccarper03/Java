// Charles Carper
// 4.30.14
// Chapter 13 Test
// Reading and processing String values from a text file

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
public class Chap13test 
{
//-----------------------------Main----------------------------------------//
	/*This program grabs a .txt file from NameAddress.txt and displays it in spaced out
	 * sections */

	public static void main(String[] args) throws IOException
	{
		Scanner inFile = null;

		try														 // throws the txt file
		{
			inFile = new Scanner(new File("NameAddress.txt"));
		}
		catch(IOException errormsg)								// Catches file, if it's there it continues, if not it will exit the program
		{
			System.out.println(errormsg.getMessage());
			System.out.println();
			System.out.println("End of Program.");
			System.exit(1);
		}
		String[] myArray = new String[15];
		int slotIndex = 0; 										// Initialize variables 
		int lineCount = 0;
		while(inFile.hasNextLine())
			{
				myArray[slotIndex] = inFile.nextLine();
				slotIndex++;
			}
		System.out.println("NAMES AND ADDRESSES IN THE NameAddress FILE:");
		System.out.println();
		for(slotIndex = 0; slotIndex < 15; slotIndex++)
		{
			if(lineCount < 3)			
			{
				
				System.out.println(myArray[slotIndex]);
				lineCount++;
			}
			else 
			{
				System.out.println();
				System.out.println(myArray[slotIndex]);
				lineCount = 1;
			}
			
		}		
		
		
		
		inFile.close();
		System.out.println();
		System.out.println("End of Program.");
		

	}


}
