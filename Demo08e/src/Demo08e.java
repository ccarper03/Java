import java.util.Scanner;
class Demo08e
{
   public static void main(String[] args)
   {
      Scanner keyBoard = new Scanner(System.in);
      int grade = 0, numOfGrades = 0, sumOfGrades = 0;
      double avgOfGrades = 0.0;
      System.out.println("Enter grade or -1 to quit:");	    // Prompt message
      while (true)
      {
         grade = keyBoard.nextInt();
         if (grade < 0)
         {
             break;
         }          
         sumOfGrades = sumOfGrades + grade;
         numOfGrades++;
      }
      avgOfGrades = (double)sumOfGrades / numOfGrades;
      System.out.println("Average = " + Math.round(avgOfGrades * 100.0) / 100.0);
      System.out.println();
      System.out.println("End of Program.");
   } 
}
