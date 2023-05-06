import java.util.Scanner;
public class area {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius;
        System.out.println("enter the radius");
        radius  = sc.nextInt() ;
 double area = 3.1415 * radius *radius ;
 System.out.println("the area of the circle is"+area);
    }
}
