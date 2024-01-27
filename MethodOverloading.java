public class MethodOverloading 
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static int add(int a,int b,int c)
    {
        return a+b+c;
    }
    static double add(double a,double b,int c)
    {
        return a+b+c;
    }
    double imp(double d,double e)
    {
        System.out.println("this was printing from method:"+(d+e));
        return d+e;
    }
    public static void main(String[] args) 
    {
        MethodOverloading obj=new MethodOverloading();
        System.out.println( MethodOverloading.add(23.5,45.6,23));//92.1
        System.out.println(add(11,56));//67
        System.out.println(add(67,56,68));//191
       obj.imp(45,67);
    }
}
