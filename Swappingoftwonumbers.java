import java.util.Scanner;
public class Swappinpoftwonumbers 
{
   public static void main(String[] args) 
   {
     int a,b,temp;
     Scanner obj1=new Scanner(System.in);
     System.out.println("enter a value:");
     a=obj1.nextInt();
     System.out.println("enter b value:");
     b=obj1.nextInt();
     temp=a;
     a=b;
     b=temp;
     System.out.println("after swapping of a value:"+a);
     System.out.println("after swapping of b value:"+b);
     obj1.close();
   } 
}