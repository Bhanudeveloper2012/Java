import java.util.Scanner;
public class DiffBwInstanceandStaticMethod
{
    int i;
    int s; 
    void Instance(int a,int b)
    {
       if(a>b)
       System.out.println("a is the max");
       else
       System.out.println("b is the max");
    }
    static void SStatic(int e,int f)
    {
        if(e>f)
        System.out.println("e is the max");
        else
        System.out.println("f is the max");
    }
    public static void main(String[] args)
    {
       DiffBwInstanceandStaticMethod ob=new DiffBwInstanceandStaticMethod();
       Scanner sc=new Scanner(System.in);
       System.out.print("enter a value:");
       int c=sc.nextInt();
       System.out.print("enter b value:");
       int d=sc.nextInt();
       ob.Instance(c,d);
       System.out.print("enter e value:");
       int g=sc.nextInt();
       System.out.print("enter f value:");
       int h=sc.nextInt();
       DiffBwInstanceandStaticMethod.SStatic(g,h);
       sc.close();

    }
}