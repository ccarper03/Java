// Charles Carper
// 02.02.14
// Chapter 2 � Program c
// Incrementing and decrementing variable values

public class Chap02c 
{

	
	public static void main(String[] args) 
	{
		int numOne,numTwo;
		numOne = 5;
		numTwo = 50;
		
		System.out.println("The value in the numOne variable is "+ numOne + ".");
		System.out.println("The value in the numOne variable is "+ numTwo + ".");
		System.out.println();
		numOne++;
		System.out.println("Now, the value in the numOne variable is " + numOne + ".");
		numTwo--;
		System.out.println("Now, the value in the numTwo variable is " + numTwo + ".");
		System.out.println();
		numOne = numOne +4;
		System.out.println("Now, the value in the numOne variable is "+ numOne + ".");
		numTwo = numTwo-9;
		System.out.println("Now, the value in the numTwo variable is " + numTwo + ".");
		System.out.println();
		System.out.println("End of Program");

	}

}
