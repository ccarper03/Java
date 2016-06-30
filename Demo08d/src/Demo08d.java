import java.util.Scanner;
class Demo08d
{
   public static void main(String[] args)
   {
      Scanner keyBoard = new Scanner(System.in);
      int numOfGrades = 0, sumOfGrades = 0, index = 1;
      double avgOfGrades = 0.0;
      System.out.println("Enter number of grades:"); 	// Prompt message
      numOfGrades = keyBoard.nextInt();
      System.out.println("Enter grades:");			// Prompt message
      while (index <= numOfGrades)
      {
          sumOfGrades = sumOfGrades + keyBoard.nextInt();
          index++;
      }
      avgOfGrades = (double)sumOfGrades / numOfGrades;
      System.out.println("Average = " + Math.round(avgOfGrades * 100.0) / 100.0);
      System.out.println();
      System.out.println("End of Program.");
   } 
}
