public class Callbyvalue 
{
 int a;
 int b;
 static int c=79;
 static void add(int x,int y)
 {
   x=20;
   System.out.println("this is printing from method:"+(x+y));
   System.out.println("this was accesing from method:"+x);
 }
 public static void main(String[] args) 
 {
   Callbyvalue cv=new Callbyvalue();
   cv.a=3;
   cv.b=4;
   System.out.println("before passing the values:"+(cv.a+cv.b));
   add(cv.a,cv.b);
   System.out.println("after passing the value:"+(cv.a+cv.b));
   System.out.println("this variable is static variable:"+c);
 }
}    

