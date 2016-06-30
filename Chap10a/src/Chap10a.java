// Charles Carper
// 04.06.2014
// Chapter 10 – Program a
// Utilizing the advantages of inheritance
import java.util.Scanner;
public class Chap10a 
{
//-------------------------------------Main----------------------------------------------//
/*declares 3 variables, populates 2 int variables and one string variable
 * declared the keyboard scanner
 * display a prompt message
 * populated the keyboard with numEntered
 * point to the squared class
 * called the calcResult passing parameters
 * pointed to cubed class passing  parameters
 * populated myText with string
 * point to cubed passing parameters
 * close the keyboard
 * skip space and end program message.
 * */
	
	public static void main(String[] args) 
	{
		int numEntered = 0, result = 0;
		String myText = null;
		Scanner keyBoard = new Scanner(System.in);
		System.out.println("Enter a Whole Number you would Like Squared and Cubed:");
		numEntered =  keyBoard.nextInt(); 
		Squared Pointer = new Squared();
		Pointer.calcResult(numEntered);
		myText = " you entered has a squared value of ";
		Pointer.dspResult(numEntered, Pointer.calcResult(numEntered), myText );
		Cubed Pointer2 = new Cubed();
		Pointer2.calcResult(numEntered);
		myText = " you entered has a cubed value of ";
		Pointer.dspResult(numEntered, Pointer2.calcResult(numEntered), myText );
      	keyBoard.close();
      	System.out.println();
      	System.out.println("End of Program.");
	}


}