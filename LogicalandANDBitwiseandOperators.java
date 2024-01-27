public class LogicalandANDBitwiseandOperators
{
    public static void main(String[] args) 
    {
        int a=4,b=7,c=10;
        System.out.println(a<b && a++<c);//4<7=t  &&  4<10=t , output=t
        System.out.println(a);//a=5
        System.out.println(c<b && a++>c);//10<7=f  &&  5>10=f, output=f
        System.out.println(a);//a=5
        System.out.println(c>a && a++>c);//10>4=t   && 5>10=f, output=f
        System.out.println(a);//a=6
        System.out.println(a<b & b++<c);//6<7=t   &  7<10=t,  output=t
        System.out.println(b);//b=8
        System.out.println(b>c & c++<a);//7>10=f  &  10<6=f,  output=f
        System.out.println(c);//c=11
        System.out.println(b>c & c++<a);//7>11=f  &  11<6=t,  output=f
        System.out.println(c);//c=12
    }

}