// Charles Carper
// 04.28.14
// Chapter 13 – Program b
// Writing String values to a text file

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class Chap13b 
{
//-----------------------Main------------------------------//
	/*This program asks requests user name and address to be entered, it continues to requests until user types in "Quit" on the enter full name prompt.
	 * To conclude the program it displays the size of the file it created */
	public static void main(String[] args) throws IOException
	{
		String fullname,addressLine,cityStateZip = null;
		int nameCount = 0;
		PrintWriter outFile = new PrintWriter("NameAddress.txt");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Full Name     -OR-      Enter Quit to End Program");
		String fullName = keyboard.nextLine();
		while(true)
		{
			if(fullName.equals("Quit"))
			{
				outFile.close();
				keyboard.close();
				System.out.println();
				System.out.println("The NameAddress.txt file was successfully created.");
				System.out.println("You entered 5 names and addresses into the file.");
				File MyFile = new File("NameAddress.txt");
				double sizeInBytes = 0.0;
				sizeInBytes = MyFile.length();
				System.out.println("Its size (on disk) is " + Math.round(sizeInBytes) + " bytes.");
				System.out.println();
				System.out.println("End of Program.");
				System.exit(1);
			}
			else
			{
			    outFile.println(fullName);
			    System.out.println("Enter Address:");
			    addressLine = keyboard.nextLine();
			    outFile.println(addressLine);
			    System.out.println("Enter City, State, and Zip:");
			    cityStateZip = keyboard.nextLine();
			    outFile.println(cityStateZip);
			    nameCount++;
				System.out.println("Enter Full Name     -OR-      Enter Quit to End Program");
				fullName = keyboard.nextLine();
			}
		}
	}

}
