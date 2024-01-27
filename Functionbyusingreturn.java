import java.util.Scanner;
public class Functionbyusingreturn  
{
    static int add(int x,int y)
   {
       System.out.println("the sum of the two number:"+(x+y));
       return x+y;
   }
   public static void main(String[] args)
   {
       int a,b;
       Scanner obj1=new Scanner(System.in);
       System.out.println("enter the value of a:");
       a=obj1.nextInt();
       System.out.println("enter the value of b:");
       b=obj1.nextInt();
       add(a,b);
       obj1.close();
   }
    
}
