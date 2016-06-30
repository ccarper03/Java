public class Demo08a 
{
public static void main(String[] args)
{
String stringOne = "HELLO";
String stringTwo = "hello";
System.out.println("Comparison returned a " + stringOne.compareTo(stringTwo) + ".");
		
stringOne = "HELLO";
stringTwo = "HELLO";
System.out.println("Comparison returned a " + stringOne.compareTo(stringTwo) + ".");
		
stringOne = "hello";
stringTwo = "HELLO";
System.out.println("Comparison returned a " + stringOne.compareTo(stringTwo) + ".");
System.out.println();
System.out.println("End of Program.");
}
}
