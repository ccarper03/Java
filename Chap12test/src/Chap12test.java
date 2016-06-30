// Charles Carper
// 04.16.2014
// Chapter 12 Test
// Throw a New exception

import java.util.Scanner;
public class Chap12test
{
//---------------------------------------------MAIN--------------------------------------------------------------------------//
	/*this program gets tells the employee their gross pay. it calulates the payrate and hours worked. 
	 * employees are not to work overtime,so if employee goes over there will be an error message.*/
	public static void main(String[] args) 
	{
		int empNumber = 0;
		double hrsWorked,payRate,grossPay = 0.0;
		Scanner keyBoard = new Scanner(System.in);
		System.out.println("Enter Employee Number     -OR-     Enter 0 to End Program:");
		empNumber = keyBoard.nextInt();                  //populate  empNumber
		while(empNumber!=0)
		{
			try
			{
				System.out.println("Enter Pay Rate:");
				payRate = keyBoard.nextDouble();
				System.out.println("Enter Hours Worked:");
				hrsWorked = keyBoard.nextDouble();
					if(hrsWorked<=0||hrsWorked>40)
					{
						throw new ValidateHours();
					}
					else
					{
						grossPay = hrsWorked * payRate;
						System.out.println("Gross Pay for Employee "+ empNumber + " is $" +  Math.round(grossPay* 100.0) / 100.);
						System.out.println();
						System.out.println("Enter Employee Number     -OR-     Enter 0 to End Program:");
						empNumber = keyBoard.nextInt();                  //populate  empNumber
					}
			}
			catch(ValidateHours myMessage)
			{
				
				System.out.println(myMessage.getMessage());     // displays error message( HOURS WORKED NOT VALID )
				System.out.println();
				System.out.println("Enter Employee Number     -OR-     Enter 0 to Quit:");
				empNumber = keyBoard.nextInt();                  //populate  empNumber
			}
		}
		keyBoard.close();
		System.out.println();
		System.out.println("End of Program.");
	}
}
