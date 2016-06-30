// Charles Carper
// 04.06.2014
// Chapter 10 – Squared Class
// Utilizing the advantages of inheritance

public class Squared
{
	public int result;
	//-------------------------------------calcResult----------------------------------------------//
	/*calcResult calculates user input, populates and returns "result"*/
	public int calcResult(int numEntered)
	{
		result = numEntered * numEntered;
		return result;
			
	}
	//-------------------------------------dspResult----------------------------------------------//
	/* displays output concatenating string with variables*/
	public void dspResult(int numEntered, int Pointer, String myText)
	{
		System.out.println("The " + numEntered + myText + Pointer + "." );

	}

}