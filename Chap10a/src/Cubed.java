// Charles Carper
// 04.06.2014
// Chapter 10 – Cubed Class
// Utilizing the advantages of inheritance


public class Cubed extends Squared
{
	//------------------------------calcResult-----------------------------------------------//
	/*Calculates numEntered, multiplying it by it self 3 times to get a cubed result. 
	 * putting the result in the variable result and returning it. */
	public int calcResult(int numEntered)
	{
		result = numEntered * numEntered * numEntered;
		return result;	
	}
	
}
