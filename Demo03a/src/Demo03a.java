
public class Demo03a 
{

	public static void main(String[] args) 
	{
		byte byteOne = 0;
		int intOne = -111;
		double dblOne = 1234.56;
		byteOne = (byte)intOne;
		System.out.println("The byteOne variable contains the value " + byteOne + ".");
		intOne = (int)dblOne;							System.out.println("The intOne variable contains the value " + intOne + ".");
		int sum = 0;
		double average = 0;
		sum = 1 + 3 + 6 + 9 + 12;
		System.out.println("The sum variable contains the value " + sum + ".");
		average = (double)sum / (double)5;
		System.out.println("The average variable contains the value " + average + ".");
		System.out.println();
		System.out.println("End of Program.");

	}

}
