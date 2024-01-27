public class ExampleConstructor 
{
    int a;
    String b;
    ExampleConstructor(int c,String d)
    {
      a=c;
      b=d;
    }
   public static void main(String[] args)
   {
    ExampleConstructor c=new ExampleConstructor(4," king");
    ExampleConstructor c1=new ExampleConstructor(6," villan");
    ExampleConstructor c2=new ExampleConstructor(4," CEO");
    System.out.println(c.a+c.b);
    System.out.println(c1.a+c1.b);
    System.out.println(c2.a+c2.b);
   }
}
