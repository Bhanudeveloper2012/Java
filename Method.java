public class Method
{
    int Mul(int m)
    {
    System.out.println(7*m);
       return 7*m;
    }
   public static void main(String[] args) 
   {
     Method f=new Method();  
     for(int i=1;i<=15;i++)
       {
          f.Mul(i);
       }
   }
}