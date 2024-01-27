public class Localvariables 
{
    void Name()
    {
        String a="villan";
        System.out.println("the name is:"+a);
    }
    static void Height()
    {
        int b=6;
        System.out.println("the height of a person:"+b);
    }
    public static void main(String[] args) 
    {
       Localvariables obj=new Localvariables();
       obj.Name();
       Localvariables.Height();   
    }
}
