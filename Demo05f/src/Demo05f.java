
public class Demo05f 
{

	// -------------------- main Method --------------------
	// Calls external method. Displays calculated result in
	// Console window. Ends Program.
	public static void main(String[] args) 
	{
		Demo05f2.add();
		System.out.println("answer = " +Demo05f2.answer + " (printed within main of ClassOne).");
		System.out.println();
		System.out.println("End of Program.");
	}


}
