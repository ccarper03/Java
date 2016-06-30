public class Demo08c 
{
	public static void main(String[] args)
	{
		double sqRoot = Math.sqrt(49);
		System.out.println("The square root of 49 is " + sqRoot + ".");
		double area = Math.PI * 10.0 * 10.0;
		System.out.println("The area of a circle with a radius of 10 is " + area + ".");
		System.out.println("The area of a circle with a radius of 10 is " + Math.round(area) + ".");
		System.out.println("The area of a circle with a radius of 10 is " + Math.round(area * 100.0) / 100.0 + ".");
		System.out.println();
		System.out.println("End of Program.");
	}
}
