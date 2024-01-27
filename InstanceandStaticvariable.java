public class InstanceandStaticvar
{
    int a=45;
    static double b=87.08;
    public static void main(String[] args)
    {
     InstanceandStaticvar i=new InstanceandStaticvar();
     System.out.println(""+i.a);
     System.out.println(""+b);
     System.out.println(""+InstanceandStaticvar.b);
    }
}