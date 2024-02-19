import java.util.*;
    public class lab2 {
    public static void main(String args[]){
        complexNumber c1 = new complexNumber();
            complexNumber c2 = new complexNumber();
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("enter the first complex no.:");
                System.out.print("real part:");
                c1.real=sc.nextDouble();
                System.out.print("imginary part:");
                c1.img=sc.nextDouble();
                System.out.println("enter the second complex no.:");
                System.out.print("real part:");
                c2.real=sc.nextDouble();
                System.out.print("imginary part:");
                c2.img=sc.nextDouble();
            }
            c1.addComplexNo(c1, c2);
            c1.multiComplexNo(c1 ,c2);
}
}