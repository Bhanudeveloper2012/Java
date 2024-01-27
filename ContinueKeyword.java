public class Continous 
{
    public static void main(String[] args)
    {
        int i,n=10;
        for(i=0;i<=n;i++)
        {
            if(i==4)
            {
                continue;
            }
         System.out.println("the number are:"+i);   
        }
     System.out.println("this is printing from main");
    }
}
