public class Reff 
{
 int a;
 int b;
 static int c=79;
 static void add(Reff sc,Reff sc2)
 {
   sc.a=30;
   System.out.println("this is printing from method:"+(sc.a+sc2.b));//39
   System.out.println("this was accesing from method:"+(sc.a));//30
 }
 public static void main(String[] args) 
 {
   Reff sc=new Reff();
   Reff sc2=new Reff();
   sc.a=6;
   sc2.b=9;
   System.out.println("before passing the values:"+(sc.a+sc2.b));//15
   add(sc,sc2);
   System.out.println("after passing the value:"+(sc.a+sc2.b));//39
   System.out.println("this variable is static variable:"+c);//79
 }
}    
