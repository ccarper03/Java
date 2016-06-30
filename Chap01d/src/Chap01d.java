// Charles Carper
// 01.27.14
// Chapter 1 – Program d
// String manipulation, uppercase, lowercase, and concatenation

public class Chap01d 
{
	public static void main(String[] args) 
	{
		String strOne;
		strOne = new String("Characters to Manipulate");
		System.out.println(strOne);
		strOne = strOne.toUpperCase();
		System.out.println(strOne);
		strOne = strOne.toLowerCase();
		System.out.println(strOne);
		System.out.println();
		
		String strTwo;
		strTwo = new String("Additional Characters to Manipulate");
		System.out.println(strTwo);
		strTwo = strTwo.toUpperCase();
		System.out.println(strTwo);
		strTwo = strTwo.toLowerCase();
		System.out.println(strTwo);
		System.out.println();
		
		String strThree,strFour;
		strThree = new String("Even more Characters ");
		strFour = new String("to Manipulate");
		System.out.println(strThree+strFour);
		strThree = strThree.toUpperCase();
		strFour = strFour.toUpperCase();
		System.out.println(strThree+strFour);
		strThree = strThree.toLowerCase();
		strFour = strFour.toLowerCase();
		System.out.println(strThree+strFour);
		System.out.println();
		System.out.println("End of Program");
	}

}