// Charles Carper
// 04.28.14
// Chapter 13 – Program a
// Writing Double values to a text file

import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class Chap13a 
{
//--------------------------Main------------------------------------//
	public static void main(String[] args) throws IOException
	{
		PrintWriter outFile = new PrintWriter(new File("MyNumbers.txt"));
		for(double number = 1; number <= 50; number = number + .5)
		{
			outFile.println(number);
		}

		outFile.close();
		System.out.println("The MyNumbers.txt file was successfully created.");
		File MyFile = new File("MyNumbers.txt");
		double sizeInBytes = 0.0;
		sizeInBytes = MyFile.length();
		System.out.println("Its size (on disk) is " + Math.round(sizeInBytes) + " bytes.");
		System.out.println();
		System.out.println("End of Program.");
	}

}