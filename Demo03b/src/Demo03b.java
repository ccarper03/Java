
public class Demo03b 
{

	public static void main(String[] args) 
	{
	       int intOne = 10, intTwo = 20;
	       System.out.println("Comparison result is " + (intOne < intTwo) + ".");      
	       boolean booOne, booTwo;
	       booOne = intOne > intTwo;
	       booTwo = intOne < intTwo;
	       System.out.println("Comparison result is " + (booOne && booTwo) + ".");
	       System.out.println("Comparison result is " + (booOne || booTwo) + ".");
	       booOne = !booOne;
	       System.out.println("Comparison result is " + (booOne && booTwo) + ".");
	       System.out.println();
	       System.out.println("End of Program.");   

	}

}
