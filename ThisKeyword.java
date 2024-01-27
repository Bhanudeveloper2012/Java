public class ThisKeyword 
{
  double a;
  static int b;
  static String c;
  ThisKeyword (double a) 
  {
    this.a=a;  
  }
  void display()
  {
    System.out.println("the value is printing from display method:"+a);
  }
  ThisKeyword(int b)
  {
   ThisKeyword.b=b;
  }
  static void display1()
  {
    System.out.println("the value is printing from display method:"+b);
  }
  ThisKeyword(String c)
  {
    ThisKeyword.c=c;
  }
  static void display2()
  {
    ThisKeyword.display3();
    System.out.println("this is printing from the display2"+c);
  }
  static void display3()
  {
    System.out.println("this is printing from the display3");
  }
  public static void main(String[] args)
  {
    ThisKeyword t=new ThisKeyword(4.7);
    ThisKeyword t1=new ThisKeyword(6);
    ThisKeyword t2=new ThisKeyword(" alien");
    t.display();
    ThisKeyword.display1();
    ThisKeyword.display2();  
  }
}
