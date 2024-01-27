public class ThisKeyword3 
{
  void First(ThisKeyword3 obj)
   {
     System.out.println("this was printing from the first method");
   } 
    void Second()
    {
     First(this);
     System.out.println("this was printing from the second method");
    }
 public static void main(String[] args) 
 {
   ThisKeyword3 r=new ThisKeyword3();
    r.Second();  
 }
}
