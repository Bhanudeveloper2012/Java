public class MethodExample1 
{
  static int wheels=4;
  String color="";
  static void carbraking()
  {
    System.out.println("this is printing from the method carbraking");
  }
  void milage(int s)
  {
    System.out.println("this is printing from the method milage:"+s);
  }
  public static void main(String[] args)
 {
  MethodExample1 bmw=new MethodExample1();
   MethodExample1 xuv=new MethodExample1();
   MethodExample1 audi=new MethodExample1();
   System.out.println("the number of bmw car wheels:"+MethodExample1.wheels);
   System.out.println("the number of xuv car wheels:"+MethodExample1.wheels);
   System.out.println("the number of audi car wheels:"+MethodExample1.wheels);
   bmw.color="red";
   xuv.color="black";
   audi.color="whiter";
   System.out.println("the color of bmw:"+bmw.color);
   System.out.println("the color of xuv:"+xuv.color);
   System.out.println("the color of audi:"+audi.color);
   MethodExample1.carbraking();
   MethodExample1.carbraking();
   MethodExample1.carbraking();
   bmw.milage(7);
   xuv.milage(10);
   audi.milage(5);
  }
}