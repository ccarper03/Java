// Charles Carper
// 04.14.2014
// Chapter 12 – Program b
// Catching an Array Index Out of Bounds exception


public class Chap12b 
{
//-----------------------------------------------MAIN------------------------------------------------------------//
	// calls and tries to find errors in populateArray() method, if it finds errors it will display message and end program
	public static void main(String[] args) 
	{
		try 
		{
			populateArray();
		}
		catch(ArrayIndexOutOfBoundsException errorMsg)
		{
			System.out.println();
			System.out.println("Array index " + errorMsg.getMessage() + " is out of the boundry limits.");
			System.out.println("Modify code assuring array " + errorMsg.getMessage() + " is never referenced.");
			
		}
		System.out.println();
		System.out.println("End of Program.");
	}
//-----------------------------------------------populateArray------------------------------------------------------------//	
	//this method populates the array and displays message
	public static void populateArray()
	{
		int [] myArray = new int[10];
		int count = 5;
		for(int index = 0; index < myArray.length; index++)// not catching error
		{
			myArray[index] = count; 
			System.out.println("Array index " + index + " contains a " + count + ".");
			count = count + 5;
		}
	}
}

