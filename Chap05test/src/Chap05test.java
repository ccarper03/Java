// Charles Carper
// 03.09.14
// Chapter 5 Test
// Capturing user input, using a while loop, and using an if-else statement
import java.util.Scanner;
public class Chap05test 
{

	public static void main(String[] args) 
	{
		getPriceInfo();
		EndOfProgram.terminate();
	}
	public static void getPriceInfo() 
	{
		double originalPrice = 0.0;
		int discountRate  = 0;
		Scanner keyBoard = new Scanner(System.in);
		System.out.println("Enter Price to be Discounted:");
		originalPrice = keyBoard.nextDouble();
		System.out.println("Enter Dicount Rate:");
		discountRate = keyBoard.nextInt();
		displayPriceInfo(originalPrice, discountRate); 
		keyBoard.close();
	}
	public static void displayPriceInfo(double originalPrice, int discountRate) 
	{
		double newPrice = 0.0;
		newPrice = originalPrice - (originalPrice * ((double)discountRate / 100));
		System.out.println(originalPrice + " discounted by " + discountRate + " percent is " + newPrice + ".");
	}
}
