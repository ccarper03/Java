public class Demo09c 
{
	public static void main(String[] args)
	{
		int[] myArrayThree = new int[1000];
		int index = 0, count = 1;
		while (index < myArrayThree.length)
		{
			myArrayThree[index] = count;
			System.out.println("Slot " + (index + 1) + " contains " + myArrayThree[index] + ".");       
			index++;
			count++;
		}
			
	}
}
