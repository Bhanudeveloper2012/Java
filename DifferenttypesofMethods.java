import java.util.Scanner;
public class DifferenttypesofMethods
{ 
  public static void main (String[] args) 
   {
     double e,f,diff;
     Scanner obj1=new Scanner(System.in);
     System.out.print("enter the vaue of e:");
     e=obj1.nextFloat();
     System.out.print("enter the vaue of f:");
     f=obj1.nextFloat();
     diff=diff(e,f);
     System.out.print("the difrence of e and f:" + diff); 
     obj1.close();
    } 
  public static double diff(double e,double f) 
  {
    double diff=(e-f);
    return diff; 
  }
        
}
