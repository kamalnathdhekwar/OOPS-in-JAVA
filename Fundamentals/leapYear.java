import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class leapYear {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check it is leap year or not ");
        int year = sc.nextInt();
        if(year%400==0)
        {
            System.out.println("the year is a leap year");

        }
        else if(year%100==0)
        {
            System.out.println("the given year is not a leap year");

        }
        else if(year%4==0)
        {
            System.out.println("the given year is  a leap year");
    }
    else{
System.out.println("the given year is not a leap year");
    }

}
}
