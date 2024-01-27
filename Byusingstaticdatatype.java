public class Byusingstaticdatatype
{
    int i=45;
    static int s=56;
public static void main(String[] args) 
 {
    Byusingstaticdatatype f=new  Byusingstaticdatatype();
    Byusingstaticdatatype b=new  Byusingstaticdatatype();
    System.out.println("the value of instance varaible i:"+f.i);//45
    System.out.println("the value of instance varaible i:"+b.i);//45
    System.out.println("the value of instance varaible i:"+s);//56
    System.out.println("the value of instance varaible i:"+s);//56
    f.i=67;
    Byusingstaticdatatype.s=500;
    System.out.println("the value of instance varaible i:"+f.i);//67
    System.out.println("the value of instance varaible i:"+b.i);//45
    System.out.println("the value of instance varaible i:"+s);//500
    System.out.println("the value of instance varaible i:"+s);//500
 }
}
 
