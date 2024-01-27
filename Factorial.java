import java.util.Scanner;
public class Factorial
{
   public static void main(String[] args) 
   {
      int i,a,fact=1;
      try (Scanner sc = new Scanner(System.in))
      {
         System.out.println("enter the value of a:");
         a=sc.nextInt();
         for(i=a;i>1;i--)
         {
            fact=fact*i;
         }
         System.out.println("the factorial of given number is:"+fact); 
         sc.close();
      }
   }
}