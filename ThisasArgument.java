class Devil
{
    ThisasArgument obj;
    Devil(ThisasArgument obj)
    {
      this.obj=obj;
    }
   void display()
   {
     System.out.println(obj.king);
   }
}
public class ThisasArgument 
{
    int king=169;
    ThisasArgument()
    {
     Devil r=new Devil(this);
     r.display();
    }
    public static void main(String[] args) 
    {
      System.out.println("this was printing from main");
    }
}
