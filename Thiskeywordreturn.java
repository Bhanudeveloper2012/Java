class thiskeywordreturn
{
  thiskeywordreturn fix()
    {
     return this;
    }
    void display()
    {
      System.out.println("this is printing from method");
    }
}
public class RetrunThis 
{
    public static void main(String[] args) 
    {
      new thiskeywordreturn().fix().display();  
    }
}
