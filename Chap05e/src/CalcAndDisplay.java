// Charles Carper
// 03.08.14
// Chapter 5 – Program d
// Overloading method names

import java.util.Scanner;
public class CalcAndDisplay
{
		public static void calcSales()
		{
			double salesAmount = 0.0;
			double sumOfSales = 0.0;
			double avgOfSales = 0.0;
			int month = 1;
			Scanner keyBoard = new Scanner(System.in);
			while(month<=12)
			{
				System.out.println("Enter month " + month + ".");
				salesAmount = keyBoard.nextDouble();
				sumOfSales = sumOfSales + salesAmount;
				month++;
				
			}
			keyBoard.close();
			avgOfSales = sumOfSales / 12;
			dspSales(sumOfSales, avgOfSales);
		}
		public static void dspSales(double sumOfSales, double avgOfSales)
		{
			System.out.println();
			System.out.println("Total Yearly Sales ------> $"+ sumOfSales + ".");
			System.out.println("Average Monthly Sales ---> $"+ avgOfSales + ".");
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




