public class Demo09b 
{
	public static void main(String[] args)
	{
		double[] myArrayTwo = new double[5];
		int index = 0;
		double myNumber = 1.111;
		while (index < myArrayTwo.length)		// Using the length method	
		{
		   myArrayTwo[index] = myNumber;		// Using a variable instead of actual slot number 	
		   System.out.println("Slot " + (index + 1) + " contains " + myArrayTwo[index] + ".");
		   index++;
		   myNumber = myNumber + 1.111;
		}
		System.out.println();
		System.out.println("End of Program.");
	}
}
