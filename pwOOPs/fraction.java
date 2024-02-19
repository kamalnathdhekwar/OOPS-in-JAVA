
// prgram to find out addition , multiplication , subtraction of two fraction numbers //
public class fraction {

    // addition fuction //
    public static Fraction add(Fraction f1 , Fraction f2)
    {
     int numerator = f1.num*f2.den + f1.den*f2.num;
     int denominator = f1.den*f2.den;
     Fraction f3 = new Fraction(numerator,denominator);
     return f3;
    }
    // multiplication fuction //
    public static Fraction multiplication(Fraction f1 , Fraction f2)
    {
     int numerator = f1.num*f2.num ;
     int denominator = f1.den*f2.den;
     Fraction f4 = new Fraction(numerator,denominator);
     return f4;
    }
     // multiplication fuction //
    public static Fraction subtraction(Fraction f1 , Fraction f2)
    {
     int numerator =f1.num*f2.den - f1.den*f2.num;
     int denominator = f1.den*f2.den;
     Fraction f5 = new Fraction(numerator,denominator);
     return f5;
    }

    // fuction to find hcf
    public static int gcd(int num, int den) {
        int min = Math.min(num, den);
        for (int i = min; i >= 1; i--) {
            if (num % i == 0 && den % i == 0) return i;
                }
        return min;
    
    }

    public static class Fraction {
        int num;
        int den;

        // constructor //
        public Fraction(int num, int den) {
            this.num = num;
            this.den = den;
            simplify();
        }

        public void simplify() {
            int hcf = gcd(num, den);
            num = num / hcf;
            den = den / hcf;

        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(40, 35);
        System.out.println(f1.num + "/" + f1.den);

        Fraction f2 = new Fraction(7,3);
        System.out.println(f2.num+"/"+f2.den);
         
         
         Fraction f3 = add(f1,f2);
         System.out.println("addition is " + f3.num+"/"+f3.den);


         Fraction f5 = subtraction(f1,f2);
         System.out.println("subtraction is " + f5.num+"/"+f5.den);
         
         Fraction f4 = multiplication(f1,f2);
         System.out.println("multiplication is "+f4.num+"/"+f4.den);
    }
}
