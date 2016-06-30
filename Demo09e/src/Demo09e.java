public class Demo09e 
{
public static void main(String[] args)
{
	int[][]my2dArray = new int[2][3];
	for (int row = 0; row < my2dArray.length; row++)
	{
	   for (int col = 0; col < my2dArray[row].length; col++)
	   {
	      my2dArray[row][col] = 20;
	      System.out.println("Row " + row + " Column " + col + " contains a " + my2dArray[row][col] + ".");	   }
	}
		System.out.println();
		System.out.println("End of Program.");
}
}
