import java.util.Scanner;

public class first2
{
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner sc = new Scanner(System.in);
        int a , b ;
        System.out.println("enter a ");
        a = sc.nextInt();
        System.out.println("enter b");
       b = sc.nextInt();
        if(a>b)
        {
            System.out.println("a is big");
        }
        else{
            System.out.println("b is big");
        }
System.out.println("");
    }
}