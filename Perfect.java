import java.util.Scanner;
public class Perfect
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    for(int num = 2; num < 1000; ++num)
    {
      isPerfect(num);
    }
  }//end main
  
  public static void isPerfect(int num)
  {
    int sum = 0;
    for(int factor = 1; factor < num; ++factor)
    {
      if(num % factor == 0)
      {
        sum += factor;
      }
    }
    if(sum == num)
    {
      System.out.printf("%d is a perfect number!%n", num);
      System.out.printf("Its factors:\t");
      for(int i = 1; i < num; ++i)
      {
        if(num % i == 0)
        {
          System.out.printf(i + "\t");
        }
      }
      System.out.printf("%n%n");
    }//end if
  }//end method
  
}//end class