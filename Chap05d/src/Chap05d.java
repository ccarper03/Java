// Charles Carper
// 03.08.14
// Chapter 5 – Program d
// Overloading method names

public class Chap05d 
{

	public static void main(String[] args) 
	{
		int result = 0;
		calcResult(11);
		System.out.print("Squared ---------->  ");
		dspResult(result + calcResult(11));

		calcResult(400, 4);
		System.out.print("Division --------->  ");
		dspResult(result + calcResult(400,4));
		
		calcResult(200, 50, 17);
		System.out.print("Subtraction ------>  ");
		dspResult(result + calcResult(200,50,17));
		
		calcResult(2, 4, 6, 8);
		System.out.print("Multiplication --->  ");
		dspResult(result + calcResult(2,4,6,8));
		
		calcResult(22, 33, 44, 55, 66);
		System.out.print("Addition --------->  ");
		dspResult(result + calcResult(22,33,44,55,66));
		
		System.out.println();
		System.out.println("End of Program.");
		
	}
		//----------------------- calcResult Method parm1 ----------------------------------//
		public static int calcResult(int numOne)
		{
			int result = numOne * numOne;
			return result;
		}
		//-----------------------calcResult Method parm2----------------------------------//
		public static int calcResult(int numOne, int numTwo)
		{
			int result = numOne / numTwo;
			return result;
		}
		//----------------------- calcResult Method parm3 ----------------------------------//
		public static int calcResult(int numOne, int numTwo, int numThree)
		{
			int result = numOne - numTwo - numThree;
			return result;
		}
		//----------------------- calcResult Method parm4 ----------------------------------//
		public static int calcResult(int numOne, int numTwo, int numThree, int numFour)
		{
			int result = numOne * numTwo * numThree * numFour;
			return result;
		}
		//----------------------- calcResult Method parm5 ----------------------------------//
		public static int calcResult(int numOne, int numTwo, int numThree, int numFour, int numFive)
		{
			int result = numOne + numTwo + numThree + numFour + numFive;	
			return 	result;
		}
		//----------------------- dspResult Method ----------------------------------//
		public static void dspResult(int result)
		{
			System.out.println("Calculated result is " + result + ".");
		}
}
