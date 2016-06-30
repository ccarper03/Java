
// Charles Carper
// 01.27.14
// Chapter 1 Test
// String manipulation, math calculations, and concatenation

public class Chap01test 
{	
	public static void main(String[] args) 
	{
		String firstName,lastName,fullName;
		firstName = "Charles ";
		lastName = "Carper";
		fullName = firstName + lastName;
		System.out.println("My full name is "+ fullName); 
		System.out.println();
		System.out.println("Simple Math Calculations: ");
		System.out.println("5 + 12 + 18 + 20 = " + (5 + 12 + 18 + 20)); 
		System.out.println("1 + 3 + 5 + -20 =  "   + (1 + 3 + 5 + -20));
		System.out.println("5 * 2 * 10 + 11 =  "   + (5 * 2 * 10 + 11)); 
		System.out.println("4 + 111 / 3 / 2 =  "   + (4 + 111 / 3 / 2)); 
		System.out.println(); 
		System.out.println("End of Program");
	}

}
