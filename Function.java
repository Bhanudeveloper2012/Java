public class Function 
{
    static int add(int x,int y)
   {
       System.out.println("the sum of the two number:"+(x+y));
       return x+y;
   }
   public static void main(String[] args)
   {
       int a=10,b=20;
       add(a,b);
       System.out.println("this was printing from main");
   }
}
