import java.util.Scanner;  
class Add2  
{ 
    public static void main(String[] args)
    {
        int x,y,sum;
        Scanner obj1=new Scanner(System.in);
        System.out.print("enter value of x:");
        x=obj1.nextInt();
        System.out.print("enter value of y:");
        y=obj1.nextInt();
        sum=sum(x,y);
        System.out.println("the sum of x and y number:" + sum);
        obj1.close();
    }
    public static int sum (int x,int y)
    {
       int sum=x+y;
        return sum;
    }
    
}
