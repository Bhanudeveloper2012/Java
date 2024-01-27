import java.util.Scanner;
public class Operators2
{
    public static void main(String[] args)
    { 
      int a,b,ch;
      Scanner obj1=new Scanner(System.in);
      System.out.print("enter a value :");
      a=obj1.nextInt();
      System.out.print("enter b value :");
      b=obj1.nextInt();
      System.out.println("*****MENU*****");
      System.out.println("1.additions\n 2.substraction\n 3.multiplication\n 4.divsion\n 5.percentage");
      System.out.println("enter your choice");
      ch=obj1.nextInt();
      switch (ch)
      {
          case 1:
                  System.out.println("addtion:"+(a+b));
                  break;
           case 2:
                  System.out.println("susbtraction:"+(a-b));
                  break;
           case 3:
                  System.out.println("mutiplication:"+(a*b));
                  break;
           case 4:
                  System.out.println("divisoin:"+(a/b));
                  break;
           case 5:
                  System.out.println("percentage:"+(a%b));
                  break;
           case 6:
                    System.out.println("exits");         
      }
      obj1.close();
    }
}