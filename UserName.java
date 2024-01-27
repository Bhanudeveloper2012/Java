import java.util.Scanner;
public class UserName
{
    public static void main(String args[])
    {
        Scanner obj1=new Scanner(System.in);
        System.out.println("enter username:");
        String userName = obj1.nextLine();
        System.out.println("username is :" + userName);
        System.out.println("username is of length :"+userName.length());
        obj1.close(); 
    }
}
