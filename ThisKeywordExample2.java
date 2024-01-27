public class ThisKeyword2
{
    void display()
    {
     this.display1();
     System.out.println("this is printing from the display method");
    }
    void display1()
    {
     System.out.println("alien");
    }
    public static void main(String[] args)
    {
     ThisKeyword2 t=new ThisKeyword2();
     t.display();
    }
          
}
