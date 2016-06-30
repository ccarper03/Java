// Charles Carper
// 03.07.14
// Chapter 5 – Program c
// Calling methods, passing arguments, parameters, and math calculations
import java.util.Scanner; 
public class Chap05c 
{

	public static void main(String[] args) 
	{
		getAndCalcSales();
		
		System.out.println();
 		System.out.println("End of Program.");
	}	
		  		//-----------------------getAndCalcSales Method ----------------------------------//
				public static void getAndCalcSales()
				{
					double salesAmount = 0.0;
					double sumOfSales = 0.0;
					double avgOfSales = 0.0; 
					int month = 1;
					Scanner keyBoard = new Scanner(System.in);
					while (month<=12)
						{
						System.out.println("Enter Month " + month + " Sales Amount:");
						salesAmount = keyBoard.nextDouble();
						sumOfSales = sumOfSales + salesAmount;
						month++;
						}
					keyBoard.close();
					avgOfSales = sumOfSales / 12;
					printCalcResults(sumOfSales, avgOfSales);
				}
				//-----------------------  printCalcResults Method -------------------------------//
				public static void printCalcResults(double sumOfSales, double avgOfSales)
				{
					System.out.println();
					System.out.println("Total Yearly Sales ------> $" + sumOfSales + ".");
					System.out.println("Average Monthly Sales ---> $" + avgOfSales + ".");
					if(sumOfSales >= 500000.00)
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
				}
		
		
 		
}


