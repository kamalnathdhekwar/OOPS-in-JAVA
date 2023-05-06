import java.util.Scanner;
public class sumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b ;
        System.out.println("enter first no.");
        a  = sc.nextInt();
        System.out.println("enter second number");
        b = sc.nextInt();
        int sum = a + b ;
        System.out.println("the sum of two number is "+sum);
    }
}
