// Charles Carper
// 02.19.14
// Chapter 4 – Program f
// Capturing user input, using a while loop, and using an if-else statement
import java.util.Scanner; 
public class Chap04f 
{
	public static void main(String[] args) 
	{
		double salesAmount = 0.0,sumOfSales = 0.0,avgOfSales = 0.0;
		int month = 1;
		Scanner keyBoard = new Scanner(System.in);
		while(month<=12)
		{
			System.out.println("Enter month " + month + " Sales Amount:");
			salesAmount = keyBoard.nextDouble();
			sumOfSales = sumOfSales + salesAmount; 
			month++;
		}
		System.out.println();
		System.out.println("Total Yearly Sales------>" + sumOfSales + ".");
		avgOfSales = sumOfSales/12 ; 
		System.out.println("Average Monthly Sales--->" + avgOfSales + ".");
		if(sumOfSales>= 500000.00)
		{
			System.out.println();
			System.out.println("Yearly Sales Goal Met.");
			System.out.println("Five Percent Salary Increase for All Sales Personnel.");
		}
		else
		{
			System.out.println();
			System.out.println("FAILED TO MEET YEARLY SALES GOAL.");
			System.out.println("FIVE PERCENT SALARY REDUCTION FOR ALL SALES PERSONNEL.");
		}
		keyBoard.close();
		System.out.println();
		System.out.println("End of Program.");
	}

}
